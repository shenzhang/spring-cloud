FROM shenzhang/cloud-base
MAINTAINER shenzhang

ARG jar

WORKDIR /apps/boot

COPY ./build/libs/$jar $jar
COPY ./docker/run.sh run.sh
RUN chmod u+x run.sh

COPY ./config config
VOLUME /apps/boot/config

ENV JAR_FILE=$jar
CMD ["./run.sh"]

EXPOSE 8080
