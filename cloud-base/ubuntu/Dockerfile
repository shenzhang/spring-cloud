FROM ubuntu:16.04
MAINTAINER shenzhang

COPY files/wait-for-it.sh /apps/docker/wait-for-it.sh

ADD install.sh /apps/docker/install.sh
RUN chmod u+x /apps/docker/install.sh && /apps/docker/install.sh
