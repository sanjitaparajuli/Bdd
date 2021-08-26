Feature: TechFios login functionality validation 

Background: 
	Given user is on the TechFios login page 
	@Smoke	
Scenario Outline: user should be able to log in with valid credentials 
	When user enters username as "<userName>" 
	When user enters password as "<password>"
	When user clicks on sign in button 
	Then user should land on dashboard page
	When user clicks the Bank & Cash button
	When user clicks New Account button	
	Then user should see add new account page
	When user enters AccountTitle as "<Accounttitle>"
	When user enters Description as "<description>"
	When user enters Initial Balance as "<Balance>" 
	When user enters Account Number as "<accountNumber>" 
	When user enters Contact Person as "<contactPerson>"
	When user enters Phone as "<phone>"
	When user enters Internet Banking URL as "<bankUrl>"
	When user clicks the Submit button
	Examples:
	|userName|password|Accounttitle|description|Balance|accountNumber|contactPerson|phone|bankUrl|
	|demo@techfios.com|abc123|Checking|Personal Account|10000|56724|Sanjita Parajuli|267 789 3452|techfios.com|
	



















