#!/bin/sh

cd $(dirname $0)

# Build docker base image
./cloud-base/docker.sh

# Build api-provider image
./api-provider/docker.sh

# Build api-consumer image
./api-consumer/docker.sh

# Clean docker dangling images
docker rmi $(docker images -f "dangling=true" -q)