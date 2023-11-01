# Last.fm WEB Functionality Testing
This repository contains Functionality automation tests for Last.fm website using Selenium WebDriver.

## Test Classes
* FakeLoginTest - Simulates login to Last.fm 
* LoginTest - Verifies successful login to Last.fm
* LoginCheckTest - Verifies that user is logged in 
* AddPlaylistTest - Adds a new playlist
* EditDetailsOfPlaylistTest - Edits name and description of a playlist
* AddTrackInPlaylistTest - Adds tracks to a playlist
* RemoveSongFromPlaylistTest - Removes a track from a playlist
* DeletePlaylistTest - Deletes a playlist
* LogOutTest - Logs out from Last.fm

## Technology Stack
* Java
* Selenium WebDriver
* TestNG
* Maven

## How to Run
1. Clone the repository
2. Install Java, Maven and ChromeDriver
3. Run `mvn clean test` on the command line
4. Test report will be generated in `target/surefire-reports/` folder

## Reporting
HTML reports are generated using TestNG. Open `index.html` file in `target/surefire-reports/` to view the test run and results.

## Improvements
* Add more test scenarios to cover major functionality 
* Add logs using a logging framework like Log4J
* Integrate with a CI/CD pipeline
* Add screenshots on failure
* Add data driven testing
* Improve test reliability using Page Object Model

Please feel free to raise an issue for any bugs or suggestions.
