FROM cloud-base
MAINTAINER shenzhang

WORKDIR /apps/boot
COPY ./build/libs/*.jar api-provider.jar
COPY ./docker/run.sh run.sh
RUN chmod u+x run.sh

CMD ["/apps/boot/run.sh"]

EXPOSE 8080
