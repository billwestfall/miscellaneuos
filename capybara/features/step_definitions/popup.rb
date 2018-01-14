Given(/^a confirmation box saying "([^"]*)"$/) do |message|
@expected_message = message
end

Given(/^I want to click "([^"]*)"$/) do |option|
retval = (option == "Leave Page") ? "true" : "false"

page.evaluate_script("window.confirm = function (msg) {
$.cookie('confirm_message', msg)
return #
{retval}

}")
end
