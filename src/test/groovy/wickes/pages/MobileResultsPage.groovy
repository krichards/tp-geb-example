package wickes.pages

import geb.*

class MobileResultsPage extends Page {
    static at = { results }
    static content = {
        results(wait: true) { $("#resultsList li") }
        result { i -> results[i] }
        resultLink { i -> result(i).find("a h2")[0] }
        firstResultLink { resultLink(0) }
    }
}