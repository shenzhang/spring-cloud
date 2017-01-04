#!/bin/sh

cd $(dirname $0)
DIR=$(pwd)

./gradlew clean assemble

export JAR_FILE=$(cd build/libs && ls *.jar)
cd $DIR

docker build -f ./docker/Dockerfile -t shenzhang/api-provider:latest --build-arg jar=$JAR_FILE .