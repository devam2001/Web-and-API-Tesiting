Last.fm WEB UI Testing Readme
This repository contains automated tests for the Last.fm web UI using Selenium WebDriver and TestNG.

Prerequisites
Java 8 or later
Maven 3.6.3 or later
ChromeDriver (or other WebDriver executable) installed and added to system path
Getting started
Clone this repository
Navigate to the project directory in the terminal/command prompt
Run mvn clean test to execute all tests or run specific test classes by specifying the class name as follows:
Copy
mvn clean test -Dtest=org.last.fm.FakeLoginTest
```
The test results will be outputted to the console and also saved to the target/surefire-reports directory
Test classes
org.last.fm.FakeLoginTest - Tests if the fake login functionality is working as expected.
org.last.fm.LoginTest - Tests if a user can successfully log in to Last.fm.
org.last.fm.LoginCheckTest - Tests if the user's login details are saved and displayed correctly.
org.last.fm.AddPlaylistTest - Tests if a user can successfully create a new playlist.
org.last.fm.EditDetailsOfPlayistTest - Tests if a user can successfully edit the details of a playlist.
org.last.fm.AddTrackinPlaylistTest - Tests if a user can successfully add a track to a playlist.
org.last.fm.RemoveSongFromPlaylistTest - Tests if a user can successfully remove a track from a playlist.
org.last.fm.DeletePlaylistTest - Tests if a user can successfully delete a playlist.
org.last.fm.LogOutTest - Tests if a user can successfully log out of Last.fm.
Technologies used
Selenium WebDriver
TestNG
Maven
Contributors
Your Name - Maintainer
License
This project is licensed under the MIT License.
