FROM shenzhang/ubuntu

WORKDIR /apps
COPY files/jdk-8u111-linux-x64.tar.gz /apps/docker/java8.tar.gz
ADD install.sh /apps/docker/install.sh
RUN chmod u+x /apps/docker/install.sh && /apps/docker/install.sh

ENV JAVA_HOME /apps/java8
