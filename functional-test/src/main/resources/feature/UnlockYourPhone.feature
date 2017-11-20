Feature: Unlock your phone

  This feature shows End-to-End journey for Unlock your phone.

  Background:
    Given The user lands on homepage for UMM

  Scenario: This is a happy path for PayM user where user has password (used to contact customer care) in UMM
    When The user is Pay Monthly
    And user selects phone type as Palm Pre
    And user enters mobile number as 447704610259
    And user checks if alternate number is empty
    And user enters first name as test
    And user enters last name as test
    And user enters email address as test@mail.com
    And confirms email address as test@mail.com
    And clicks Next button
    And enters Character 2 of password as 1
    And enters Character 3 of password as 1
    And clicks on Next button
    And user enters model name of the phone as iphone 6s
    And enters Valid IMEI number of the phone as 354376069998017
    And submits the query

    Then Unlock phone request is submitted successfully

#  Scenario: This is a happy path for PayM user where user does not have password (used to contact customer care) in UMM
#    When The user is Pay Monthly
#    And user selects phone type as Palm Pre
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    And clicks on I dont know my password
#    And enters amount of last bill as 30
#    And enters date of last bill as 03/31/2017
#    And enters tariff name as test
#    And clicks on Next button
#    And user enters model name of the phone as iphone 6s
#    And enters Valid IMEI number of the phone as 354376069998017
#    And submits the query
#    Then Unlock phone request is submitted successfully
#
#  Scenario Outline: This is a error scenario of 2nd and Character 3 from security password missing for PayM user where user has password (used to contact customer care)
#    When The user is Pay Monthly
#    And user selects phone type as Palm Pre
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    And enters Character 2 of password as <Character 2>
#    And enters Character 3 of password as <Character 3>
#    And clicks on Next button
#    Then Error message for Character 2 is displayed as <error1>
#    Then Error message for Character 3 is displayed as <error2>
#
#    Examples:
#      | Character 2  | Character 3 | error1                   | error2                   |
#      | 1              |               |                          | Fill in to continue.|
#      |                | 1             | Fill in to continue.|                          |
#      |                |               | Fill in to continue.| Fill in to continue.|
#
#  Scenario Outline: This is a error scenario of invalid amount of last bill for PayM user where user don't have password (used to contact customer care)
#    When The user is Pay Monthly
#    And user selects phone type as Palm Pre
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    And clicks on I dont know my password
#    And enters date of last bill as 03/31/2017
#    And enters amount of last bill as <amount of last bill>
#    And enters tariff name as test
#    And clicks on Next button
#    Then Error for amount of last bill is displayed as <error1>
#
#    Examples:
#      | amount of last bill  |error1                   |
#      |                      |Fill in to continue.|
#      | 333.                 |The amount you supplied isn't valid. Enter again in the format 0.00, with no currency symbols.|
#      | 33.333               |The amount you supplied isn't valid. Enter again in the format 0.00, with no currency symbols.|
#
#  Scenario Outline: This is a error scenario of empty date of last bill and empty current tariff for PayM user where user don't have password (used to contact customer care)
#    When The user is Pay Monthly
#    And user selects phone type as Palm Pre
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    And clicks on I dont know my password
#    And enters date of last bill as <date of last bill>
#    And enters amount of last bill as 50
#    And enters tariff name as <current tariff>
#    And clicks on Next button
#    Then Error for date of last bill is displayed as <error1>
#    Then Error for current tariff is displayed as <error2>
#
#    Examples:
#      | date of last bill | current tariff |error1                   |error2                   |
#      |                   |      test      |Fill in to continue.|                         |
#      |      03/31/2017   |                |                         |Fill in to continue.|
#      |                   |                |Fill in to continue.|Fill in to continue.|
#
#  Scenario: This is scenario for Non-O2 number
#    When The user is Pay Monthly
#    And user selects phone type as Palm Pre
#    And user enters mobile number as 447704610200
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    Then The Error message is displayed as This is NonO2 number. If you are an O2 customer, check your number and try again.
#
#
#  Scenario: This is a happy path for Business user where user has password (used to contact customer care) in UMM
#    When The user is Business
#    And user selects phone type as Apple iPhone
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    And enters company name as test
#    And enters 1st line of address as test
#    And enters postcode as SL0 9QP
#    And enters security password as sec1234
#    And clicks on Next button
#    And user enters model name of the phone as iphone 6s
#    And enters Valid IMEI number of the phone as 354376069998017
#    And submits the query
#    Then Unlock phone request is submitted successfully
#
#  Scenario Outline: This is a error scenario of 1st line of address empty for Business user
#    When The user is Business
#    And user selects phone type as Apple iPhone
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    And enters company name as test
#    And enters 1st line of address as <1st line of address>
#    And enters postcode as SL0 9QP
#    And enters security password as sec1234
#    And clicks on Next button
#    Then Error message for 1st line of address is displayed as <error1>
#
#    Examples:
#    |1st line of address|error1                   |
#    |                   |Fill in to continue.|
#
#  Scenario Outline: This is a error scenario of invalid postcode for Business user
#    When The user is Business
#    And user selects phone type as Apple iPhone
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    And enters company name as test
#    And enters 1st line of address as test
#    And enters postcode as <postcode>
#    And enters security password as sec1234
#    And clicks on Next button
#    Then Error for postcode is displayed as <error1>
#
#    Examples:
#      |postcode|error1                   |
#      |        |Fill in to continue.|
#      |SL09Q   |The postcode you supplied doesn't appear to be valid.|
#      |SL09QP3 |The postcode you supplied doesn't appear to be valid.|
#      |@#$%^&* |The postcode you supplied doesn't appear to be valid.|
#
#  Scenario Outline: This is a error scenario of empty security password for Business user
#    When The user is Business
#    And user selects phone type as Apple iPhone
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    And enters company name as test
#    And enters 1st line of address as test
#    And enters postcode as SL0 9QP
#    And enters security password as <security password>
#    And clicks on Next button
#    Then Error for security password is displayed as <error1>
#
#    Examples:
#      |security password|error1                   |
#      |                 |Fill in to continue.|
#
#
#  Scenario: This is a happy path for Business user where user does not have password (used to contact customer care) in UMM
#    When The user is Business
#    And user selects phone type as Apple iPhone
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    And clicks on I dont know my password
#    And enters company name as test
#    And enters 1st line of address as test
#    And enters postcode as SL0 9QP
#    And enters amount of last bill as 30
#    And enters date of last bill as 03/31/2017
#    And clicks on Next button
#    And user is on additional information page
#    And user enters model name of the phone as iphone 6s
#    And enters Valid IMEI number of the phone as 354376069998017
#    And submits the query
#    Then Unlock phone request is submitted successfully
#
#  Scenario: This is a check on cancel button functionality
#    When The user is Business
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks on cancel button
#    Then The user lands on homepage for UMM
#
#  Scenario: This is a check on if previous and next buttons retain data on 1st and 2nd page
#    When The user is Pay Monthly
#    And user selects phone type as Palm Pre
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    And enters Character 2 of password as 1
#    And enters Character 3 of password as 1
#    And clicks on Next button
#    And user enters model name of the phone as iphone 6s
#    And enters Valid IMEI number of the phone as 354376069998017
#    And clicks on previous button
#    Then User lands on Security details page
#    And clicks on previous button
#    Then user lands on homepage
#    And clicks Next button
#    Then User lands on Security details page
#
#
#  Scenario: This is a scenario for PayG user in UMM
#    When The user is Pay As You Go
#    And user selects phone type as Palm Pre
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    Then User lands on Security details page
#    And enters Character 2 of password as 1
#    And enters Character 3 of password as 1
#    And user enters current airtime balance 30
#    And user enters Frequent number 1 07704610258
#    And user enters Frequent number 2 447704610257
#    And clicks on Next button
#    And user enters model name of the phone as iphone 6s
#    And enters Valid IMEI number of the phone as 354376069998017
#    And submits the query
#    Then Unlock phone request is submitted successfully
#
#  Scenario Outline: This is a negative scenario of invalid airtime balance for PayG user
#    When The user is Pay As You Go
#    And user selects phone type as Palm Pre
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    Then User lands on Security details page
#    And enters Character 2 of password as 1
#    And enters Character 3 of password as 1
#    And user enters current airtime balance <current airtime balance>
#    And user enters Frequent number 1 07704610258
#    And user enters Frequent number 2 447704610257
#    And clicks on Next button
#    Then Error for current airtime balance is displayed as <error1>
#
#    Examples:
#      | current airtime balance  |error1                                                                                        |
#      |                          |Fill in to continue.                                                                     |
#      | 333.                     |The amount you supplied isn't valid. Enter again in the format 0.00, with no currency symbols.|
#      | 33.333                   |The amount you supplied isn't valid. Enter again in the format 0.00, with no currency symbols.|
#
#  Scenario Outline: This is a negative scenario of invalid Frequent number 1 for PayG user
#    When The user is Pay As You Go
#    And user selects phone type as Palm Pre
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    Then User lands on Security details page
#    And enters Character 2 of password as 1
#    And enters Character 3 of password as 1
#    And user enters current airtime balance 30
#    And user enters Frequent number 1 <Frequent number 1>
#    And user enters Frequent number 2 07704610257
#    And clicks on Next button
#    Then Error for Frequent number 1 is displayed as <error1>
#
#    Examples:
#      |Frequent number 1  |error1                                                                          |
#      |770461025                   |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |77046102583                 |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test                        |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |&($@$&                      |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |+*@$770461025               |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |7704test                    |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test7704                    |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test7704(*^@$               |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |                            |Fill in to continue.                                                       |
#
#  Scenario Outline: This is a negative scenario of invalid Frequent number 2 for PayG user
#    When The user is Pay As You Go
#    And user selects phone type as Palm Pre
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    Then User lands on Security details page
#    And enters Character 2 of password as 1
#    And enters Character 3 of password as 1
#    And user enters current airtime balance 30
#    And user enters Frequent number 1 07704610258
#    And user enters Frequent number 2 <Frequent number 2>
#    And clicks on Next button
#    Then Error for Frequent number 2 is displayed as <error1>
#
#    Examples:
#      |Frequent number 2  |error1                                                                          |
#      |770461025                   |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |77046102573                 |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test                        |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |&($@$&                      |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |+*@$770461025               |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |7704test                    |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test7704                    |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test7704(*^@$               |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |                            |Fill in to continue.                                                       |
#
#  Scenario Outline: Check if error message for account type and Phone type is "Fill in to continue."
#    When The user is <account type>
#    And user selects phone type as <phone type>
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    Then The Error message for account type is displayed as <error1>
#    Then The Error message for phone type is displayed as <error2>
#
#    Examples:
#      | account type  | phone type    |error1                   |error2                   |
#      | Select tariff | Palm Pre      |Fill in to continue.||
#      | Business      | Please phone ||Fill in to continue.|
#      | Please tariff | Please phone |Fill in to continue.|Fill in to continue.|
#
#  Scenario Outline: Check if error message for mobile number (when less, more digits, special characters or alphabets entered, or combination of alphanumerics with special characters) is "Fill in to continue."
#
#    When The user is Pay As You Go
#    And user selects phone type as Palm Pre
#    And user enters mobile number as <mobile number>
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    Then The Error message for mobile number is displayed as <error1>
#    But user clears the invalid mobile number
#
#    Examples:
#    |mobile number  |error1                                                                          |
#    |77000000       |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#    |77000000123    |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#    |test           |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#    |&($@$&         |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#    |+*@$7700000012 |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#    |7700test       |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#    |test7700       |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#    |test7700(*^@$  |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#    |               |Fill in to continue.                                                       |
#
#  Scenario Outline: This is error scenario for alternate mobile number (when less, more digits, special characters or alphabets entered, or combination of alphanumerics with special characters)
#
#    When The user is Pay As You Go
#    And user selects phone type as Palm Pre
#    And user enters mobile number as 7704610259
#    And user enters alternate mobile number as <alternate mobile number>
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    Then The Error message for alternate mobile number is displayed as <error1>
#    But user clears the invalid mobile number
#
#    Examples:
#      |alternate mobile number  |error1                                                                          |
#      |77000000                 |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |77000000123              |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test                     |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |&($@$&                   |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |+*@$7700000012           |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |7700test                 |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test7700                 |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test7700(*^@$            |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#
#  Scenario Outline: This is error scenario for first name field.
#
#    When The user is Business
#    And user selects phone type as Nokia
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as <first name>
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#
#    Then The Error message is displayed as <error1>
#
#    Examples:
#    |first name|error1|
#    |          |Fill in to continue.|
#
#  Scenario Outline: This is error scenario for last name field.
#
#    When The user is Business
#    And user selects phone type as Nokia
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as <last name>
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    Then The Error message is displayed as <error1>
#
#    Examples:
#      |last name |error1                   |
#      |          |Fill in to continue.|
#
#  Scenario Outline: Check if error message for email address and confirm email address (empty) is "Fill in to continue."
#
#    When The user is Pay Monthly
#    And user selects phone type as Palm Pre
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as <email>
#    And confirms email address as <confirm email>
#    And clicks Next button
#    Then The Error message for email is displayed as <error1>
#    Then The Error message for confirm email is displayed as <error2>
#
#
#    Examples:
#      | email   | confirm email | error1                                                   | error2                                                                  |
#      |         |               | Fill in to continue.                                | Fill in to continue.                                               |
#      |  t@m.co |               |                                                          | Fill in to continue.                                               |
#      |         |    t@m.co     | Fill in to continue.                                | The email addresses you supplied don't match. Check them and try again. |
#      |  @m.co  |    t@m.co     |The email address you supplied doesn't appear to be valid.| The email addresses you supplied don't match. Check them and try again. |
#      |  t@.co  |    t@m.co     |The email address you supplied doesn't appear to be valid.| The email addresses you supplied don't match. Check them and try again. |
#      |  t@mco  |    t@m.co     |The email address you supplied doesn't appear to be valid.| The email addresses you supplied don't match. Check them and try again. |
#      |  t@m.c  |    t@m.co     |The email address you supplied doesn't appear to be valid.| The email addresses you supplied don't match. Check them and try again. |
#      |  t@m.   |    t@m.co     |The email address you supplied doesn't appear to be valid.| The email addresses you supplied don't match. Check them and try again. |
#      |  tm.co  |    t@m.co     |The email address you supplied doesn't appear to be valid.| The email addresses you supplied don't match. Check them and try again. |
#      |  @m.co  |    @m.co      |The email address you supplied doesn't appear to be valid.| The email address you supplied doesn't appear to be valid.              |
#      |  t@.co  |    t@.co      |The email address you supplied doesn't appear to be valid.| The email address you supplied doesn't appear to be valid.              |
#      |  t@mco  |    t@mco      |The email address you supplied doesn't appear to be valid.| The email address you supplied doesn't appear to be valid.              |
#      |  t@m.c  |    t@m.c      |The email address you supplied doesn't appear to be valid.| The email address you supplied doesn't appear to be valid.              |
#      |  t@m.   |    t@m.       |The email address you supplied doesn't appear to be valid.| The email address you supplied doesn't appear to be valid.              |
#      |  tm.co  |    tm.co      |The email address you supplied doesn't appear to be valid.| The email address you supplied doesn't appear to be valid.              |
#
#
#  Scenario Outline: This is a scenario when model of the phone field is empty on additional information page (3rd page)
#    When The user is Business
#    And user selects phone type as Apple iPhone
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    And enters company name as test
#    And enters 1st line of address as test
#    And enters postcode as SL0 9QP
#    And enters security password as sec1234
#    And clicks on Next button
#    And user enters model name of the phone as <model of phone>
#    And enters Valid IMEI number of the phone as 354376069998017
#    And submits the query
#    Then Error for model of phone is displayed as <error1>
#
#    Examples:
#    |model of phone|error1                   |
#    |              |Fill in to continue.|
#
#  Scenario Outline: This is a scenario when IMEI number is invalid on additional information page (3rd page)
#    When The user is Business
#    And user selects phone type as Apple iPhone
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    And enters company name as test
#    And enters 1st line of address as test
#    And enters postcode as SL0 9QP
#    And enters security password as sec1234
#    And clicks on Next button
#    And user enters model name of the phone as iPhone 6s
#    And enters Valid IMEI number of the phone as <IMEI number>
#    And submits the query
#    Then Error for IMEI number is displayed as <error1>
#
#    Examples:
#      |IMEI number      |error1                                                                |
#      |35437606999801   |The supplied IMEI dosen't appear to be valid. It must be of 15 digits.|
#      |3543760699980177 |The supplied IMEI dosen't appear to be valid. It must be of 15 digits.|
#      |                 |Fill in to continue.                                             |
#
#  Scenario Outline: This is a scenarios that checks for second page availability for all 3 account types i.e. PayM, PayG and Business with acceptable first name with numeric, special characters and combination of both. (without alphabetic characters).
#    When The user is <account type>
#    And user selects phone type as Palm Pre
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as <first name>
#    And user enters last name as test
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    Then User lands on page <desired page>
#
#    Examples:
#
#      |account type |first name|desired page          |
#      |Pay Monthly  |7891      |Your security details |
#      |Pay Monthly  |%^#$      |Your security details |
#      |Pay Monthly  |7891%@#^  |Your security details |
#      |Pay As You Go|7891      |Your security details |
#      |Pay As You Go|%^#$      |Your security details |
#      |Pay As You Go|7891%@#^  |Your security details |
#      |Business     |7891      |Your security details |
#      |Business     |%^#$      |Your security details |
#      |Business     |7891%@#^  |Your security details |
#
#  Scenario Outline: This is a scenarios that checks for second page availability for all 3 account types i.e. PayM, PayG and Business with acceptable last name with numeric, special characters and combination of both. (without alphabetic characters).
#    When The user is <account type>
#    And user selects phone type as Palm Pre
#    And user enters mobile number as 447704610259
#    And user checks if alternate number is empty
#    And user enters first name as test
#    And user enters last name as <last name>
#    And user enters email address as test@mail.com
#    And confirms email address as test@mail.com
#    And clicks Next button
#    Then User lands on page <desired page>
#
#    Examples:
#
#      |account type |last name |desired page          |
#      |Pay Monthly  |7891      |Your security details |
#      |Pay Monthly  |%^#$      |Your security details |
#      |Pay Monthly  |7891%@#^  |Your security details |
#      |Pay As You Go|7891      |Your security details |
#      |Pay As You Go|%^#$      |Your security details |
#      |Pay As You Go|7891%@#^  |Your security details |
#      |Business     |7891      |Your security details |
#      |Business     |%^#$      |Your security details |
#      |Business     |7891%@#^  |Your security details |
#
