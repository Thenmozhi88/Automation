Feature: Automate Demo website
Scenario: GitJenkinIntegration process
Given Do BrowserSetup
When Go to URL
When Enter user credentials
Then click Login

Scenario: Register Credentials
Given enter email address and password
|thenmozhi1102@gmail.com|Shyam@2210| 
When click on Register
Then close driver


