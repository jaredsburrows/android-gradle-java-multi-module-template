# Android Gradle Java Multi Module Template 

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)
[![TravisCI Build](https://img.shields.io/travis/jaredsburrows/android-gradle-java-mutli-module-template/master.svg)](https://travis-ci.org/jaredsburrows/android-gradle-java-mutli-module-template)
[![Coveralls Coverage](https://img.shields.io/coveralls/jaredsburrows/android-gradle-java-mutli-module-template/master.svg?label=Code%20Coverage)](https://coveralls.io/github/jaredsburrows/android-gradle-java-mutli-module-template?branch=master)
[![Twitter Follow](https://img.shields.io/twitter/follow/jaredsburrows.svg?style=social)](https://twitter.com/jaredsburrows)

This demonstrates running source analysis tools(PMD, Findbugs, Checkstyle, Lint and Jacoco) on multi module build with an Android app module, Android library module and a Java module.

## Building and Running

This project builds with [Gradle](https://gradle.org/) and the Android Build [tools](https://developer.android.com/studio/index.html).

**Build the APK:**

    $ gradlew assembleDebug

**Install the APK:**

    $ gradlew installDebug

**Run the App:**

    $ gradlew runDebug

## Testing

**Run [Junit](http://junit.org/junit4/) the Unit Tests per module(debug + release):**

    $ gradlew test

**Run [Junit](http://junit.org/junit4/) the Unit Tests for `android-app` and `android-library` modules:**

    $ gradlew testDebug
    
**Run [Espresso](https://developer.android.com/training/testing/ui-testing/espresso-testing.html) instrumentation tests for `android-app` and `android-library` modules:**

    $ gradlew connectedDebugAndroidTest

## Reports

**Generate [PMD](https://pmd.github.io/) Report per module:**

    $ gradlew pmd

**Generate [JacocoReport](http://www.eclemma.org/jacoco/) Test Coverage Report per module:**

    $ gradlew jacocoReport

**Generate [FindBugs](http://findbugs.sourceforge.net/) Report per module:**

    $ gradlew findBugs

**Generate [Checkstyle](http://checkstyle.sourceforge.net/) Report per module:**

    $ gradlew checkstyle

**Generate [Lint](http://developer.android.com/tools/help/lint.html) Report for `android-app` and `android-library` modules:**

    $ gradlew lintDebug
