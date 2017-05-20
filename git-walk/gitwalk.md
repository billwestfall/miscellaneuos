`mkdir gitwalk`

`cd gitwalk`

`git config --global user.name "Bill Westfall"`

`git config --global user.email "billw@concur.com"`

`git config --global color.ui auto`

`git init git-test`

`cd git-test`

`git status`

`touch README.md`

`git status`

`git add README.md`

`git status`

`git commit -m "first commit for the README"`

`git remote add origin https://github.com/billwestfall/git-test.git`

[go to github] (https://github.com/billwestfall)

`git remote -v`

`git push -u origin master`

`git branch todo-license`

`git status`

`git checkout todo-license`

`touch LICENSE`

`git status`

`git add LICENSE`

`git status`

`git commit -m "Add LICENSE file"`

`git status`

`git push -u origin todo-license`

`git fetch` (remote to tracking branch, only effects tracking branch , not local or remote)

`git log -2` (log pipe to less)

`git log --stat -3` (log plus changes)

`git log --patch -2` (changes needed to patch)

`git log -2 --format=raw`

`git log --oneline`

`git log --oneline --decorate`

`git log --oneline --decorate --graph --all`

`git log -S "first"`

`git log --grep="re"`

`vi LICENSE`  (add some stuff)

`git diff`

`git diff --staged`

`git diff HEAD`

`touch .gitignore`

`vi .gitignore` (add *.log)

`git add .gitignore`

`git commit -m "Add ignore file"`

`touch test.log`

`git status`





