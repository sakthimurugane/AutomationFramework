 Feature: Login page feature
 
# Scenario: Login page title
# Given user is on home page with url "https://www.rijksmuseum.nl/en"
# When user gets the title of the page
# Then page title should be "Rijksmuseum"
 
# Scenario: Forgot Password link
# Given user is on login page
# Then forgot password link should be displayed
 
 Scenario: Login with valid credentials
 Given user is on home page with url "https://www.rijksmuseum.nl/en"
 When user accept cookies consent
 And user clicks on Login link
 When user enters username "kalaiarasishiva@gmail.com"
 And user enters password "Suresh#4"
 And user clicks on Login button
 Then user gets the title of the Home page
# And page title must be "Rijksmuseum Amsterdam, home of the Dutch masters"
 And page title must be "Rijksmuseum"