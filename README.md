# gradle-example

This is an example Gradle project that builds an executable Java application using the "application" plugin.
It can be used to try out various Gradle features for Java development, such as:

* Running the application (`gradle run`)
* Testing it (`gradle test`)
  * By default, you will only see any output about testing if tests fail.
  * `gradle test` automatically generates a HTML report about all tests, see `build/reports/tests/index.html`.
* Making a distributable version of it (`gradle installDist` - output is in `build/install`)
* Generating Javadocs (`gradle javadoc` - output is in `build/docs`)

## Running Gradle
co
This project includes a [Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html) so you don't need to download and install Gradle yourself. To use this wrapper, replace "gradle" with "gradlew" when running tasks, e.g. `gradlew javadoc`. It will automatically download Gradle for use with the current project.

If you're on Windows:
  * Start up a command prompt and browse to this directory
    * Tip: You can also hold shift and right click in this folder to get an option to do this
  * Run a Gradle task like this: `gradlew task`, where "task" is the task you want to run (e.g. "run")
  
If you're on Mac OS X or Linux: 
  * Open a new terminal and browse to this directory
  * Run a Gradle task like this: `./gradlew task`, where "task" is the task you want to run
