
from webtest import TestApp
app = TestApp('http://54.xxx.xxx.xxx/jenkins/login?from=%2Fjenkins%2F')
resp = app.get('/')
forms = resp.forms
assert resp.status == '200 OK'
(res) = resp.status
form = resp.forms[1]
form['j_username'] = "user"
form['j_password'] = 'wy2Uxxxxxzt4'
response = form.submit().maybe_follow()
print(response)
print(form.action)
print(form.method)
