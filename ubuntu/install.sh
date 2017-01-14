#!/bin/sh

# update apt-get
apt-get update

apt-get install --assume-yes iputils-ping
apt-get install --assume-yes vim
apt-get install --assume-yes git
apt-get install --assume-yes telnet
apt-get install --assume-yes net-tools
apt-get install --assume-yes man

# wait for it
chmod u+x /apps/docker/wait-for-it.sh
