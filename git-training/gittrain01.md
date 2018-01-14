#### Git -


* hub - command line git tool
* gh - command line git tool

vs svn keeeps all commits in local DB instead of needing a network connection, so don't need a network connect, can just sync when there is one

* mac.github.com
* windows.github.com

##### Initial setup

Run in terminal

`git config --global user.name`
`git config --global user.email`


color.ui

`git config --global color.ui auto`


##### force mac to LF, and windows to use

`git config --global core.autocrlf input`

Different levels you can set the config value (system, global, local)

`git config --system <name> <value>`
`git config --global <name> <value>` -	 across all repos on machine
`git config --local <name> <value>`

`git init first-project`
`cd <to project>`
`git status`

create README

`touch README.md`
`git status`  (it will show that the file needs to be added)

`git add README.md`
`git status` (file is now added and ready to be committed)



`git commit -m "first commit for the README"`  (use when and why for git commit)

*output:*

```[master (root-commit) 226dd93] first commit for the README
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 README.md```
 
 
 
 
 commit hash contains time, user name and email and content changes (actual hash is up to 40 digits)
 
```BW-MacBook-Pro:first-project root# git status
 # On branch master
 nothing to commit, working directory clean```
 
 
 master is just designation of the first branch
 master usually would mirror production, and then branches merge into the master (once ready for prod). that way can revert entire branch or to a point
 
*working vs staging directory* 

git add moves it from working to staging
staging and adds good to group adds/commits that should go together

unstage also a step if needed (reset)

* blob - files (hash to git)
* tree - folders/subfolders
* commit - total of the blob and tree 



```
BW-MacBook-Pro:first-project root# ls .git/objects/
22   e6   f9   info pack

BW-MacBook-Pro:first-project root# ls .git/objects/22/
6dd931189ad802e028245e3783056b2af61496
```						
(the hash of the commit)


so the tree and blob hashes can be identical to another user, but the first folder (22 above) should be unique because it contains user/email/time/etc


```
BW-MacBook-Pro:first-project root# cat README.md 
# My First Git Project

## Future Work
* Add License
* Add Personal markdown file
```

```
BW-MacBook-Pro:first-project root# git status
On branch master
Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git checkout -- <file>..." to discard changes in working directory)

modified:   README.md

no changes added to commit (use "git add" and/or "git commit -a")
BW-MacBook-Pro:first-project root# git add README.md 
BW-MacBook-Pro:first-project root# git status
On branch master
Changes to be committed:
(use "git reset HEAD <file>..." to unstage)

modified:   README.md

BW-MacBook-Pro:first-project root# git commit -m "Added markdown" 
[master a1c1a0c] Added markdown
 1 file changed, 6 insertions(+)
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# git commit -am "Modified my markdown"
[master b9a1624] Modified my markdown
 1 file changed, 2 insertions(+), 2 deletions(-)
BW-MacBook-Pro:first-project root# 

git commit -am  (add modified)
```


*git01 and git02 screenshots*

then push the project to github

```
git remote add origin https://github.com/billwestfall/first-project.git

BW-MacBook-Pro:first-project root# git remote -v
origin	https://github.com/billwestfall/first-project.git (fetch)
origin	https://github.com/billwestfall/first-project.git (push)
BW-MacBook-Pro:first-project root# 


git push -u origin master
```
(creates new branch called origin on target)

```
BW-MacBook-Pro:first-project root# git push -u origin master
Username for 'https://github.com': billwestfall@yahoo.com
Password for 'https://billwestfall@yahoo.com@github.com': 
Counting objects: 9, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (5/5), done.
Writing objects: 100% (9/9), 825 bytes | 0 bytes/s, done.
Total 9 (delta 0), reused 0 (delta 0)
To https://github.com/billwestfall/first-project.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.
BW-MacBook-Pro:first-project root# 
```


remote tracking branches are locally immutable

```
 BW-MacBook-Pro:first-project root# git branch -r 
   origin/master
   
 shows remote branches
 
BW-MacBook-Pro:first-project root# git branch -a
* master
  remotes/origin/master
```
  
branch and also show the folder structure

```
BW-MacBook-Pro:first-project root# ls .git/refs/
heads   remotes tags

BW-MacBook-Pro:first-project root# ls .git/refs/remotes/origin/
master

BW-MacBook-Pro:first-project root# cat .git/HEAD 
ref: refs/heads/master

BW-MacBook-Pro:first-project root# git branch todo-license
BW-MacBook-Pro:first-project root# git branch -a
* master
  todo-license
  remotes/origin/master
  
  
  
BW-MacBook-Pro:first-project root# ls                       
.git      README.md                                         
BW-MacBook-Pro:first-project root# touch LICENSE            
BW-MacBook-Pro:first-project root# ls                       
.git      LICENSE   README.md                               
BW-MacBook-Pro:first-project root# status                   
-sh: status: command not found                              
BW-MacBook-Pro:first-project root# git status               
 On branch master                                          
 Untracked files:                                          
   (use "git add <file>..." to include in what will be comm
itted)                                                      
                                                           
       LICENSE                                             
nothing added to commit but untracked files present (use "gi
t add" to track)                                            
BW-MacBook-Pro:first-project root# git checkout todo-license
Switched to branch 'todo-license'                           
BW-MacBook-Pro:first-project root# ls                       
.git      LICENSE   README.md                               
BW-MacBook-Pro:first-project root# git status               
 On branch todo-license                                    
 Untracked files:                                          
   (use "git add <file>..." to include in what will be comm
itted)                                                      
                                                           
LICENSE
nothing added to commit but untracked files present (use "gi
t add" to track)
BW-MacBook-Pro:first-project root# 
BW-MacBook-Pro:first-project root# 
BW-MacBook-Pro:first-project root# 
BW-MacBook-Pro:first-project root# 
BW-MacBook-Pro:first-project root# 
BW-MacBook-Pro:first-project root# git add LICENSE 
BW-MacBook-Pro:first-project root# git status
 On branch todo-license
 Changes to be committed:
   (use "git reset HEAD <file>..." to unstage)

new file:   LICENSE

BW-MacBook-Pro:first-project root# git commit -m "Add LICENS
E file"
[todo-license 4e750ee] Add LICENSE file
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 LICENSE
BW-MacBook-Pro:first-project root# git push -u origin todo-L
ICENSE
Username for 'https://github.com': billwestfall@yahoo.com
Password for 'https://billwestfall@yahoo.com@github.com': 
fatal: todo-LICENSE cannot be resolved to branch.
Unexpected end of command stream
BW-MacBook-Pro:first-project root# git push -u origin todo-l
icense                                                      
Username for 'https://github.com': billwestfall@yahoo.com
Password for 'https://billwestfall@yahoo.com@github.com': 
Counting objects: 4, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 288 bytes | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/billwestfall/first-project.git
 * [new branch]      todo-license -> todo-license
Branch todo-license set up to track remote branch todo-licen
se from origin.
```

