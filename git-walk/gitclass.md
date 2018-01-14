```
git --version

git version
git config --global user.name "GitHub Student"
git config --global --unset-all user.name
git config --global --unset-all user.email
git config --list
git config --system --unset-all user.email
git config --global user.name "GitHub Student"
git config --global user.name
cat ~/.gitconfig
atom ~/.gitconfig
git config --global user.name "GitHub Student2"
git config --global user.name "test student"
git config --global user.name "GitHub Student"
git config --global user.email "training+githubstudents@github.com"
git config --global user.email "trainingdemos+githubstudent@github.com
git config --global user.email "trainingdemos+githubstudent@github.com"
ls /etc/
ls /etc/ | less
git init first-project
cd first-project/
git status
cd ..
git commit -m "test"
cd first-project/
touch README.md
git status
git add README.md
git status
git commit -m'first commit for the README'
git status
ls .git/
ls .git/objects/
ls .git/objects/cc
ls .git/objects/e6
git cat-file e69de29bb2d1d6434b8b29ae775ad8c2e48c5391
git cat-file -p e69de29bb2d1d6434b8b29ae775ad8c2e48c5391
ls .git/objects/
ls .git/objects/f9
git cat-file -p f93e3a1a1525fb5b91020da86e44810c87a2d7bc
git cat-file -p f93e3a1a1525fb5b91020da86e44810c87a2d7bc
atom .
git status
git add README.md
git status
git commit -m"added some actual markdown"
ls .git/objects
git status
git commit -am"clearer description of headers"
git remote add origin https://github.com/githubstudent/first-project.git
git remote -v
git push -u origin master
git branch -r
git branch -a
ls .git/refs/
ls .git/refs/heads
ls .git/refs/remotes/origin
cat .git/HEAD
git branch todo-license
git status
git branch
git branch -a
ls .git/refs/heads/
touch LICENSE
git status
git checkout todo-license
git status
git add LICENSE
git status
git commit -m"start of license file"
git status
git push -u origin todo-license
git branch -a
git status
cat LICENSE
git fetch
git status
git status
git merge origin/todo-license
git status
git status
git add README.md
git commit -m "clear out the todo item"
git status
git push
git checkout master
git pull
git status
ls
git branch
git branch -a
git branch -d todo-license
git help pull
git fetch --prune
git branch -a
git status
git log
git log -2
git log --stat -2
git log --stat -3
git log -2 -p
git log -2 --format=raw
git log --oneline
git log --oneline --decorate
git log --oneline --decorate --graph --all
cd ../git/
git log --oneline --decorate --graph --all
cd ../first-project/
cat README.md
touch brntbeer.md
mv brntbeer.md githubstudent.md
git status
git diff
git status
git add githubstudent.md
git commit -m"added personal file"
git status
git status
git branch personal-file
git log --oneline --decorate --graph --all -5
git branch
git reset --hard origin/master
git log --oneline --decorate --graph --all -5
git checkout personal-file
git status
git diff
git status
git add githubstudent.md
git status
git status
git add README.md
git status
git diff
git diff --staged
git status
git status
git diff
git diff --staged
git commit -m "added personal file, removed todo item"
git status
git diff
git status
git diff
git add .
git status
git status
git diff --HEAD
git diff HEAD
git status
git add .
git status
git commit -m "hometown instead of location, add author"
git status
git log -1 --color-words
git log -1 --color-words -p
git log -2 --color-words -p
git log -2 --stat -p
git log master..personal-file --oneline
git log master..personal-file --oneline -p
git log master..personal-file --oneline --stat
git status
git checkout master
git merge personal-file
git log --oneline --decorate --graph --all
git branch -d personal-file
git config --unset-all --global alias.lol
git config --global alias.whateverireallywanttocallthis
git config --global alias.whateverireallywanttocallthis 'lol'
git whateverireallywanttocallthis
git config --global alias.lol "log --oneline --decorate --graph --all"
git lol
git config --global alias.lol "log --oneline --decorate"
git lol
git config --global alias.lol "log --oneline --decorate --graph --all"
git config --global alias.fp "fetch --prune origin"
git fp
git status
touch personal-secrets.md
git status
touch .gitignore
git status
git status
git add .gitignore
git status
git commit -m "no need to save secret files"
mkdir logs
git status
cd logs/
touch development.log
git status
git status -b
git status -sb
git help status
git status
cd ..
git status
git status -b
git status -l
git status --long
git status
mkdir notes
touch notes/development.notes
git status
touch notes/production.notes
git status
ls
ls notes
git status
cd notes
git status -a
git status -v
git add .
git status
git add ..
git status
git commit -m"ignore logs, notes except production"
ls
cd ..
git add .
git help status
mkdir tests
touch tests/front-end.html
git status -u
rm -rf tests/
git status
git push
git status
git fetch
git branch
git branch -r
git checkout css-files
git status
git branch
git branch
git branch -r
git fetch
git fetch
git fetch
git remote -v
git remote set-url origin https://github/USERNAME/first-project.git
git remote -v
git remote set-url origin https://github/githubstudent/first-project.git
git fetch
git fetch
git checkout css-files
git fetch
git fetch
git remote set-url origin https://github.com/githubstudent/first-project.git
git fetch
git fetch
git lol -10
fetch
git fetch
git fetch
git status
git checkout master
git merge css-files
git lol -10
git fetch
git branch html-files
git checkout html-files
ls scratch/
ls scratch/build_better_email/
touch index.html
cat scratch/build_better_email/better_email_template.html
git status
git add .
git commit -m "added html structure and grabbed css"
git status
git diff
git diff
git commit -am "added body section of index"
git checkout master
git fetch
ls
git status
git diff
git commit -am "better readme description of project"
git lol -10
git lol -3
git lol -3
git merge html-files
git lol -4
git fetch
git lol -5
git branch -d html-files
git branch html-content
git checkout html-content
git status
git diff
git commit -am "add more useful content"
git lol -5
git checkout master
git lol -5
git merge --no-ff html-content
cd scratch/
git status
ls
git ideas
git lol -5
tmux attach
tmux attach
tmux
git lol
git lol -10
git lol -10
git branch
git branch notes
git checkout notes
git status
git commit -am "added production notes"
git status
git commit -am "note about storing session data in DB"
git status
git lol -10
git checkout master
ls
cat notes/production.notes
cat notes/production.notes
ls .git/HEAD
cat .git/HEAD
git checkout -
git checkout -
cat .git/HEAD
git checkout -
cat .git/HEAD
ls .git/refs/heads/
cat .git/refs/heads/notes
cat .git/refs/heads/master
git lol -5
tmux attach
git checkout master
git merge notes
git lol -10
git fetch
git status
git lol-10
git lol -10
git lol -10
git merge origin/css
git merge origin/css-files
git lol -10
git status
git push origin master
cd ..
git status
git clone https://github.com/githubstudent/example-basic.git
git remote -v
cd example-
cd example-basic/
git remote -v
git remote set-url origin https://github.com/githubstudent/example-basic
git status
ls
git log
git log -1 -p
git status
git branch githubstudent
git checkout githubstudent
la
ls
touch githubstudent.md
echo "Hello Teacher" > githubstudent.md
git status
git add githubstudent
git add githubstudent.md
git status
git commit -m "introduction from student to teacher"
git status
git lol -5
git status
ls
touch githubstudent
ls
git status
rm githubstudent
git status
git lol
git branch -a
git status
git push -u origin githubstudent
git config --global credential.helper 'cache --timeout=900'
git push
git push origin githubstudent
git branch
git credential-cache exit
git push origin githubstudent
git remote add teacher https://github.com/githubteacher/example-basic.git
git remote -v
git fetch teacher
git branch -r
git branch
git merge teacher/master
git push origin githubstudent
git remote add teacher https://github.com/githubteacher/example-basic.git
git remote -v
git fetch teacher
git branch
git remote set-url teacher https://github.com/githubteacher/example-basic.git
git remote -v
git checkout master
git fetch origin
git fetch teacher
git fetch teacher
git lol
git lol
git log master..teacher/master --oneline
git status
git merge teacher/master
git status
git push origin master
git status
ls
git branch person-file-cleanup
git checkout person-file-cleanup
mkdir greetings
mv a.html greetings/
mv billwestfall.md greetings/
mv carolineburns.md greetings/
mv githubstudent.md meeramn.md newfile.md opagani-files.md pipps-student-file sensr.net.md testfile.1 greetings/
ls
git status
git add greetings/
git status
git add .
git status
git add -A .
git status
mv index.html greetings/
git status
git add -A greetings/
git status
git add -u index.html
git status
git commit -m "organizational cleanup of greetings"
git status
git lol -5
git lol -2
git reset --soft master
git status
git reset HEAD greetings/index.html
git status
git reset --mixed HEAD index.html
git status
rm greetings/index.html
git status
git checkout -- index.html
git status
git commit -m "move 10 person files"
atom .
git status
git add index.html
git commit -m "shoutout to greetings"
git status
git lol -5
git lol -5
git reset HEAD~1
git status
git diff
git status
git status
git diff
git commit -am "code tags and shoutout to greetings"
git lol -5
git reset HEAD~2
git status
git status -u
git status
git lol -5
git reflog
git reflog-3
git reflog -3
git log -1
git reflog -3
git log --oneline -5
git reset --hard cc8c940
git log --oneline -5
ls
git reset --hard HEAD~5
git reset --hard HEAD~5
git status
git lol -20
git status
git reset --hard HEAD@{0}
git reset --hard HEAD@{2}
git reflog -5
git reset --hard HEAD@{1}
git reset --hard HEAD@{1}
git reset --hard HEAD@{1}
git reset --hard HEAD@{1}
git reset --hard HEAD@{1}
git reset --hard HEAD@{1}
git reflog -5
git reflog -10
git checkout master
git reflog -1
git reset --hard css-files
git branch
git reset --hard githubstudent
git branch -D master
git checkout githubstudent
git branch -D master
git reflog -5
git reset --hard HEAD@{2}
git branch
git lol -5
git branch master
ls .
ls -a
git branch
git checkout master
git status
git status
git diff
git diff --color-words
git add README.md
git commit -m"edited readme for great justice"
git status
git log
git status
git fetch teacher
git status
git merge teacher/master
git status
git status
git add README.md
git status
git commit
git status
git reset --hard origin/master
git merge teacher/master
git reflog -5
git reset --hard HEAD@{3}
git merge teacher/master
git status
git merge --abort
git status
git status
git branch bug-fix-2946
git checkout bug-fix-2946
ls
git status
git stash
git status
git stash pop
git stash
git checkout master
git status
git status
git diff index.html
git checkout index.html
git status
git status
git commit -am "emergency fix"
git checkout bug-fix-2946
git stash pop
git stash
git status
git stash apply
git stash list
git stash awdawda
git stash show stash@{0}
git stash show stash@{0} -p
git stash show stash@{0}
git stash show stash@{0} -p
git lol -10
git status
git diff
git diff --color-words
git commit -am "made changes"
git status
git add .
git status
git commit --amend
git log -1 -p --color-words
```
