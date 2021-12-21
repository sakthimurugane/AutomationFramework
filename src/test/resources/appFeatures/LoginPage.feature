 Feature: Login page feature
 
 Scenario: Login with valid credentials
 Given user is on home page with url "https://www.rijksmuseum.nl/en"
 And user accept cookies consent
 When user clicks on Login link
 And user enters username "kalaiarasishiva@gmail.com"
 And user enters password "Suresh#4"
 And user clicks on Login button
 Then wait for 5 seconds to load avatar card
 And logged in avathar card should be "kA"
 
 Scenario: Create a first collection
 Given user is on home page with url "https://www.rijksmuseum.nl/en"
 And user accept cookies consent
 When user clicks on Login link
 And user enters username "kalaiarasishiva@gmail.com"
 And user enters password "Suresh#4"
 And user clicks on Login button
 Then wait for 5 seconds to load avatar card
 And logged in avathar card should be "kA"
 When user clicks on hamburger icon
 And user clicks on explore studio link
 Then user gets the title of the page
 And page title must be "Rijksstudio - Rijksmuseum"
 When user clicks on artist name "Johannes Vermeer"
 Then user gets the title of the page
 And page title must be "Johannes Vermeer - Artists - Rijksstudio - Rijksmuseum"
 Given user clicks on heart button for art "The Milkmaid"
 When user selects existing collection set "My first collection"
 Then add to my collection dialog should close
 Given user navigates to my profile by clicking "kA" avatar
 And clicks on Get started button in profile
 When user selects collection "My first collection" in profile
 Then "The Milkmaid" should be present in Profile collection
 
 Scenario: Use Advanced Search function
 Given user is on home page with url "https://www.rijksmuseum.nl/en"
 And user accept cookies consent
 When user clicks on Login link
 And user enters username "kalaiarasishiva@gmail.com"
 And user enters password "Suresh#4"
 And user clicks on Login button
 Then wait for 5 seconds to load avatar card
 And logged in avathar card should be "kA"
 When user clicks on hamburger icon
 And user clicks on explore studio link
 Then user gets the title of the page
 And page title must be "Rijksstudio - Rijksmuseum"
 Given user clicks on search studio button
 And user clicks on Advanced search link
 When user enters "Utagawa" in Name field and selects "Kuniyoshi"
 And user enters title "De CHofu Tama"
 And user select Image only checkbox
 And user enters from year "1847"
 And user enters to year "1847"
 And user clicks on find button
 