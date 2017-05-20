
from webtest import TestApp
app = TestApp('http://www.concur.com')
resp = app.get('/')
assert resp.status == '301 Moved Permanently'
(res) = resp.status
print(res)
