This is an example of incorporating Geb into a Gradle build for TravisPerkins.
It shows the use of Spock and Geb.

The build is setup to work with FireFox and Chrome. Have a look at the `build.gradle` and the `src/test/resources/GebConfig.groovy` files.

The following commands will launch the tests with the individual browsers:

    ./gradlew chromeTest
    ./gradlew firefoxTest

To run with all, you can run:

    ./gradlew test
