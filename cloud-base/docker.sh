#!/bin/sh

cd $(dirname $0)

docker build -f Dockerfile -t shenzhang/cloud-base:latest .