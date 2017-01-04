#!/bin/sh

cd $(dirname $0)

./ubuntu/docker.sh

docker build -f Dockerfile -t shenzhang/cloud-base:latest .