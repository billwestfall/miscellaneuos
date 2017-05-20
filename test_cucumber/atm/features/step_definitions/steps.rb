Given(/^I have deposited \$(\d+) in my account$/) do |arg1|
  @arg1 = arg1 
end

When(/^I request \$(\d+)$/) do |arg2|
  arg2 < @arg1 
end

Then(/^\$(\d+) should be dispensed$/) do |arg3|
  arg2 = arg3 
end
