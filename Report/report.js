$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ABC.feature");
formatter.feature({
  "line": 1,
  "name": "Test scope",
  "description": "",
  "id": "test-scope",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login",
  "description": "",
  "id": "test-scope;login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "precondition",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.precondition()"
});
formatter.result({
  "duration": 8326404500,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.username()"
});
formatter.result({
  "duration": 1720882300,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.password()"
});
formatter.result({
  "duration": 283210300,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.click()"
});
formatter.result({
  "duration": 3814991800,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User search for the Hotels availability",
  "description": "",
  "id": "test-scope;user-search-for-the-hotels-availability",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User should logged in the application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User select the Location",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User select the Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User select the Room type",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User select the Number of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enter the Checkin date",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enter the Checkout date",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User select the Adults per Room",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click the Search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_should_logged_in_the_application()"
});
formatter.result({
  "duration": 53024500,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_select_the_Location()"
});
formatter.result({
  "duration": 967203100,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_select_the_Hotel()"
});
formatter.result({
  "duration": 235378900,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_select_the_Room_type()"
});
formatter.result({
  "duration": 228900600,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_select_the_Number_of_Rooms()"
});
formatter.result({
  "duration": 176500000,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enter_the_Checkin_date()"
});
formatter.result({
  "duration": 984630200,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enter_the_Checkout_date()"
});
formatter.result({
  "duration": 269523300,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_select_the_Adults_per_Room()"
});
formatter.result({
  "duration": 242451700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_the_Search_button()"
});
formatter.result({
  "duration": 1135062800,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User Select the searched hotel",
  "description": "",
  "id": "test-scope;user-select-the-searched-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "User should have searched the hotel",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User select the hotel",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User click the Continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_should_have_searched_the_hotel()"
});
formatter.result({
  "duration": 20246900,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_select_the_hotel()"
});
formatter.result({
  "duration": 143433700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_the_Continue_button()"
});
formatter.result({
  "duration": 1454599900,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "User Booking the selected Hotel",
  "description": "",
  "id": "test-scope;user-booking-the-selected-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "User should have selected the Hotel",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "User enter the First Name",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User enter the Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User enter the Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User enter the Credit card number",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User select the Credit card type",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User select the Expiry Month",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User select the Expiry year",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User enter the CVV number",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User click the Book Now button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_should_have_selected_the_Hotel()"
});
formatter.result({
  "duration": 14328000,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enter_the_First_Name()"
});
formatter.result({
  "duration": 477689300,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enter_the_Last_Name()"
});
formatter.result({
  "duration": 163764400,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enter_the_Billing_Address()"
});
formatter.result({
  "duration": 253087200,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enter_the_Credit_card_number()"
});
formatter.result({
  "duration": 263285400,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_select_the_Credit_card_type()"
});
formatter.result({
  "duration": 352417500,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_select_the_Expiry_Month()"
});
formatter.result({
  "duration": 200280700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_select_the_Expiry_year()"
});
formatter.result({
  "duration": 460542700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enter_the_CVV_number()"
});
formatter.result({
  "duration": 481901700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_the_Book_Now_button()"
});
formatter.result({
  "duration": 156299400,
  "status": "passed"
});
});