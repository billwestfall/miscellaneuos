curl -D- -u <user>:'password' -X POST -H "plication/json" --data '{"jql":"project = QAS and status=closed","startAt":0,"maxResults":5}' "https://jira.com/jira/rest/api/2/search" > qas_list.json
