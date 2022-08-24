Feature: demoblaze

Scenario Outline: Login in demoblaze fail

Given fail the user Login in demoblaze 
When fail the user enters <failusuario>  login usuario
When fail the user enters <failclave> login clave
And fail the user clicks the login button
Then fail the user appears in page

Examples:
|failusuario|failclave|
|balbi2@pepito.com|roberto2000|

Scenario Outline: Login demoblaze

Given the user Login in demoblaze
When the user enters <usuario>  login usuario
When the user enters <clave> login clave
And the  user clicks the login button
Then the <nombre> user appears in page
Then the user logout in page
Examples:
|usuario|clave|nombre|
|balbi2@yahoo.com|roberto1969|balbi2@yahoo.com|

Scenario Outline: Add to cart

Given the user add to cart a product in demoblaze
When the user select a <categoria> products
When the user clicks over product
And the  user clicks the button add to cart
Examples:
|categoria|
|Laptops|

Scenario Outline: SignIn

Given the user SigIn in demoblaze
When the user enters <usuario> user
When the user enters <clave> pass
And the  user clicks the SigIn button
Examples:
|usuario|clave|nombre|
|balbi2@yahoo.co2|roberto1969|balbi2@yahoo.co1|













