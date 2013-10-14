package google.pages

import geb.*

class WikipediaPage extends Page {
    static at = { title ==~ "Wikipedia.*" }
}