$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Test Environment",
  "description": "",
  "id": "login-to-test-environment",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8545920600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on TEST Environment page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_TEST_Environment_page()"
});
formatter.result({
  "duration": 2066001400,
  "status": "passed"
});
formatter.scenario({
  "line": 56,
  "name": "Register Account for new User",
  "description": "",
  "id": "login-to-test-environment;register-account-for-new-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 55,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 57,
  "name": "User is on TEST Environment page",
  "keyword": "Given "
});
formatter.step({
  "line": 58,
  "name": "User click on MyAccount",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "User click on Register",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "User fills Register form with below information",
  "rows": [
    {
      "cells": [
        "firstName",
        "LastName",
        "E-mail",
        "Telephone",
        "password"
      ],
      "line": 61
    },
    {
      "cells": [
        "Rahim",
        "Abid",
        "Rahim123@test.us",
        "5725656322",
        "Afghanistan"
      ],
      "line": 62
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "User select \u0027yes\u0027 for Subscribe",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "User click privacy and policy button",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "User click Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "User should see message  \u0027Your Account Has Been Created!\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_TEST_Environment_page()"
});
formatter.result({
  "duration": 314248100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_MyAccount()"
});
formatter.result({
  "duration": 99237200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.user_click_on_Register()"
});
formatter.result({
  "duration": 1264972200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.user_fills_Register_form_with_below_information(DataTable)"
});
formatter.result({
  "duration": 598210600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yes",
      "offset": 13
    }
  ],
  "location": "RegisterStepDefinition.user_select_yes_for_Subscribe(String)"
});
formatter.result({
  "duration": 150291200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.user_click_privacy_and_policy_button()"
});
formatter.result({
  "duration": 537433900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.user_click_Continue_button()"
});
formatter.result({
  "duration": 348294200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Account Has Been Created!",
      "offset": 26
    }
  ],
  "location": "RegisterStepDefinition.user_should_see_message_Your_Account_Has_Been_Created(String)"
});
formatter.result({
  "duration": 6077713000,
  "error_message": "java.lang.NullPointerException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy18.getText(Unknown Source)\r\n\tat utilities.DriverUtility.getText(DriverUtility.java:135)\r\n\tat pageObjects.RegisterPageObj.getSuccessfullAcctCreationMessage(RegisterPageObj.java:95)\r\n\tat stepDefinitions.RegisterStepDefinition.user_should_see_message_Your_Account_Has_Been_Created(RegisterStepDefinition.java:88)\r\n\tat ✽.Then User should see message  \u0027Your Account Has Been Created!\u0027(Features/Login.feature:66)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 145200,
  "status": "passed"
});
});