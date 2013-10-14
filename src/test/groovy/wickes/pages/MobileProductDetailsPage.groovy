package wickes.pages

import geb.*

class MobileProductDetailsPage extends Page {
    static at = { $('body').classes.contains('pageType-ProductPage') }
}