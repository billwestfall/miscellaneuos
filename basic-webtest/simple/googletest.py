
from webtest import TestApp
app = TestApp('http://www.google.com')
resp = app.get('/')
form = resp.form
form['q'] = 'Bar'
assert resp.status == '200 OK'
(res) = resp.status
resb = form.submit('btnK')
# headers = resb.readline().strip()
print(res)
print(form.action)
print(form.method)
print(form['q'].value)
#print(resb)
#print(headers)
