
Feature: HomePage Search Functionality

Scenario Outline: Verify the home page search button is working as per the requirement

Given User landed on Home page
When User search <Name> in the search box
When User search offer page item "Tom"
 


Examples:

|Name|
|Tom |
| Beet |