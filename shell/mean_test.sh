#!/bin/sh

# Add Mongo repo to yum
sudo cat > /etc/yum.repos.d/mongodb-org-3.0.repo <<EOF
[mongodb-org-3.0]
name=MongoDB Repository
baseurl=http://repo.mongodb.org/yum/redhat/7Server/mongodb-org/3.0/x86_64/
gpgcheck=0
enabled=1
EOF
# install Mongo
sudo yum install -y mongodb-org
sleep 3
# Set Mongo to start automatically
echo "Set Mongo to start automatically"
sudo chkconfig mongod on
sleep 3
# Start Mongo
echo "Starting Mongo"
sudo service mongod start
sleep 3
# Install node etc
sudo yum install -y nodejs npm --enablerepo=epel
sleep 3
# Install git
sudo yum install -y git
# Install grunt
#npm install grunt
#sleep 3
# Clone node test
#git clone https://github.com/billwestfall/jbdm.git
#sleep 4
# Clone backend test
#git clone https://github.com/billwestfall/Hygieia.git
