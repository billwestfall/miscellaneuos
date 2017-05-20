When(/^I run "([^"]*)"$/) do |cmd|
  system(cmd) 
end

Then(/^I should see the output "([^"]*)"$/) do |expected|
  assert_partial_output(expected, all_output) 
end

