#Author: dianacaro46@gmail.com

Feature: Product management


	Scenario: Add Product type Laptops when user login
		Given LogIn in DemoBlaza with existing user
		And I Add product Laptops
		When Add product Laptops with MacBook Pro
		Then Show the message Product added

