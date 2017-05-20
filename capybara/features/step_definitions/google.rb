Given(/^I am on the Google homepage$/) do
    visit 'http://www.google.com'
end

Then(/^I will search for "(.*?)"$/) do |searchText|
    fill_in 'gbqfq', :with => searchText
end

Then(/^I should see "(.*?)"$/) do |expectedText|
#    page.should have_content(expectedText)
    assert page.has_content?(expectedText)
end

Then(/^I will click the about link$/) do
    click_link('About')
end

Then(/^I will click the learnMore link$/) do
    click_link('Learn More!')
end

Then(/^I will click the TripIt link$/) do
    click_link('TripIt - Travel Itinerary - Trip Planner')
end
