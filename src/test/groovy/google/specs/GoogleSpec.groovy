package google.specs

import google.pages.GoogleHomePage
import google.pages.GoogleResultsPage
import google.pages.WikipediaPage
import spock.lang.*
import geb.*
import geb.spock.*

class GoogleSpec extends GebReportingSpec {

    def "the first link should be wikipedia"() {
        when:
        to GoogleHomePage

        and:
        q = "wikipedia"

        then:
        at GoogleResultsPage  // This relies on Javascript and will not be testable with htmlunit

        and:
        firstResultLink.text() == "Wikipedia"

        when:
        firstResultLink.click()

        then:
        waitFor { at WikipediaPage }
    }

}
