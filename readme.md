This is an example of incorporating Geb and Spock into a Gradle build for TravisPerkins.

http://www.gebish.org/ - Overview and reference manual
http://spockframework.org - Spock testing framework

The build is setup to work with FireFox, Chrome and Htmlunit.
Have a look at the `build.gradle` and the `src/test/resources/GebConfig.groovy` files.

The following commands will launch the tests with the individual browsers:

    ./gradlew chromeTest
    ./gradlew firefoxTest
    ./gradlew htmlunitTest

Note:Some tests may not pass with htmlUnit as it does not support javascript. To run with all, you can run:

    ./gradlew test

To run an individual test in IntelliJ (or other) add the following to the default JVM system properties of the test runner.

'-Dgeb.driver=htmlunit -Djava.net.preferIPv4Stack=true -Dwebdriver.chrome.driver=C:\Users\it_training\IdeaProjects\chromedriver.exe'


