HTML Audio Notifier
====================

A simple build notifier for Jenkins that intercepts all build-events and plays sounds directly in a browser
when builds fail.

Development
-----------
* https://wiki.jenkins-ci.org/display/JENKINS/Extend+Jenkins
* https://wiki.jenkins-ci.org/display/JENKINS/Unit+Test

Creating an eclipse-project
---------------------------
mvn -DdownloadJavadocs=true -DdownloadSources=true -DdownloadJavadocs=true eclipse:eclipse

Running the plugin locally
--------------------------
mvn hpi:run

Running the unit tests
----------------------
mvn clean test
Note that 'clean' is required for all HudsonTestCases, without it they fail randomly..
