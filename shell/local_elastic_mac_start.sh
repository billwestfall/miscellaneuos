echo "starting elasticsearch"
/Users/billw/Documents/old/es23/elasticsearch-2.3.1/bin/elasticsearch 2>&1 &
sleep 10
echo "starting kibana"
/Users/billw/Sites/kibana/bin/kibana 2>&1 &
sleep 5
echo "starting mongo"
mongod --replSet rs0  2>&1 &
sleep 10
echo "starting mongo connector"
mongo-connector -m localhost:27017 -t localhost:9200 -d elastic2_doc_manager 2>&1 &
sleep 5
echo "starting jenkins"
sudo launchctl load /Library/LaunchDaemons/org.jenkins-ci.plist 2>&1 &
sleep 3
echo "hdfs namenode"
nohup /usr/local/Cellar/hadoop/2.7.1/bin/hdfs namenode -format 2>&1 &
sleep 3 
echo "start dfs"
/usr/local/Cellar/hadoop/2.7.1/sbin/start-dfs.sh
sleep 3
echo "hdfs mkdir user"
/usr/local/Cellar/hadoop/2.7.1/bin/hdfs dfs -mkdir /user
sleep 3
echo "hdfs make user"
/usr/local/Cellar/hadoop/2.7.1/bin/hdfs dfs -mkdir /user/billw
sleep 3
echo "start yarn"
nohup /usr/local/Cellar/hadoop/2.7.1/sbin/start-yarn.sh
sleep 3
echo "start hive"
/usr/local/Cellar/hive/1.2.1/bin/hive --service hiveserver2 -hiveconf hive.aux.jars.path=libexec/lib/elasticsearch-hadoop-2.3.0.jar 2>&1 &
