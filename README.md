# spring-boot-aws-code-deploy-demo

#### Install the CodeDeploy agent for Amazon Linux or RHEL
```
#!/bin/bash
sudo yum update
sudo yum -y install ruby
sudo yum install wget
cd /home/ec2-user
wget https://aws-codedeploy-us-east-1.s3.us-east-1.amazonaws.com/latest/install
chmod +x ./install
sudo ./install auto
sudo yum install -y python-pip
sudo pip install awscli
sudo amazon-linux-extras install java-openjdk11
