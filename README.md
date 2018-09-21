  About | Features | Installation | Documentation | Support | Author | Release history | Useful links
About

Designed as a simple to use REST API wrapper to expose communication with the istSOS WA REST interface.

Serves a starting point for developing Android apps for istSOS platform.
Features

    Configured as a Gradle-based project to handle dependencies
    Developed to handle HTTP requests asynchronously using [AsyncHTTPClient] (https://github.com/AsyncHttpClient/async-http-client)
    Handles JSON (de)serialization using [Gson] (https://github.com/google/gson)
    Built for Java 8 and above
    Backwards compatibility to Java 7
    Usable as a library for Android development

Installation

There are two options for using this library:

    Look inside the following folders path build -> libs and find the java-core.jar
    git clone this repo, then create the jar using Gradle command gradle buildJar in a terminal

Documentation

    JavaCore UserGuide: Tutorial on how to get started.
    JavaCore Version History: see release history of library.

Support (Requests and issues)

Open an issue in the GitHub issue tracker for bugs and requesting new features.
Author

Florin-Daniel Cioloboc (@florincioloboc) implemented during Google Summer of Code 2016.

Mentors from istSOS: Mirko Cardoso, Milan Antonovic.
Release history

    

Useful links

    istSOS website
    istSOS mailing list
    GSoC development log on OSGeo wiki
