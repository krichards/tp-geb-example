package wickes.pages

import geb.*

class MobileHomePage extends Page {

    static url = "http://m.wickes.co.uk"
    static at = { title ==~ "Wickes.*" }

    static content = {
        form { $('form[name="search_form"]')}
        searchText { form.find('input[name="text"]') }
        searchButton  { form.find('.accmob-mainSearch-button') }
    }
}