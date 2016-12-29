#!/bin/sh

cd $(dirname $0)

./gradlew assemble

docker build -f ./docker/Dockerfile -t api-provider:latest .