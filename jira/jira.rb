myuri="project+=+QAS+AND+type+=+incident+AND+(Urgency+=+P1+OR+Priority+=+'4+-+Blocking')+AND+status!=Open+AND+'P1+Root+Cause'+is+EMPTY+AND+summary+!~+test+ORDER+BY+resolved+ASC"

target="https://jira.com/jira/rest/api/2/search?jql=#{myuri}"
auth={:username => 'user', :password => ENV['Jira_usrpass']}
response = HTTParty.get(target,:basic_auth => auth)


if response.code == 200
  data = JSON.parse(response.body)
