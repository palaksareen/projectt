$(function () {

    var errorCount = 0;

    parent.window.addEventListener('load', function () {
        setIframeHeight();
    });

    parent.window.addEventListener('resize', function () {
        setIframeHeight();
    });

    $(window).load(function () {
        setIframeHeight();
    });

    function getDocHeight() {
        return Math.max(
            $(document).height(),
            $(window).height(),
            /* For opera: */
            document.documentElement.clientHeight
        );
    }

    function setIframeHeight() {
        //console.log("height: " + getDocHeight());
        window.parent.document.getElementById('onlineFormFrame').height = '100%';
        window.parent.document.getElementById('onlineFormFrame').height = getDocHeight();
    }

    $(".online-form-next").click(function (e) {
        e.preventDefault();
        errorCount = 0;
        setDefaultErrorMsgs();
        errorCount = validateForm();
        if (errorCount === 0) {
            $('#onlineForm').submit();
        }
        else {
            setIframeHeight();
        }
    });

    $(".online-form-previous").click(function (e) {
        e.preventDefault();
        $('#onlineForm').submit();
    });

    $("#forgotPassword").click(function (e) {
        e.preventDefault();
        document.getElementById('onlineForm').reset();
        var pageInfoElement = document.getElementById('pageInfo');
        pageInfoElement.setAttribute('value', 'noPassword');
        $('#onlineForm').submit();
    });

    function validateForm() {
        $('#onlineForm input[type=text], #onlineForm input[type=number], #onlineForm input[type=tel], #onlineForm textarea, #onlineForm input[type=password], #onlineForm .customSelect select').each(function () {
            var inputVal = $.trim($(this).val()),
                inputId = $(this).attr('id'),
                ifRequired = $(this).prop('required'),
                emailVal = $.trim($('.emailAddress').val());
            noInput = false;

            if (inputVal === '' && ifRequired === true) {
                if (inputId === 'accountType' || inputId === 'phoneType') {
                    $(this).parent('span.select').siblings('.errorMsg').css('display', 'block');
                    $(this).parent('span.select').css('border-color', '#dd5858');
                }
                else {
                    $(this).siblings('.errorMsg').css('display', 'block');
                    $(this).css('border-color', '#dd5858');
                }
                ++errorCount;
            }
            else if (inputVal !== '') {
                if (inputId === 'mpn' || inputId === 'o2mpn') {
                    phoneUKValidateCheck(inputId, inputVal, $(this));
                }
                else if (inputId === 'alternateMPN' || inputId === 'firstFrequentNo' || inputId === 'secondFrequentNo') {
                    phoneValidateCheck(inputVal, $(this));
                }
                else if (inputId === 'firstName' || inputId === 'lastName' || inputId === 'tariffName' || inputId === 'companyName' || inputId === 'address' || inputId === 'addInfo') {
                    textValidateCheck(inputVal, $(this));
                }
                else if (inputId === 'emailAddress') {
                    emailValidateCheck(inputVal, $(this));
                }
                else if (inputId === 'confirmEmailAddress') {
                    confirmEmailValidateCheck(inputVal, emailVal, $(this));
                }
                else if (inputId === 'billAmount' || inputId === 'airtimeBalance') {
                    billAmountCheck(inputVal, $(this));
                }
                else if (inputId === 'postcode') {
                    postcodeValidateCheck(inputVal, $(this));
                }
                else if (inputId === 'imei') {
                    imeiValidateCheck(inputVal, $(this));
                }
                
                else if (inputId === 'datepicker') {
                    dateValidateCheck(inputVal, $(this));
                }
            }
        });
        return errorCount;
    }

    /* Hide error messages on keydown/blur */
    $(document).on('keydown', '#onlineForm input[type=text], #onlineForm textarea, #onlineForm input[type=number], #onlineForm input[type=tel], #onlineForm input[type=password]', function (e) {
        $(this).siblings('.errorMsg').css('display', 'none');
        $(this).css('border-color', '#d8d8d8');
        if (e.currentTarget.id === "mpn") {
            $('.hide-error-msg').css('display', 'none')
        }
        setIframeHeight();
    });
    $(document).on('change', 'input, textarea' ,function () {
        $(this).val($(this).val().trim());
    });
    /* Function to trim only leading and trailing whitespaces not in between. Also converting multiple spaces to single whitespace */
    function customTrim(el) {
        el = el.replace(/(^\s*)|(\s*$)/gi, "").replace(/[ ]{2,}/gi, " ").replace(/\n +/, "\n");
        return el;
    }

    /* Hide error messages on focus (only for select boxes) */
    $(document).on('focus', '#onlineForm .customSelect select', function () {
        $(this).parent('span.select').siblings('.errorMsg').css('display', 'none');
        $(this).parent('span.select').css('border-color', '#d8d8d8');
        setIframeHeight();
    });

    /* Hide error messages on focus (only for date picker) */
    $(document).on('change', '#onlineForm .billDate', function () {
        $(this).siblings('.errorMsg').css('display', 'none');
        $(this).css('border-color', '#d8d8d8');
        setIframeHeight();
    });
	
    /* Reset error messages */
    function setDefaultErrorMsgs() {
        $('.errorMsg').text('Fill in to continue.');
    }

    /* Error show/hide based on validation */
    function errorDisplayControl(value, element) {
        if (value) {
            element.siblings('.errorMsg').css('display', 'block');
            element.css('border-color', '#dd5858');
            ++errorCount;
        } else {
            element.siblings('.errorMsg').css('display', 'none');
        }
    }

    /* Regex to validate email */
    function validateEmail(email) {
        var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
        return re.test(email);
    }

    /* Regex to validate UK phone number */
    function validateUKPhoneNumber(number) {
        var re = /^(\+44|44|0044|0)7\d{9}$/;
        return re.test(number);
    }

    /* Regex to validate phone number */
    function validatePhoneNumber(number) {
        var re = /^\(?(\+?)\)?\s?[0-9]+\)?\s?[0-9 -]+$/;
        return re.test(number);
    }

    /* Regex to validate amount */
    function validateAmount(amount) {
        var re = /^\s*-?\d+(\.\d{1,2})?\s*$/;
        return re.test(amount);
    }

    /* Regex to validate generic input format */
    function validateHtmlTags(value) {
        var htmlTagRe = /<\/?[^>]+(>|$)/g;
        var result = htmlTagRe.test(value)
        return result;
    }

    /* Regex to validate UK postcode */
    function validatePostCode(value) {
        var re = /^[A-Z]{1,2}[0-9]{1,2}[A-Z]{0,1} ?[0-9][A-Z]{2}$/i;
        return re.test(value);
    }

    /* Regex to validate Date Format and Range */
    function validateDateInput(value) {
		
		var re = /^(((0[1-9]|[12]\d|3[01])\/(0[13578]|1[02])\/((19|[2-9]\d)\d{2}))|((0[1-9]|[12]\d|30)\/(0[13456789]|1[012])\/((19|[2-9]\d)\d{2}))|((0[1-9]|1\d|2[0-8])\/02\/((19|[2-9]\d)\d{2}))|(29\/02\/((1[6-9]|[2-9]\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$/;
        return re.test(value);
    }

    /* Regex to validate IMEI Number */
    function isIMEI(imeinumber) {
        var etal = /^[0-9]{15}$/;
        if (!etal.test(imeinumber))
            return false;
        sum = 0;
        mul = 2;
        l = 14;
        for (i = 0; i < l; i++) {
            digit = imeinumber.substring(l - i - 1, l - i);
            tp = parseInt(digit, 10) * mul;
            if (tp >= 10)
                sum += (tp % 10) + 1;
            else
                sum += tp;
            if (mul == 1)
                mul++;
            else
                mul--;
        }
        chk = ((10 - (sum % 10)) % 10);
        if (chk != parseInt(imeinumber.substring(14, 15), 10))
            return false;
        return true;
    }

    

    /*Input Format Check*/
    function textValidateCheck(inputVal, element) {
        var inputValue = inputVal;
        inputInvalid = false;

        if (validateHtmlTags(inputValue)) {
            inputInvalid = true;
            element.siblings('.errorMsg').text("The format you've entered isn't valid.");
        }
        errorDisplayControl(inputInvalid, element);
    }

    /*Email Check*/
    function emailValidateCheck(email, element) {
        emailInvalid = false;
        var emailVal = email;

        if (!validateEmail(emailVal)) {
            emailInvalid = true;
            element.siblings('.errorMsg').text("The email address you supplied doesn't appear to be valid.");
        }
        errorDisplayControl(emailInvalid, element);
    }

    /*Reconfirm Email Check*/
    function confirmEmailValidateCheck(confirmEmail, email, element) {
        confirmEmailInvalid = false;
        var confirmEmailVal = confirmEmail;
        var emailVal = email;

        if (!validateEmail(confirmEmailVal)) {
            confirmEmailInvalid = true;
            $('.confirmEmailErrorMessage').text("The email address you supplied doesn't appear to be valid.");
        } else if (confirmEmailVal !== emailVal) {
            confirmEmailInvalid = true;
            element.siblings('.errorMsg').text("The email addresses you supplied don't match. Check them and try again.");
        }
        errorDisplayControl(confirmEmailInvalid, element);
    }

    /*UK Phone Number Check*/
    function phoneUKValidateCheck(inputId, number, element) {
        var telUKVal = number;
        telUKInvalid = false;

        if (!validateUKPhoneNumber(telUKVal)) {
            telUKInvalid = true;
            element.siblings('.errorMsg').text("The mobile phone number you supplied isn't valid. Check and re-enter the number.");
        }
        else {
            var newmpn = telUKVal.replace(/.*(\d{9})$/g, "07$1");
			if(inputId === 'mpn'){
            $('#onlineForm input#mpn').val(newmpn);
			}
			else if(inputId === 'o2mpn'){
			$('#onlineForm input#o2mpn').val(newmpn);
			}
        }
        errorDisplayControl(telUKInvalid, element);
    }

    /*Phone Number Check*/
    function phoneValidateCheck(number, element) {
        var telVal = number;
        telInvalid = false;

        if (!validatePhoneNumber(telVal)) {
            telInvalid = true;
            element.siblings('.errorMsg').text("The mobile phone number you supplied isn't valid. Check and re-enter the number.");
        }
        errorDisplayControl(telInvalid, element);
    }

    /*Amount Check*/
    function billAmountCheck(amount, element) {
        var billAmount = amount;
        amountInvalid = false;

        if (!validateAmount(billAmount)) {
            amountInvalid = true;
            element.siblings('.errorMsg').text("The amount you supplied isn't valid. Enter again in the format 0.00, with no currency symbols.");
        }
        else if (element.attr('id') === 'airtimeBalance' && billAmount < 0) {
            amountInvalid = true;
            element.siblings('.errorMsg').text("The amount you supplied isn't valid. It must be greater than 0.");
        }
        errorDisplayControl(amountInvalid, element);
    }

    /*PostCode Check*/
    function postcodeValidateCheck(postcode, element) {
        var postcodeVal = postcode;
        postcodeInvalid = false;

        if (!validatePostCode(postcodeVal)) {
            postcodeInvalid = true;
            element.siblings('.errorMsg').text("The postcode you supplied doesn't appear to be valid.");
        }
        errorDisplayControl(postcodeInvalid, element);
    }

    /*IMEI Check*/
    function imeiValidateCheck(imei, element) {
        var imeiVal = imei;
        imeiInvalid = false;

        if (!isIMEI(imeiVal)) {
            imeiInvalid = true;
            element.siblings('.errorMsg').text("The supplied IMEI doesn't appear to be valid. It must be of 15 digits.");
        }
        errorDisplayControl(imeiInvalid, element);
    }

    

    /*Date Validate */
    function dateValidateCheck(inputDate, element) {
        dateInvalid = false;
        var defaultFormattedDate = inputDate;
		var datearray = defaultFormattedDate.split("/");
		var newDate = datearray[1] + '/' + datearray[0] + '/' + datearray[2];
        if (!validateDateInput(newDate) || (datearray[2] < 1990) ) {
            dateInvalid = true;
            element.siblings('.errorMsg').text("The date you supplied isn't valid. Enter again in the format mm/dd/yyyy with a date on or after 01/01/1990.");
        }
        else {
            var currentDate = new Date();
            var enteredDate = new Date(inputDate);
            if (enteredDate.getTime() > currentDate.getTime()) {
                dateInvalid = true;
                element.siblings('.errorMsg').text("The supplied date is in the future. Check and re-enter the date.");
            }
        }
        errorDisplayControl(dateInvalid, element);
    }

});