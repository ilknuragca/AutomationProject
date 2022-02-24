
Feature: SearchProducts

@search_products2
Scenario: TC_20_SearchProduct
When user launches the browser
And user navigates to home page
And user clicks products page button
And verify user is navigated to all products page
And  enters product name in search input and click search button
And verify search products is visible


  And user hover over first product and click add to cart
  And user clicks cart button at product page
  Then verifies that cart page is displayed

  And user clicks signup_login button
  And user verifies login to your account is visible
  And user enters correct email_address and password
    |email_address  |password|
    |iko@gmail.com|123456|

  And user clicks login box
  Then user verifies that logged in