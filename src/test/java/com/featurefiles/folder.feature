Feature: Order products in Amazon application

Scenario: Home page in amazon application
Given user launch the application url
Then user clicks on signin button

Scenario: Sign in module
When user enter mobile number in mobile number field
Then click on continue button
When enter password 
Then click on sign in button

Scenario: Home page after signed in
When enter iphone in search module

Scenario: Product page of amazon application
When select product from the product page
Then click on add to cart

Scenario: Product quantity page in application
When capture the screen 
Then Assert the price and put it in excel 




