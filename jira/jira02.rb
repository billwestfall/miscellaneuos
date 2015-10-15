#!/usr/bin/env ruby
require 'httparty'
require 'json'
require 'nokogiri'
require 'open-uri'
require 'rexml/document'

myuri="project+=+XXX"

target="https://jira.com/jira/rest/api/2/search?jql=#{myuri}"
auth={:username => 'Jira_user', :password => ENV['Jira_password']}
response = HTTParty.get(target,:basic_auth => auth)


if response.code == 200
  data = JSON.parse(response.body)
  puts data  # uncomment if you want to see all the json coming back

  end
