Feature: Unlock your phone

  This feature shows End-to-End journey for Keep My Existing Number.

  Background:
    Given The user lands on homepage of KMEN

  Scenario: This is a happy path for PayM user where user has password (used to contact customer care) in KMEN

    When For KMEN The user is Pay Monthly
    And For KMEN user selects phone type as Palm Pre
    And For KMEN user enters mobile number as 447704610259
    And For KMEN user checks if alternate number is empty
    And For KMEN user enters first name as test
    And For KMEN user enters last name as test
    And For KMEN user enters email address as test@mail.com
    And For KMEN confirms email address as test@mail.com
    And For KMEN clicks Next button
    And For KMEN enters 2nd character of password as 1
    And For KMEN enters 3rd character of password as 1
    And For KMEN clicks on Next button
    And For KMEN user enters mobile number to be kept as 447704610259
    And For KMEN user enters new O2 mobile number as 07704611559
    And For KMEN submits the query
    Then Keep My Existing Mobile Number request is submitted successfully
#
#  Scenario: This is a happy path for PayM user where user does not have password (used to contact customer care) in KMEN
#
#    When For KMEN The user is Pay Monthly
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    And For KMEN clicks on I dont know my password
#    And For KMEN enters date of last bill as 03/31/2017
#    And For KMEN enters amount of last bill as 30
#    And For KMEN enters tariff name as test
#    And For KMEN clicks on Next button
#    And For KMEN user enters mobile number to be kept as 447704610259
#    And For KMEN user enters new O2 mobile number as 07704611559
#    And For KMEN submits the query
#    Then Keep My Existing Mobile Number request is submitted successfully
#
#  Scenario Outline: This is a error scenario of security password missing for PayM user where user has password (used to contact customer care)
#
#    When For KMEN The user is Pay Monthly
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    And For KMEN enters 2nd character of password as <2nd character>
#    And For KMEN enters 3rd character of password as <3rd character>
#    And For KMEN clicks on Next button
#    Then For KMEN Error message for 2nd character is displayed as <error1>
#    Then For KMEN Error message for 3rd character is displayed as <error2>
#
#    Examples:
#      | 2nd character  | 3rd character | error1                   | error2                   |
#      | 1              |               |                          | Fill in to continue.|
#      |                | 1             | Fill in to continue.|                          |
#      |                |               | Fill in to continue.| Fill in to continue.|
#
#
#  Scenario Outline: This is a error scenario of invalid amount of last bill for PayM user where user don't have password (used to contact customer care)
#    When For KMEN The user is Pay Monthly
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    And For KMEN clicks on I dont know my password
#    And For KMEN enters date of last bill as 03/31/2017
#    And For KMEN enters amount of last bill as <amount of last bill>
#    And For KMEN enters tariff name as test
#    And For KMEN clicks on Next button
#    Then For KMEN Error for amount of last bill is displayed as  <error1>
#
#    Examples:
#      | amount of last bill  |error1                   |
#      |                      |Fill in to continue.|
#      | 333.                 |The amount you supplied isn't valid. Enter again in the format 0.00, with no currency symbols.|
#      | 33.333               |The amount you supplied isn't valid. Enter again in the format 0.00, with no currency symbols.|
#
#  Scenario Outline: This is a error scenario of empty date of last bill and empty current tariff for PayM user where user don't have password (used to contact customer care)
#
#    When For KMEN The user is Pay Monthly
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    And For KMEN clicks on I dont know my password
#    And For KMEN enters date of last bill as <date of last bill>
#    And For KMEN enters amount of last bill as 50
#    And For KMEN enters tariff name as <current tariff>
#    And For KMEN clicks on Next button
#    Then For KMEN Error for date of last bill is displayed as <error1>
#    Then For KMEN Error for current tariff is displayed as <error2>
#
#    Examples:
#      | date of last bill | current tariff |error1                   |error2                   |
#      |                   |      test      |Fill in to continue.|                         |
#      |      03/31/2017   |                |                         |Fill in to continue.|
#      |                   |                |Fill in to continue.|Fill in to continue.|
#
#  Scenario: This is scenario for Non-O2 number
#    When For KMEN The user is Pay Monthly
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610200
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    Then For KMEN The Error message for Non O2 mobile number is displayed as The mobile number you entered isn't an O2 number.
#
#
#
#  Scenario: This is a happy path for Business user where user has password (used to contact customer care) in KMEN
#
#    When For KMEN The user is Business
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    And For KMEN enters company name as test
#    And For KMEN enters 1st line of address as test
#    And For KMEN enters postcode as SL0 9QP
#    And For KMEN enters security password as sec1234
#    And For KMEN clicks on Next button
#    And For KMEN user enters mobile number to be kept as 447704610259
#    And For KMEN user enters new O2 mobile number as 07704611559
#    And For KMEN submits the query
#    Then Keep My Existing Mobile Number request is submitted successfully
#
#  Scenario Outline: This is a error scenario of 1st line of address empty for Business user
#
#    When For KMEN The user is Business
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    And For KMEN enters company name as test
#    And For KMEN enters 1st line of address as <1st line of address>
#    And For KMEN enters postcode as SL0 9QP
#    And For KMEN enters security password as sec1234
#    And For KMEN clicks on Next button
#    Then For KMEN Error message for 1st line of address is displayed as <error1>
#
#    Examples:
#    |1st line of address|error1                   |
#    |                   |Fill in to continue.|
#
#  Scenario Outline: This is a error scenario of invalid postcode for Business user
#
#    When For KMEN The user is Business
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    And For KMEN enters company name as test
#    And For KMEN enters 1st line of address as test
#    And For KMEN enters postcode as <postcode>
#    And For KMEN enters security password as sec1234
#    And For KMEN clicks on Next button
#    Then For KMEN Error for postcode is displayed as <error1>
#
#    Examples:
#      |postcode|error1                   |
#      |        |Fill in to continue.|
#      |SL09Q   |The postcode you supplied doesn't appear to be valid.|
#      |SL09QP3 |The postcode you supplied doesn't appear to be valid.|
#      |@#$%^&* |The postcode you supplied doesn't appear to be valid.|
#      |3624#@  |The postcode you supplied doesn't appear to be valid.|
#      |#@rest  |The postcode you supplied doesn't appear to be valid.|
#      |3624re  |The postcode you supplied doesn't appear to be valid.|
#
#
#  Scenario Outline: This is a error scenario of empty security password for Business user
#
#    When For KMEN The user is Business
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    And For KMEN enters company name as test
#    And For KMEN enters 1st line of address as test
#    And For KMEN enters postcode as SL0 9QP
#    And For KMEN enters security password as <security password>
#    And For KMEN clicks on Next button
#    Then For KMEN Error for security password is displayed as <error1>
#
#    Examples:
#      |security password|error1                   |
#      |                 |Fill in to continue.|
#
#
#  Scenario: This is a happy path for Business user where user does not have password (used to contact customer care) in KMEN
#
#    When For KMEN The user is Business
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    And For KMEN clicks on I dont know my password
#    And For KMEN enters company name as test
#    And For KMEN enters 1st line of address as test
#    And For KMEN enters postcode as SL0 9QP
#    And For KMEN enters amount of last bill as 30
#    And For KMEN enters date of last bill as 03/31/2017
#    And For KMEN clicks on Next button
#    And For KMEN user is on additional information page
#    And For KMEN user enters mobile number to be kept as 447704610259
#    And For KMEN user enters new O2 mobile number as 07704611559
#    And For KMEN submits the query
#    Then Keep My Existing Mobile Number request is submitted successfully
#
#  Scenario: This is a check on cancel button functionality
#
#    When For KMEN The user is Business
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks on cancel button
#    Then The user lands on homepage of KMEN
#
#  Scenario: This is a check on if previous and next buttons retain data on 1st and 2nd page
#
#    When For KMEN The user is Pay Monthly
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    Then For KMEN User lands on Security details page
#    And For KMEN enters 2nd character of password as 1
#    And For KMEN enters 3rd character of password as 1
#    And For KMEN clicks on Next button
#    And For KMEN user enters mobile number to be kept as 447704610259
#    And For KMEN user enters new O2 mobile number as 07704611559
#    And For KMEN clicks on previous button
#    Then For KMEN User lands on Security details page
#    And For KMEN clicks on previous button
#    Then For KMEN user lands on homepage
#    And For KMEN clicks Next button
#    Then For KMEN User lands on Security details page
#
#
#  Scenario: This is a scenario for PayG user in KMEN
#
#    When For KMEN The user is Pay As You Go
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    And For KMEN user enters mobile number to be kept as 447704610259
#    And For KMEN user enters new O2 mobile number as 07704611559
#    And For KMEN submits the query
#    Then Keep My Existing Mobile Number request is submitted successfully
#
#  Scenario Outline: Check if error message for account type and Phone type is "Fill in to continue."
#
#    When For KMEN The user is <account type>
#    And For KMEN user selects phone type as <phone type>
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    Then For KMEN The Error message for account type is displayed as <error1>
#    Then For KMEN The Error message for phone type is displayed as <error2>
#
#    Examples:
#      | account type  | phone type    |error1                   |error2                   |
#      | Please Select | Palm Pre      |Fill in to continue.|                         |
#      | Business      | Please Select |                         |Fill in to continue.|
#      | Please Select | Please Select |Fill in to continue.|Fill in to continue.|
#
#  Scenario Outline: Check if error message for mobile number (when less, more digits, special characters or alphabets entered, or combination of alphanumerics with special characters) is "Fill in to continue."
#
#    When For KMEN The user is Pay As You Go
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as <mobile number>
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    Then For KMEN The Error message for mobile number is displayed as <error1>
#    But For KMEN user clears the invalid mobile number
#
#    Examples:
#      |mobile number  |error1                                                                          |
#      |77000000       |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |77000000123    |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test           |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |&($@$&         |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |+*@$7700000012 |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |7700test       |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test7700       |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test7700(*^@$  |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |               |Fill in to continue.                                                       |
#
#  Scenario Outline: This is error scenario for alternate mobile number (when less, more digits, special characters or alphabets entered, or combination of alphanumerics with special characters)
#
#    When For KMEN The user is Pay As You Go
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 7704610259
#    And For KMEN user enters alternate mobile number as <alternate mobile number>
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    Then For KMEN The Error message for alternate mobile number is displayed as <error1>
#    But For KMEN user clears the invalid mobile number
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
#
#  Scenario Outline: Check if error message for email address and confirm email address (empty) is "Fill in to continue."
#
#    When For KMEN The user is Pay Monthly
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as <email>
#    And For KMEN confirms email address as <confirm email>
#    And For KMEN clicks Next button
#    Then For KMEN The Error message for email is displayed as <error1>
#    Then For KMEN The Error message for confirm email is displayed as <error2>
#
#    Examples:
#    | email   | confirm email | error1                                                   | error2                                                                  |
#    |         |               | Fill in to continue.                                | Fill in to continue.                                               |
#    |  t@m.co |               |                                                          | Fill in to continue.                                               |
#    |         |    t@m.co     | Fill in to continue.                                | The email addresses you supplied don't match. Check them and try again. |
#    |  @m.co  |    t@m.co     |The email address you supplied doesn't appear to be valid.| The email addresses you supplied don't match. Check them and try again. |
#    |  t@.co  |    t@m.co     |The email address you supplied doesn't appear to be valid.| The email addresses you supplied don't match. Check them and try again. |
#    |  t@mco  |    t@m.co     |The email address you supplied doesn't appear to be valid.| The email addresses you supplied don't match. Check them and try again. |
#    |  t@m.c  |    t@m.co     |The email address you supplied doesn't appear to be valid.| The email addresses you supplied don't match. Check them and try again. |
#    |  t@m.   |    t@m.co     |The email address you supplied doesn't appear to be valid.| The email addresses you supplied don't match. Check them and try again. |
#    |  tm.co  |    t@m.co     |The email address you supplied doesn't appear to be valid.| The email addresses you supplied don't match. Check them and try again. |
#    |  @m.co  |    @m.co      |The email address you supplied doesn't appear to be valid.| The email address you supplied doesn't appear to be valid.              |
#    |  t@.co  |    t@.co      |The email address you supplied doesn't appear to be valid.| The email address you supplied doesn't appear to be valid.              |
#    |  t@mco  |    t@mco      |The email address you supplied doesn't appear to be valid.| The email address you supplied doesn't appear to be valid.              |
#    |  t@m.c  |    t@m.c      |The email address you supplied doesn't appear to be valid.| The email address you supplied doesn't appear to be valid.              |
#    |  t@m.   |    t@m.       |The email address you supplied doesn't appear to be valid.| The email address you supplied doesn't appear to be valid.              |
#    |  tm.co  |    tm.co      |The email address you supplied doesn't appear to be valid.| The email address you supplied doesn't appear to be valid.              |
#
#  Scenario Outline: This is a error scenario for PayG user with "mobile number to be kept" field as empty
#
#    When For KMEN The user is Pay As You Go
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    And For KMEN user enters mobile number to be kept as <mobile number to be kept>
#    And For KMEN user enters new O2 mobile number as 07704611559
#    And For KMEN submits the query
#    Then For KMEN Error for mobile number to be kept is displayed as <error1>
#
#  Examples:
#  |mobile number to be kept|error1                   |
#  |                        |Fill in to continue.|
#  |77000000                |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#  |77000000123             |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#  |test                    |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#  |&($@$&                  |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#  |+*@$7700000012          |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#  |7700test                |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#  |test7700                |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#  |test7700(*^@$           |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#
#  Scenario Outline: This is a error scenario for new o2 mobile number
#
#    When For KMEN The user is Pay As You Go
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    And For KMEN user enters mobile number to be kept as 07704610259
#    And For KMEN user enters new O2 mobile number as <new o2 mobile number>
#    And For KMEN submits the query
#    Then For KMEN Error for new o2 mobile number is displayed as <error1>
#
#    Examples:
#      |new o2 mobile number|error1                   |
#      |                    |Fill in to continue.|
#      |77000000            |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |77000000123         |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test                |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |&($@$&              |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |+*@$7700000012      |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |7700test            |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test7700            |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#      |test7700(*^@$       |The mobile phone number you supplied isn't valid. Check and re-enter the number.|
#
#  Scenario Outline: This is a scenarios that checks for second page availability for all 3 account types i.e. PayM, PayG and Business with acceptable first name with numeric, special characters and combination of both. (without alphabetic characters).
#
#    When For KMEN The user is <account type>
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as <first name>
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    Then For KMEN User lands on page <desired page>
#
#    Examples:
#
#      |account type |first name|desired page          |
#      |Pay Monthly  |7891      |Your security details |
#      |Pay Monthly  |%^#$      |Your security details |
#      |Pay Monthly  |7891%@#^  |Your security details |
#      |Pay As You Go|7891      |Additional information|
#      |Pay As You Go|%^#$      |Additional information|
#      |Pay As You Go|7891%@#^  |Additional information|
#      |Business     |7891      |Your security details |
#      |Business     |%^#$      |Your security details |
#      |Business     |7891%@#^  |Your security details |
#
#  Scenario Outline: This is a scenarios that checks for second page availability for all 3 account types i.e. PayM, PayG and Business with acceptable last name with numeric, special characters and combination of both. (without alphabetic characters).
#
#    When For KMEN The user is <account type>
#    And For KMEN user selects phone type as Palm Pre
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as <last name>
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    Then For KMEN User lands on page <desired page>
#
#    Examples:
#
#      |account type |last name |desired page          |
#      |Pay Monthly  |7891      |Your security details |
#      |Pay Monthly  |%^#$      |Your security details |
#      |Pay Monthly  |7891%@#^  |Your security details |
#      |Pay As You Go|7891      |Additional information|
#      |Pay As You Go|%^#$      |Additional information|
#      |Pay As You Go|7891%@#^  |Additional information|
#      |Business     |7891      |Your security details |
#      |Business     |%^#$      |Your security details |
#      |Business     |7891%@#^  |Your security details |
#
#    Scenario Outline: This is error scenario for first name field.
#
#    When For KMEN The user is Business
#    And For KMEN user selects phone type as Nokia
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as <first name>
#    And For KMEN user enters last name as test
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    Then For KMEN The Error message is displayed as <error1>
#
#    Examples:
#    |first name|error1|
#    |          |Fill in to continue.|
#
#
#  Scenario Outline: This is error scenario for last name field.
#
#    When For KMEN The user is Business
#    And For KMEN user selects phone type as Nokia
#    And For KMEN user enters mobile number as 447704610259
#    And For KMEN user checks if alternate number is empty
#    And For KMEN user enters first name as test
#    And For KMEN user enters last name as <last name>
#    And For KMEN user enters email address as test@mail.com
#    And For KMEN confirms email address as test@mail.com
#    And For KMEN clicks Next button
#    Then For KMEN The Error message is displayed as <error1>
#
#    Examples:
#      |last name |error1                   |
#      |          |Fill in to continue.|
