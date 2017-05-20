Feature: Adding

	Scenario Outline: Add two numbers
	  Given the input "2+3"
	  When the calculator is run
	  Then the output should be "6"

	  Examples:
	  | input | output |
	  | 2+2   | 4      |  
	  | 98+1  | 99     |
 



