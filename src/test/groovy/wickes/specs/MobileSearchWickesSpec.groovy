package wickes.specs

import geb.spock.*
import wickes.pages.MobileHomePage
import wickes.pages.MobileProductDetailsPage
import wickes.pages.MobileResultsPage

class MobileSearchWickesSpec extends GebReportingSpec {

    def "searching for gold should find screws"() {
        when:
        to MobileHomePage

        and:
        searchText = "gold"
        searchButton.click()

        then:
        at MobileResultsPage

        and:
        firstResultLink.text() == "Wickes-Ultra-Gold-Screws-6x100mm"

        when:
        firstResultLink.click()

        then:
        waitFor { at MobileProductDetailsPage }
    }

}