git04  screenshot

```
BW-MacBook-Pro:first-project root# git fetch
remote: Counting objects: 5, done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0)
Unpacking objects: 100% (3/3), done.
From https://github.com/billwestfall/first-project
   4e750ee..d6bda6e  todo-license -> origin/todo-license
```
   
 local branches -> tracking branches -> github
 
 
laptop [local branches -> tracking branches] -> github


* git pull - from Github to local (fetch + merge)
* git push - from local to Github
* fetch - Github to tracking
* merge - tracking to local

```
BW-MacBook-Pro:first-project root# git merge origin/todo-license
Updating 4e750ee..d6bda6e
Fast-forward
 LICENSE | 21 +++++++++++++++++++++
 1 file changed, 21 insertions(+)
```
 
 
 
git ahead and behind messages are just against the latest local version, not necessarily what exists on Github


https://github.com/billwestfall/first-project/tree/todo-license (hey it works!!)

even if working singly on a project, good idea to do a pull request

```
BW-MacBook-Pro:first-project root# vi README.md 
BW-MacBook-Pro:first-project root# git status
On branch todo-license
Changes not staged for commit:
   (use "git add <file>..." to update what will be committed)
   (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   README.md
```

no changes added to commit (use "git add" and/or "git commit -a")

```
BW-MacBook-Pro:first-project root# git add README.md 
BW-MacBook-Pro:first-project root# git commit -m "Removed the todo"
[todo-license 0f67136] Removed the todo
 1 file changed, 1 insertion(+), 1 deletion(-)
BW-MacBook-Pro:first-project root# git status
 On branch todo-license
 Your branch is ahead of 'origin/todo-license' by 1 commit.
   (use "git push" to publish your local commits)

nothing to commit, working directory clean
BW-MacBook-Pro:first-project root# git push
warning: push.default is unset; its implicit value is changing in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the current behavior after the default changes, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': billwestfall@yahoo.com
Password for 'https://billwestfall@yahoo.com@github.com': 
Counting objects: 5, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 357 bytes | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/billwestfall/first-project.git
   d6bda6e..0f67136  todo-license -> todo-license
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# git checkout master
Switched to branch 'master'
BW-MacBook-Pro:first-project root# git pull
remote: Counting objects: 1, done.
remote: Total 1 (delta 0), reused 0 (delta 0)
Unpacking objects: 100% (1/1), done.
From https://github.com/billwestfall/first-project
   b9a1624..06e6e06  master     -> origin/master
Updating b9a1624..06e6e06
Fast-forward
 LICENSE   | 21 +++++++++++++++++++++
 README.md |  2 +-
 2 files changed, 22 insertions(+), 1 deletion(-)
 create mode 100644 LICENSE
BW-MacBook-Pro:first-project root# git status
 On branch master
nothing to commit, working directory clean
BW-MacBook-Pro:first-project root# ls
.git      LICENSE   README.md
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# git branch -d todo-license
Deleted branch todo-license (was 0f67136).
```

there's still a tracking branch so need to delete that too

delete branch on Github (see screenshot 07)

```
BW-MacBook-Pro:first-project root# git fetch --prune    (this deletes the tracking branch since the Github and local branch don't exist anymore)
 x [deleted]         (none)     -> origin/todo-license


BW-MacBook-Pro:first-project root# git branch -a
* master
  remotes/origin/master
```  
  
