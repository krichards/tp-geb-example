package wickes.specs

import geb.spock.*
import org.openqa.selenium.Keys
import spock.lang.Unroll
import wickes.pages.MobileHomePage
import wickes.pages.MobileProductDetailsPage
import wickes.pages.MobileResultsPage

@Unroll('#scenario')
class MobileSearchWickesSpec extends GebReportingSpec {

    def "searching for gold should find screws"() {
        when:
        to MobileHomePage

        and:
        searchText = searchTerm
        // searchButton.click() // Click doesnt work on chrome because the dynamic options overlaps the button
        searchText << Keys.chord(Keys.ENTER)

        then:
        at MobileResultsPage

        and:
        firstResultLink.text() == expectedLink

        when:
        firstResultLink.click()

        then:
        waitFor { at MobileProductDetailsPage }

        and:
        title == "${productCategories} | Products | Wickes.co.uk"

        where:
        scenario          | searchTerm | expectedLink                            | productCategories
        'search for gold' | 'gold'     | 'Wickes Ultra Gold Screws 6x100mm PK50' | 'Wickes Ultra Gold Screws 6x100mm PK50 | Ultra Gold Screws | Screws | Building Materials'
        'search for gun'  | 'gun'      | 'Cartridge Gun'                         | 'Cartridge Gun | Sealant Guns | Sealants | Sealants & Adhesives'
    }

}