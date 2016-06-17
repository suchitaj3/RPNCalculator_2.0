Feature: Test
Scenario Outline: Testing
Given user enter <something>
Then result be <everything>

Examples:
|something|everything|
|"2,2,+"|"4"|
|"2,2,-"|"0"|
|"2,2,3,+,*"|"10"|
|"2,2,/"|"1"|
|"4,4,%"|"1"|