git fetch will only effect the tracking branches (won't effect local or remote)



* log - take a look at previous commits

* git log - pipes entire log to less (so you'll have to manually enter to bottom)


```
BW-MacBook-Pro:first-project root# git log -2
commit 06e6e06305695f8b43ca4a5a95856cdcbf84ae4d
Merge: b9a1624 0f67136
Author: billwestfall <billwestfall@yahoo.com>
Date:   Wed Apr 9 10:56:42 2014 -0700

    Merge pull request #1 from billwestfall/todo-license
    
    Todo license

commit 0f67136bff657704709507eb53353bf6b900c428
Author: Bill Westfall <billwestfall@yahoo.com>
Date:   Wed Apr 9 10:53:29 2014 -0700

    Removed the todo
```


* git log --stat
* git log --patch


```
BW-MacBook-Pro:first-project root# git log --stat -3
BW-MacBook-Pro:first-project root# git log --stat -3
commit 06e6e06305695f8b43ca4a5a95856cdcbf84ae4d
Merge: b9a1624 0f67136
Author: billwestfall <billwestfall@yahoo.com>
Date:   Wed Apr 9 10:56:42 2014 -0700

    Merge pull request #1 from billwestfall/todo-license
    
    Todo license

commit 0f67136bff657704709507eb53353bf6b900c428
Author: Bill Westfall <billwestfall@yahoo.com>
Date:   Wed Apr 9 10:53:29 2014 -0700

    Removed the todo

 README.md | 2 +-
 1 file changed, 1 insertion(+), 1 deletion(-)

commit d6bda6e8cbf05b0754967d7a3ece13e07d593224
Author: billwestfall <billwestfall@yahoo.com>
Date:   Wed Apr 9 10:22:01 2014 -0700

    Update LICENSE
    
    Yeah license

 LICENSE | 21 +++++++++++++++++++++
 1 file changed, 21 insertions(+)
``` 
 
* git log --stat showing the changes with commit 
* git log --patch -2

```
BW-MacBook-Pro:first-project root# git log --patch -2
commit 06e6e06305695f8b43ca4a5a95856cdcbf84ae4d
Merge: b9a1624 0f67136
Author: billwestfall <billwestfall@yahoo.com>
Date:   Wed Apr 9 10:56:42 2014 -0700

    Merge pull request #1 from billwestfall/todo-license
    
    Todo license

commit 0f67136bff657704709507eb53353bf6b900c428
Author: Bill Westfall <billwestfall@yahoo.com>
Date:   Wed Apr 9 10:53:29 2014 -0700

    Removed the todo

diff --git a/README.md b/README.md
index b23e497..e61d9f7 100644
--- a/README.md
+++ b/README.md
@@ -1,6 +1,6 @@
 # My First Github Project
 
 ## Future Work yeah
-* Add License
+
 * Add Personal markdown file
 

BW-MacBook-Pro:first-project root# git log -2 --format=raw
commit 06e6e06305695f8b43ca4a5a95856cdcbf84ae4d
tree 95462e01895333f3eccf0bf607bceeb92f54093e
parent b9a16246ca40944f1da23e3a6d08febac8f0b4d2
parent 0f67136bff657704709507eb53353bf6b900c428
author billwestfall <billwestfall@yahoo.com> 1397066202 -0700
committer billwestfall <billwestfall@yahoo.com> 1397066202 -0700

    Merge pull request #1 from billwestfall/todo-license
    
    Todo license

commit 0f67136bff657704709507eb53353bf6b900c428
tree 95462e01895333f3eccf0bf607bceeb92f54093e
parent d6bda6e8cbf05b0754967d7a3ece13e07d593224
author Bill Westfall <billwestfall@yahoo.com> 1397066009 -0700
committer Bill Westfall <billwestfall@yahoo.com> 1397066009 -0700

    Removed the todo
BW-MacBook-Pro:first-project root# 
```

* git log --word-diff --patch
* git log --graph

```
acBook-Pro:first-project root# git log --oneline
06e6e06 Merge pull request #1 from billwestfall/todo-license
0f67136 Removed the todo
d6bda6e Update LICENSE
4e750ee Add LICENSE file
b9a1624 Modified my markdown
a1c1a0c Added markdown
226dd93 first commit for the README
BW-MacBook-Pro:first-project root# git log --oneline --decorate
06e6e06 (HEAD, origin/master, master) Merge pull request #1 from billwestfall/to
0f67136 Removed the todo
d6bda6e Update LICENSE
4e750ee Add LICENSE file
b9a1624 Modified my markdown
a1c1a0c Added markdown
226dd93 first commit for the README
BW-MacBook-Pro:first-project root# git log --oneline --decorate --graph --all
*   06e6e06 (HEAD, origin/master, master) Merge pull request #1 from billwestfal
|\  
| * 0f67136 Removed the todo
| * d6bda6e Update LICENSE
| * 4e750ee Add LICENSE file
|/  
* b9a1624 Modified my markdown
* a1c1a0c Added markdown
* 226dd93 first commit for the README
```

* git log -S <string to search>
* git log --grep="regex-to-search"
* git diff - review the changes that you want to commit

create a file on master, but then move the file to a branch

```
acBook-Pro:first-project root# git log --oneline
06e6e06 Merge pull request #1 from billwestfall/todo-license
0f67136 Removed the todo
d6bda6e Update LICENSE
4e750ee Add LICENSE file
b9a1624 Modified my markdown
a1c1a0c Added markdown
226dd93 first commit for the README
BW-MacBook-Pro:first-project root# git log --oneline --decorate
06e6e06 (HEAD, origin/master, master) Merge pull request #1 from billwestfall/to
0f67136 Removed the todo
d6bda6e Update LICENSE
4e750ee Add LICENSE file
b9a1624 Modified my markdown
a1c1a0c Added markdown
226dd93 first commit for the README
BW-MacBook-Pro:first-project root# git log --oneline --decorate --graph --all
*   06e6e06 (HEAD, origin/master, master) Merge pull request #1 from billwestfal
|\  
| * 0f67136 Removed the todo
| * d6bda6e Update LICENSE
| * 4e750ee Add LICENSE file
|/  
* b9a1624 Modified my markdown
* a1c1a0c Added markdown
* 226dd93 first commit for the README



BW-MacBook-Pro:first-project root# git reset --hard origin/master
HEAD is now at 06e6e06 Merge pull request #1 from billwestfall/todo-license
BW-MacBook-Pro:first-project root# git log --oneline --decorate --graph --all -5
* 787f7ca (personal-file) Added personal file
*   06e6e06 (HEAD, origin/master, master) Merge pull request #1 from billwestfal
|\  
| * 0f67136 Removed the todo
| * d6bda6e Update LICENSE
| * 4e750ee Add LICENSE file
|/  
BW-MacBook-Pro:first-project root# git checkout personal-file
Switched to branch 'personal-file'
BW-MacBook-Pro:first-project root# git status
 On branch personal-file
nothing to commit, working directory clean
BW-MacBook-Pro:first-project root# ls
.git      LICENSE   README.md billw.md
BW-MacBook-Pro:first-project root# vi billw.md 
BW-MacBook-Pro:first-project root# git status
 On branch personal-file
 Changes not staged for commit:
   (use "git add <file>..." to update what will be committed)
   (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   billw.md

no changes added to commit (use "git add" and/or "git commit -a")
BW-MacBook-Pro:first-project root# git diff 
diff --git a/billw.md b/billw.md
index ae72a0a..b2bfc28 100644
--- a/billw.md
+++ b/billw.md
@@ -1,3 +1,6 @@
 # Hi
 This is billw
+hello world
 
+## Location
+* Richmond, CA
BW-MacBook-Pro:first-project root# vi billw.md 
BW-MacBook-Pro:first-project root# git diff
diff --git a/billw.md b/billw.md
index ae72a0a..5885424 100644
--- a/billw.md
+++ b/billw.md
@@ -1,3 +1,5 @@
 # Hi
 This is billw
-
+hello world
+## Location
+* Richmond, CA
BW-MacBook-Pro:first-project root# git add billw.md 
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# vi README.md 
BW-MacBook-Pro:first-project root# git status
 On branch personal-file
 Changes to be committed:
   (use "git reset HEAD <file>..." to unstage)

	modified:   billw.md

 Changes not staged for commit:
   (use "git add <file>..." to update what will be committed)
   (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   README.md

BW-MacBook-Pro:first-project root# git add README.md 
BW-MacBook-Pro:first-project root# git status
 On branch personal-file
 Changes to be committed:
   (use "git reset HEAD <file>..." to unstage)

	modified:   README.md
	modified:   billw.md

BW-MacBook-Pro:first-project root# git diff
BW-MacBook-Pro:first-project root# git diff --staged
diff --git a/README.md b/README.md
index e61d9f7..42e01f0 100644
--- a/README.md
+++ b/README.md
@@ -1,6 +1,6 @@
 # My First Github Project
 
-## Future Work yeah
 
-* Add Personal markdown file
+
+
 
diff --git a/billw.md b/billw.md
index ae72a0a..5885424 100644
--- a/billw.md
+++ b/billw.md
@@ -1,3 +1,5 @@
 # Hi
 This is billw
-
+hello world
+## Location
+* Richmond, CA
BW-MacBook-Pro:first-project root# 
```

modify again and now two versions of same file:

```
BW-MacBook-Pro:first-project root# vi README.md 
BW-MacBook-Pro:first-project root# git status
 On branch personal-file
 Changes to be committed:
   (use "git reset HEAD <file>..." to unstage)

	modified:   README.md
	modified:   billw.md

 Changes not staged for commit:
   (use "git add <file>..." to update what will be committed)
   (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   README.md

BW-MacBook-Pro:first-project root# 


BW-MacBook-Pro:first-project root# git diff
diff --git a/README.md b/README.md
index 42e01f0..2e05b02 100644
--- a/README.md
+++ b/README.md
@@ -1,6 +1,8 @@
 # My First Github Project
 
+## Author
 
+* [Hey](http://www.google.com)

BW-MacBook-Pro:first-project root# git diff --staged
diff --git a/README.md b/README.md
index e61d9f7..42e01f0 100644
--- a/README.md
+++ b/README.md
@@ -1,6 +1,6 @@
 # My First Github Project
 
-## Future Work yeah
 
-* Add Personal markdown file
+
+
 
diff --git a/billw.md b/billw.md
index ae72a0a..5885424 100644
--- a/billw.md
+++ b/billw.md
@@ -1,3 +1,5 @@
 # Hi
 This is billw
-
+hello world
+## Location
+* Richmond, CA
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# git status
 On branch personal-file
 Changes not staged for commit:
   (use "git add <file>..." to update what will be committed)
   (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   README.md

no changes added to commit (use "git add" and/or "git commit -a")
BW-MacBook-Pro:first-project root# git diff
diff --git a/README.md b/README.md
index 42e01f0..2e05b02 100644
--- a/README.md
+++ b/README.md
@@ -1,6 +1,8 @@
 # My First Github Project
 
+## Author
 
+* [Hey](http://www.google.com)
 
 
 
BW-MacBook-Pro:first-project root# git diff --staged
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# git diff HEAD
diff --git a/README.md b/README.md
index 42e01f0..2e05b02 100644
--- a/README.md
+++ b/README.md
@@ -1,6 +1,8 @@
 # My First Github Project
 
+## Author
 
+* [Hey](http://www.google.com)
 
 
 
BW-MacBook-Pro:first-project root# git status
 On branch personal-file
 Changes not staged for commit:
   (use "git add <file>..." to update what will be committed)
   (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   README.md

no changes added to commit (use "git add" and/or "git commit -a")
BW-MacBook-Pro:first-project root# git add .
BW-MacBook-Pro:first-project root# git status
 On branch personal-file
 Changes to be committed:
   (use "git reset HEAD <file>..." to unstage)

	modified:   README.md

BW-MacBook-Pro:first-project root# vi billw.md 
BW-MacBook-Pro:first-project root# git diff HEAD
diff --git a/README.md b/README.md
index 42e01f0..2e05b02 100644
--- a/README.md
+++ b/README.md
@@ -1,6 +1,8 @@
 # My First Github Project
 
+## Author
 
+* [Hey](http://www.google.com)
 
 
 
diff --git a/billw.md b/billw.md
index 5885424..d596478 100644
--- a/billw.md
+++ b/billw.md
@@ -1,5 +1,5 @@
 # Hi
 This is billw
 hello world
-## Location
+## Location, hometown
 * Richmond, CA
BW-MacBook-Pro:first-project root# git add .
BW-MacBook-Pro:first-project root# git status
 On branch personal-file
 Changes to be committed:
   (use "git reset HEAD <file>..." to unstage)

	modified:   README.md
	modified:   billw.md

BW-MacBook-Pro:first-project root# git commit -m "Now ready to commit all changes"
[personal-file 60d409c] Now ready to commit all changes
 2 files changed, 3 insertions(+), 1 deletion(-)
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# git log -2 --color-words -p
commit 60d409cfac4c732d249791598715b5eb485c04b3
Author: Bill Westfall <billwestfall@yahoo.com>
Date:   Wed Apr 9 11:37:23 2014 -0700

    Now ready to commit all changes

diff --git a/README.md b/README.md
index 42e01f0..2e05b02 100644
--- a/README.md
+++ b/README.md
@@ -1,6 +1,8 @@
 My First Github Project

 Author

 [Hey](http://www.google.com)



diff --git a/billw.md b/billw.md
index 5885424..d596478 100644
--- a/billw.md
+++ b/billw.md
@@ -1,5 +1,5 @@
 Hi
This is billw
hello world
 LocationLocation, hometown
 Richmond, CA

commit a7951dafb2f2301e316e8f3d5ef489ff67d544f3
Author: Bill Westfall <billwestfall@yahoo.com>
Date:   Wed Apr 9 11:34:50 2014 -0700

    What if I commit without latest change

diff --git a/README.md b/README.md
index e61d9f7..42e01f0 100644
--- a/README.md
+++ b/README.md
@@ -1,6 +1,6 @@
 My First Github Project

 Future Work yeah

 Add Personal markdown file


diff --git a/billw.md b/billw.md
index ae72a0a..5885424 100644
--- a/billw.md
+++ b/billw.md
@@ -1,3 +1,5 @@
 Hi
This is billw
hello world
 Location
 Richmond, CA
BW-MacBook-Pro:first-project root# 
```

what does the branch have that the master does not?:

```
BW-MacBook-Pro:first-project root# git log master..personal-file --oneline
60d409c Now ready to commit all changes
a7951da What if I commit without latest change
787f7ca Added personal file
BW-MacBook-Pro:first-project root# 


BW-MacBook-Pro:first-project root# git log master..personal-file --oneline --stat
60d409c Now ready to commit all changes
 README.md | 2 ++
 billw.md  | 2 +-
 2 files changed, 3 insertions(+), 1 deletion(-)
a7951da What if I commit without latest change
 README.md | 4 ++--
 billw.md  | 4 +++-
 2 files changed, 5 insertions(+), 3 deletions(-)
787f7ca Added personal file
 billw.md | 3 +++
 1 file changed, 3 insertions(+)
BW-MacBook-Pro:first-project root# 


BW-MacBook-Pro:first-project root# git checkout master
Switched to branch 'master'
BW-MacBook-Pro:first-project root# git merge personal-file
Updating 06e6e06..60d409c
Fast-forward
 README.md | 6 ++++--
 billw.md  | 5 +++++
 2 files changed, 9 insertions(+), 2 deletions(-)
 create mode 100644 billw.md



BW-MacBook-Pro:first-project root# git log --oneline --decorate --graph --all
* 60d409c (HEAD, personal-file, master) Now ready to commit all changes
* a7951da What if I commit without latest change
* 787f7ca Added personal file
*   06e6e06 (origin/master) Merge pull request #1 from billwestfall/todo-license
|\  
| * 0f67136 Removed the todo
| * d6bda6e Update LICENSE
| * 4e750ee Add LICENSE file
|/  
* b9a1624 Modified my markdown
* a1c1a0c Added markdown
* 226dd93 first commit for the README
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# git branch -d personal-file
Deleted branch personal-file (was 60d409c).

BW-MacBook-Pro:first-project root# git config --global alias.logbw01 "log --oneline --decorate --graph --all"
BW-MacBook-Pro:first-project root# git logbw01
* 60d409c (HEAD, master) Now ready to commit all changes
* a7951da What if I commit without latest change
* 787f7ca Added personal file
*   06e6e06 (origin/master) Merge pull request #1 from billwestfall/todo-license
|\  
| * 0f67136 Removed the todo
| * d6bda6e Update LICENSE
| * 4e750ee Add LICENSE file
|/  
* b9a1624 Modified my markdown
* a1c1a0c Added markdown
* 226dd93 first commit for the README
BW-MacBook-Pro:first-project root# 
```

system git settings will cross users on a machine

* .gitignore

```
BW-MacBook-Pro:first-project root# touch personal-secrets.md
BW-MacBook-Pro:first-project root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 3 commits.
   (use "git push" to publish your local commits)

 Untracked files:
   (use "git add <file>..." to include in what will be committed)

	personal-secrets.md
nothing added to commit but untracked files present (use "git add" to track)
BW-MacBook-Pro:first-project root# touch .gitignore
BW-MacBook-Pro:first-project root# ls
.git                LICENSE             billw.md
.gitignore          README.md           personal-secrets.md
BW-MacBook-Pro:first-project root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 3 commits.
   (use "git push" to publish your local commits)

 Untracked files:
   (use "git add <file>..." to include in what will be committed)

	.gitignore
	personal-secrets.md
nothing added to commit but untracked files present (use "git add" to track)
BW-MacBook-Pro:first-project root# vi .gitignore 
BW-MacBook-Pro:first-project root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 3 commits.
   (use "git push" to publish your local commits)

 Untracked files:
   (use "git add <file>..." to include in what will be committed)

	.gitignore
nothing added to commit but untracked files present (use "git add" to track)
BW-MacBook-Pro:first-project root# cat .gitignore 
personal-secrets.md
BW-MacBook-Pro:first-project root# git add .gitignore 
BW-MacBook-Pro:first-project root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 3 commits.
   (use "git push" to publish your local commits)

 Changes to be committed:
   (use "git reset HEAD <file>..." to unstage)

	new file:   .gitignore

BW-MacBook-Pro:first-project root# git commit -m "First git ignore"
[master b018b32] First git ignore
 1 file changed, 1 insertion(+)
 create mode 100644 .gitignore
BW-MacBook-Pro:first-project root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 4 commits.
   (use "git push" to publish your local commits)

nothing to commit, working directory clean
BW-MacBook-Pro:first-project root# 
```

add stuff to .gitignore like :

```
*.log
archives/
log*/
```

```
BW-MacBook-Pro:first-project root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 4 commits.
   (use "git push" to publish your local commits)

nothing to commit, working directory clean
BW-MacBook-Pro:first-project root# mkdir logs
BW-MacBook-Pro:first-project root# ls
.git                LICENSE             billw.md            personal-secrets.md
.gitignore          README.md           logs
BW-MacBook-Pro:first-project root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 4 commits.
   (use "git push" to publish your local commits)

nothing to commit, working directory clean
BW-MacBook-Pro:first-project root# touch logs/development.log
BW-MacBook-Pro:first-project root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 4 commits.
   (use "git push" to publish your local commits)

 Untracked files:
   (use "git add <file>..." to include in what will be committed)

	logs/
nothing added to commit but untracked files present (use "git add" to track)
BW-MacBook-Pro:first-project root# cd logs/
BW-MacBook-Pro:logs root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 4 commits.
   (use "git push" to publish your local commits)

 Untracked files:
   (use "git add <file>..." to include in what will be committed)

	./
nothing added to commit but untracked files present (use "git add" to track)
BW-MacBook-Pro:logs root# cd ..
BW-MacBook-Pro:first-project root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 4 commits.
   (use "git push" to publish your local commits)

 Untracked files:
   (use "git add <file>..." to include in what will be committed)

	logs/
nothing added to commit but untracked files present (use "git add" to track)
BW-MacBook-Pro:first-project root# ls logs/
development.log
BW-MacBook-Pro:first-project root# vi .gitignore 
BW-MacBook-Pro:first-project root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 4 commits.
   (use "git push" to publish your local commits)

 Changes not staged for commit:
   (use "git add <file>..." to update what will be committed)
   (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   .gitignore

no changes added to commit (use "git add" and/or "git commit -a")
BW-MacBook-Pro:first-project root# ls
.git                LICENSE             billw.md            personal-secrets.md
.gitignore          README.md           logs
BW-MacBook-Pro:first-project root# mkdir notes 
BW-MacBook-Pro:first-project root# ls
.git                LICENSE             billw.md            notes
.gitignore          README.md           logs                personal-secrets.md
BW-MacBook-Pro:first-project root# touch notes/development.notes
BW-MacBook-Pro:first-project root# touch notes/production.notes
BW-MacBook-Pro:first-project root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 4 commits.
   (use "git push" to publish your local commits)

 Changes not staged for commit:
   (use "git add <file>..." to update what will be committed)
   (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   .gitignore

no changes added to commit (use "git add" and/or "git commit -a")
BW-MacBook-Pro:first-project root# cat .gitignore 
personal-secrets.md
*.log
notes/
!production.notes
BW-MacBook-Pro:first-project root# vi .gitignore 
BW-MacBook-Pro:first-project root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 4 commits.
   (use "git push" to publish your local commits)

 Changes not staged for commit:
   (use "git add <file>..." to update what will be committed)
   (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   .gitignore

 Untracked files:
   (use "git add <file>..." to include in what will be committed)

	notes/
no changes added to commit (use "git add" and/or "git commit -a")
BW-MacBook-Pro:first-project root# vi .gitignore 
BW-MacBook-Pro:first-project root# ls notes/
development.notes production.notes
BW-MacBook-Pro:first-project root# ls
.git                LICENSE             billw.md            notes
.gitignore          README.md           logs                personal-secrets.md
BW-MacBook-Pro:first-project root# git add 
Nothing specified, nothing added.
Maybe you wanted to say 'git add .'?
BW-MacBook-Pro:first-project root# git add .
BW-MacBook-Pro:first-project root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 4 commits.
   (use "git push" to publish your local commits)

 Changes to be committed:
   (use "git reset HEAD <file>..." to unstage)

	modified:   .gitignore
	new file:   notes/production.notes

BW-MacBook-Pro:first-project root# git commit -m "Ignoring the dev notes but keeping the prod notes"
[master af4346e] Ignoring the dev notes but keeping the prod notes
 2 files changed, 3 insertions(+)
 create mode 100644 notes/production.notes
BW-MacBook-Pro:first-project root# git status
 On branch master
 Your branch is ahead of 'origin/master' by 5 commits.
   (use "git push" to publish your local commits)

nothing to commit, working directory clean
BW-MacBook-Pro:first-project root# 
```

git08-10 screenshots, then

```
BW-MacBook-Pro:first-project root# git fetch
remote: Counting objects: 7, done.
remote: Compressing objects: 100% (6/6), done.
remote: Total 6 (delta 3), reused 0 (delta 0)
Unpacking objects: 100% (6/6), done.
From https://github.com/billwestfall/first-project
 * [new branch]      css-files  -> origin/css-files
 
git remote set-url origin https://github.com/billwestfall/first-project.git 
```

to reset the origin

```
BW-MacBook-Pro:first-project root# git checkout css-files
Branch css-files set up to track remote branch css-files from origin.
Switched to a new branch 'css-files'
BW-MacBook-Pro:first-project root# ls
.git                README.md           logs
.gitignore          billw.md            notes
LICENSE             default.css         personal-secrets.md
BW-MacBook-Pro:first-project root# git checkout master
Switched to branch 'master'
BW-MacBook-Pro:first-project root# ls
.git                LICENSE             billw.md            notes
.gitignore          README.md           logs                personal-secrets.md
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# git logbw01 -10
* ec4c363 (HEAD, origin/css-files, css-files) add body font size
* c5692cb create some default styles
* af4346e (origin/master, master) Ignoring the dev notes but keeping the prod no
* b018b32 First git ignore
* 60d409c Now ready to commit all changes
* a7951da What if I commit without latest change
* 787f7ca Added personal file
*   06e6e06 Merge pull request #1 from billwestfall/todo-license
|\  
| * 0f67136 Removed the todo
| * d6bda6e Update LICENSE
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# git fetch
remote: Counting objects: 8, done.
remote: Compressing objects: 100% (6/6), done.
remote: Total 6 (delta 4), reused 0 (delta 0)
Unpacking objects: 100% (6/6), done.
From https://github.com/billwestfall/first-project
   ec4c363..e65dae5  css-files  -> origin/css-files
BW-MacBook-Pro:first-project root# 
```
_merge fast forward_

like all development happened on master even though all the work actually happened on a branch

_recursive merge_
useful if work is going on the master while work is going on your branch
then all histories can merge into the master

```
BW-MacBook-Pro:first-project root# git checkout master
Switched to branch 'master'
BW-MacBook-Pro:first-project root# git merge css-files
Updating af4346e..ec4c363
Fast-forward
 default.css | 8 ++++++++
 1 file changed, 8 insertions(+)
 create mode 100644 default.css
 
 BW-MacBook-Pro:first-project root# git merge css-files
 Updating af4346e..ec4c363
 Fast-forward
  default.css | 8 ++++++++
  1 file changed, 8 insertions(+)
  create mode 100644 default.css
 BW-MacBook-Pro:first-project root# git branch html-files
 BW-MacBook-Pro:first-project root# git checkout html-files
 Switched to branch 'html-files'
 BW-MacBook-Pro:first-project root# ls
 .git                README.md           logs
 .gitignore          billw.md            notes
 LICENSE             default.css         personal-secrets.md
 BW-MacBook-Pro:first-project root# touch index.html
 BW-MacBook-Pro:first-project root# vi index.html 
 BW-MacBook-Pro:first-project root# vi index.html 
 BW-MacBook-Pro:first-project root# git add index.html  
 BW-MacBook-Pro:first-project root# git commit -m "First commit of index" 
 [html-files b532ff4] First commit of index
  1 file changed, 4 insertions(+)
  create mode 100644 index.html
 BW-MacBook-Pro:first-project root# vi index.html 
 BW-MacBook-Pro:first-project root# git add index.html 
 BW-MacBook-Pro:first-project root# git commit -am "Add body"
 [html-files 44c35d0] Add body
  1 file changed, 2 insertions(+)
 BW-MacBook-Pro:first-project root# ls
 .git                README.md           index.html          personal-secrets.md
 .gitignore          billw.md            logs
 LICENSE             default.css         notes
 BW-MacBook-Pro:first-project root# git checkout master
 Switched to branch 'master'
 Your branch is ahead of 'origin/master' by 2 commits.
   (use "git push" to publish your local commits)
 BW-MacBook-Pro:first-project root# git fetch
 fatal: repository 'https://github.com/billwestfall/first-project.git/' not found
 BW-MacBook-Pro:first-project root# vi README.md 
 BW-MacBook-Pro:first-project root# git status
 # On branch master
 # Your branch is ahead of 'origin/master' by 2 commits.
 #   (use "git push" to publish your local commits)
 #
 # Changes not staged for commit:
 #   (use "git add <file>..." to update what will be committed)
 #   (use "git checkout -- <file>..." to discard changes in working directory)
 #
 #	modified:   README.md
 #
 no changes added to commit (use "git add" and/or "git commit -a")
 BW-MacBook-Pro:first-project root# git diif
 git: 'diif' is not a git command. See 'git --help'.

 Did you mean this?
 	diff
 BW-MacBook-Pro:first-project root# git diff
 diff --git a/README.md b/README.md
 index 2e05b02..f18feed 100644
 --- a/README.md
 +++ b/README.md
 @@ -1,4 +1,5 @@
  # My First Github Project
 +This project is to learn git
 
  ## Author
 
 BW-MacBook-Pro:first-project root# git add README.md 
 BW-MacBook-Pro:first-project root# git commit -am "html ref to README"
 [master 9a530ae] html ref to README
  1 file changed, 1 insertion(+)
 BW-MacBook-Pro:first-project root# git logbw01
 * 9a530ae (HEAD, master) html ref to README
 | * 44c35d0 (html-files) Add body
 | * b532ff4 First commit of index
 |/  
 | * e65dae5 (origin/css-files) misspelled container
 | * d0561e6 add large
 |/  
 * ec4c363 (css-files) add body font size
 * c5692cb create some default styles
 * af4346e (origin/master) Ignoring the dev notes but keeping the prod notes
 * b018b32 First git ignore
 * 60d409c Now ready to commit all changes
 * a7951da What if I commit without latest change
 * 787f7ca Added personal file
 *   06e6e06 Merge pull request #1 from billwestfall/todo-license
 |\  
 | * 0f67136 Removed the todo
 | * d6bda6e Update LICENSE
 | * 4e750ee Add LICENSE file
 |/  
 * b9a1624 Modified my markdown
 * a1c1a0c Added markdown
 * 226dd93 first commit for the README
 BW-MacBook-Pro:first-project root# 
 
 
 BW-MacBook-Pro:first-project root# git merge html-files
 Merge made by the 'recursive' strategy.
  index.html | 6 ++++++
  1 file changed, 6 insertions(+)
  create mode 100644 index.html
 BW-MacBook-Pro:first-project root#
 
BW-MacBook-Pro:first-project root# git logbw01
*   3753b8e (HEAD, master) Merge branch 'html-files'
|\  
| * 44c35d0 (html-files) Add body
| * b532ff4 First commit of index
* | 9a530ae html ref to README
|/  
| * e65dae5 (origin/css-files) misspelled container
| * d0561e6 add large
|/  
* ec4c363 (css-files) add body font size
* c5692cb create some default styles
* af4346e (origin/master) Ignoring the dev notes but keeping the prod notes
* b018b32 First git ignore
* 60d409c Now ready to commit all changes
* a7951da What if I commit without latest change
* 787f7ca Added personal file
*   06e6e06 Merge pull request #1 from billwestfall/todo-license
|\  
| * 0f67136 Removed the todo
| * d6bda6e Update LICENSE
| * 4e750ee Add LICENSE file
|/  
* b9a1624 Modified my markdown
* a1c1a0c Added markdown
* 226dd93 first commit for the README
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# git branch html-content
BW-MacBook-Pro:first-project root# git checkout html-content
Switched to branch 'html-content'
BW-MacBook-Pro:first-project root# vi index.html 
BW-MacBook-Pro:first-project root# git add index.html 
BW-MacBook-Pro:first-project root# git commit -m "First commit on the html content branch"
[html-content 2a9bdfb] First commit on the html content branch
 1 file changed, 3 insertions(+)
BW-MacBook-Pro:first-project root# git checkout master
Switched to branch 'master'
Your branch is ahead of 'origin/master' by 6 commits.
  (use "git push" to publish your local commits)
BW-MacBook-Pro:first-project root# git merge --no-ff html-content
Merge made by the 'recursive' strategy.
 index.html | 3 +++
 1 file changed, 3 insertions(+)
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# git logbw01
*   b396bb7 (HEAD, master) Merge branch 'html-content'
|\  
| * 2a9bdfb (html-content) First commit on the html content branch
|/  
*   3753b8e Merge branch 'html-files'
|\  
| * 44c35d0 Add body
| * b532ff4 First commit of index
* | 9a530ae html ref to README
|/  
| * e65dae5 (origin/css-files) misspelled container
| * d0561e6 add large
|/  
* ec4c363 (css-files) add body font size
* c5692cb create some default styles
* af4346e (origin/master) Ignoring the dev notes but keeping the prod notes
* b018b32 First git ignore
* 60d409c Now ready to commit all changes
* a7951da What if I commit without latest change
* 787f7ca Added personal file
*   06e6e06 Merge pull request #1 from billwestfall/todo-license
|\  
| * 0f67136 Removed the todo
| * d6bda6e Update LICENSE
| * 4e750ee Add LICENSE file
|/  
* b9a1624 Modified my markdown
* a1c1a0c Added markdown
* 226dd93 first commit for the README
BW-MacBook-Pro:first-project root# 
```

so fast forward will pull all to appear as all happening on the master
but no fast forward will show the commits on all branches

git checkout just moves the git/refs to points to a hash that refers to the branch you want

```
BW-MacBook-Pro:first-project root# vi notes/production.notes 
BW-MacBook-Pro:first-project root# git status
 On branch notes
 Changes not staged for commit:
   (use "git add <file>..." to update what will be committed)
   (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   notes/production.notes

no changes added to commit (use "git add" and/or "git commit -a")
BW-MacBook-Pro:first-project root# git add notes/production.notes 
BW-MacBook-Pro:first-project root# git commit -m "add prod note"
[notes cdd6b47] add prod note
 1 file changed, 1 insertion(+)
BW-MacBook-Pro:first-project root# vi notes/production.notes 
BW-MacBook-Pro:first-project root# git add notes/production.notes 
BW-MacBook-Pro:first-project root# git commit -m "One more note"
[notes bb4a2d9] One more note
 1 file changed, 1 insertion(+)
BW-MacBook-Pro:first-project root# git logbw01 -10
* bb4a2d9 (HEAD, notes) One more note
* cdd6b47 add prod note
*   b396bb7 (master) Merge branch 'html-content'
|\  
| * 2a9bdfb (html-content) First commit on the html content branch
|/  
*   3753b8e Merge branch 'html-files'
|\  
| * 44c35d0 Add body
| * b532ff4 First commit of index
* | 9a530ae html ref to README
|/  
| * e65dae5 (origin/css-files) misspelled container
| * d0561e6 add large
|/  
BW-MacBook-Pro:first-project root# git checkout master
Switched to branch 'master'
Your branch is ahead of 'origin/master' by 8 commits.
  (use "git push" to publish your local commits)
BW-MacBook-Pro:first-project root# ls notes/production.notes 
notes/production.notes
BW-MacBook-Pro:first-project root# cat notes/production.notes 
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# git checkout master
Already on 'master'
Your branch is ahead of 'origin/master' by 8 commits.
  (use "git push" to publish your local commits)
BW-MacBook-Pro:first-project root# git merge notes
Updating b396bb7..bb4a2d9
Fast-forward
 notes/production.notes | 2 ++
 1 file changed, 2 insertions(+)
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# git merge origin/css-files
Merge made by the 'recursive' strategy.
 default.css | 6 +++++-
 1 file changed, 5 insertions(+), 1 deletion(-)
BW-MacBook-Pro:first-project root# git logbw01
*   91f1bd0 (HEAD, master) Merge remote-tracking branch 'origin/css-files'
|\  
| * e65dae5 (origin/css-files) misspelled container
| * d0561e6 add large
* | bb4a2d9 (notes) One more note
* | cdd6b47 add prod note
* |   b396bb7 Merge branch 'html-content'
|\ \  
| * | 2a9bdfb (html-content) First commit on the html content branch
|/ /  
* |   3753b8e Merge branch 'html-files'
|\ \  
| * | 44c35d0 Add body
| * | b532ff4 First commit of index
| |/  
* | 9a530ae html ref to README
|/  
* ec4c363 (css-files) add body font size
* c5692cb create some default styles
* af4346e (origin/master) Ignoring the dev notes but keeping the prod notes
* b018b32 First git ignore
* 60d409c Now ready to commit all changes
* a7951da What if I commit without latest change
* 787f7ca Added personal file
*   06e6e06 Merge pull request #1 from billwestfall/todo-license
|\  
| * 0f67136 Removed the todo
| * d6bda6e Update LICENSE
| * 4e750ee Add LICENSE file
|/  
* b9a1624 Modified my markdown
* a1c1a0c Added markdown
* 226dd93 first commit for the README
BW-MacBook-Pro:first-project root# 

BW-MacBook-Pro:first-project root# git branch
  css-files
  html-content
* master
  notes
BW-MacBook-Pro:first-project root# git push origin master
Username for 'https://github.com': billwestfall@yahoo.com
Password for 'https://billwestfall@yahoo.com@github.com': 
Counting objects: 30, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (21/21), done.
Writing objects: 100% (25/25), 2.28 KiB | 0 bytes/s, done.
Total 25 (delta 12), reused 0 (delta 0)
To https://github.com/billwestfall/first-project.git
   af4346e..91f1bd0  master -> master
BW-MacBook-Pro:first-project root# 
```

#### hands on collaborative project
https://github.com/githubteacher

```
BW-MacBook-Pro:scratch root# mkdir student
BW-MacBook-Pro:scratch root# cd student/
BW-MacBook-Pro:student root# git clone https://github.com/billwestfall/example-basic.git
Cloning into 'example-basic'...
remote: Counting objects: 20, done.
remote: Compressing objects: 100% (15/15), done.
remote: Total 20 (delta 2), reused 20 (delta 2)
Unpacking objects: 100% (20/20), done.
Checking connectivity... done
BW-MacBook-Pro:student root# ls
example-basic
BW-MacBook-Pro:student root# l
-sh: l: command not found
BW-MacBook-Pro:student root# ls
example-basic
BW-MacBook-Pro:student root# cd example-basic/
BW-MacBook-Pro:example-basic root# ls
.git       README.md  css        index.html
BW-MacBook-Pro:example-basic root# 
```

can change if you need

```
git remote set-url origin https://github.com/billwestfall/example-basic.git
```

git branch , then push to fork, and the merge request into master

```
BW-MacBook-Pro:example-basic root# git add billwestfall.md 
BW-MacBook-Pro:example-basic root# git status
 On branch billwestfall
 Changes to be committed:
   (use "git reset HEAD <file>..." to unstage)

new file:   billwestfall.md

BW-MacBook-Pro:example-basic root# git commit -m "Hey it's a file!!"
git commit -m "Hey it's a filegit status"
[billwestfall f901e06] Hey it's a filegit status
 1 file changed, 1 insertion(+)
 create mode 100644 billwestfall.md
BW-MacBook-Pro:example-basic root# git logbw01
* f901e06 (HEAD, billwestfall) Hey it's a filegit status
* a55987d (origin/master, origin/HEAD, master) Update stylesheet with code tag m
* 0edc5f0 Create default stylesheet
* a032713 Add project description to home page
* 00ce4a8 Update home page with document title, body titles
* 670099d Add initial home page and content structure
* c62b67e Initial commit
BW-MacBook-Pro:example-basic root# 

BW-MacBook-Pro:example-basic root# git branch
* billwestfall
  master
BW-MacBook-Pro:example-basic root# git branch -a
* billwestfall
  master
  remotes/origin/HEAD -> origin/master
  remotes/origin/master
BW-MacBook-Pro:example-basic root# git push -u origin billwestfall
Username for 'https://github.com': billwestfall@yahoo.com
Password for 'https://billwestfall@yahoo.com@github.com': 
Counting objects: 4, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 379 bytes | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/billwestfall/example-basic.git
 * [new branch]      billwestfall -> billwestfall
Branch billwestfall set up to track remote branch billwestfall from origin.
BW-MacBook-Pro:example-basic root# git config --global credential.helper 'cache --timeout=900' 
BW-MacBook-Pro:example-basic root# git push
warning: push.default is unset; its implicit value is changing in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the current behavior after the default changes, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': billwestfall@yahoo.com
Password for 'https://billwestfall@yahoo.com@github.com': 
Everything up-to-date
BW-MacBook-Pro:example-basic root# git push
warning: push.default is unset; its implicit value is changing in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the current behavior after the default changes, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Everything up-to-date
BW-MacBook-Pro:example-basic root# 
```

now keep in sync with the main

```
BW-MacBook-Pro:example-basic root# git branch -r
  origin/HEAD -> origin/master
  origin/billwestfall
  origin/master
  teacher/master
BW-MacBook-Pro:example-basic root# git branch
* billwestfall
  master
BW-MacBook-Pro:example-basic root# git merge teacher/master
Merge made by the 'recursive' strategy.
 githubstudent.md | 1 +
 1 file changed, 1 insertion(+)
 create mode 100644 githubstudent.md
BW-MacBook-Pro:example-basic root# git push origin billwestfall
Username for 'https://github.com': billwestfall@yahoo.com
Password for 'https://billwestfall@yahoo.com@github.com': 
Counting objects: 8, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (5/5), done.
Writing objects: 100% (6/6), 791 bytes | 0 bytes/s, done.
Total 6 (delta 2), reused 0 (delta 0)
To https://github.com/billwestfall/example-basic.git
   f901e06..c789111  billwestfall -> billwestfall
BW-MacBook-Pro:example-basic root# git merge teacher/billwestfall
merge: teacher/billwestfall - not something we can merge
BW-MacBook-Pro:example-basic root# git branch
* billwestfall
  master
BW-MacBook-Pro:example-basic root# git merge teacher/master
Already up-to-date.
BW-MacBook-Pro:example-basic root# git push origin billwestfall
Everything up-to-date
BW-MacBook-Pro:example-basic root# 
```

git add -A .

removing a file uses the same git add 


git reset - go back to the point in time before you took an action , like delete a file, to restore


* git reset --soft <REF>
* git reset --mixed <REF>
* git reset --hard <REF>

git soft - puts things back into staging area

`git reset HEAD <nameoffile>`

`git reset --mixed` - back to working directory

`git checkout -- index.html`  (add the file back in)

`git reset HEAD~1`  (move one commit back)


* soft= staging
* mixed= working


`git reflog`  - show all the times the HEAD was changed

git reflog may refer to a commit that has been deleted, so the reflog can restore to a point that doesn't appear in git logs anymore

`git reset --hard <refloghash>`

this will set back to the place that doesn't appear in the log

use reset --hard instead of a rm -rf and clone

`git reset --hard HEAD@{2}` - the reference in the reflog

after deleting master,

`git reset --hard HEAD@{2}` , same as above

conflicts -

ex.  modify a file on github and also change it locally , then commit locally, then try to checkout and merge the branch change into the master
This will lead to conflict message and will add conflict messages to the file


`git merge --abort`   (this will back out the change when you see that the conflicts are too complex)

`git stash` -  in the middle of a change, put the change into a temporary location , work on other files, then git stash pop to bring the change back

* git stash apply - reapplies the stash
* git stash list - lists the stash
* git stash drop - get rid of stash stored

`git stash show -p`

`git commit --amend`    (this to write over the last commit when you committed the last one a little fast)
