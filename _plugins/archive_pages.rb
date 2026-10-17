# License: MIT
#
# Adds an archive page for every year and every month that has posts,
# e.g. /archive/2010/ and /archive/2010/08/, rendered with _layouts/archive-period.html.
# The overview at /archive/ is archive.markdown.

module ChemBlaIcs
  class ArchivePagesGenerator < Jekyll::Generator
    safe true
    priority :low

    def generate(site)
      # newest first, like the overview
      posts = site.posts.docs.sort_by(&:date).reverse
      years = posts.group_by { |post| post.date.year }

      periods = []
      years.each do |year, year_posts|
        months = year_posts.group_by { |post| post.date.month }
        periods << { "path" => "/archive/#{year}", "title" => year.to_s,
                     "year" => year,
                     "months" => months.map { |month, month_posts|
                       { "number" => format("%02d", month),
                         "name" => Date::MONTHNAMES[month],
                         "posts" => month_posts }
                     } }
        months.each do |month, month_posts|
          name = Date::MONTHNAMES[month]
          periods << { "path" => "/archive/#{year}/#{format('%02d', month)}",
                       "title" => "#{name} #{year}", "year" => year,
                       "month_name" => name, "posts" => month_posts }
        end
      end

      # neighbours: the list is ordered year page, its months..., so link within each kind
      [periods.select { |p| p["months"] }, periods.select { |p| p["posts"] }].each do |kind|
        kind.each_with_index do |period, i|
          period["newer"] = kind[i - 1] if i > 0
          period["older"] = kind[i + 1]
        end
      end

      periods.each do |period|
        page = Jekyll::PageWithoutAFile.new(site, site.source, period["path"], "index.html")
        page.data["layout"] = "archive-period"
        page.data["title"] = period["title"]
        page.data["year"] = period["year"]
        page.data["month_name"] = period["month_name"]
        page.data["months"] = period["months"]
        page.data["posts"] = period["posts"]
        page.data["newer"] = link(period["newer"])
        page.data["older"] = link(period["older"])
        page.data["sitemap"] = false
        site.pages << page
      end
    end

    private

    def link(period)
      period && { "url" => "#{period['path']}/", "title" => period["title"] }
    end
  end
end
