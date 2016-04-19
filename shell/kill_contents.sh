#!/bin/bash

echo "kill kibana"
ps aux | grep kibana | awk '{print $2}' | xargs kill
sleep 3
echo "kill elastic"
ps aux | grep elastic | awk '{print $2}' | xargs kill
sleep 3
echo "stop jenkins"
sudo launchctl unload /Library/LaunchDaemons/org.jenkins-ci.plist 2>&1 &
sleep 3
echo "kill mongo"
ps aux | grep mongo | awk '{print $2}' | xargs kill
sleep 3
echo "kill hive"
ps aux | grep hive | awk '{print $2}' | xargs kill
sleep 3
echo "stop yarn"
/usr/local/Cellar/hadoop/2.7.1/sbin/stop-yarn.sh
sleep 3
echo "stop dfs"
/usr/local/Cellar/hadoop/2.7.1/sbin/stop-dfs.sh
sleep 3
echo "kill spark"
ps aux | grep spark | awk '{print $2}' | xargs kill
sleep 3
echo "kill hadoop"
ps aux | grep hadoop | awk '{print $2}' | xargs kill
sleep 10
