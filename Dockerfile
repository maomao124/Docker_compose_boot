# 基础镜像使用java
FROM java17:1.0
# 作者
MAINTAINER mao
# VOLUME 指定临时文件目录为/tmp，在主机/var/lib/docker目录下创建了一个临时文件并链接到容器的/tmp
VOLUME /tmp
# 将jar包添加到容器中并更名为Docker_compose_boot.jar
ADD Docker_compose_boot-0.0.1-SNAPSHOT.jar Docker_compose_boot.jar
# 运行jar包
RUN bash -c 'touch Docker_compose_boot.jar'
ENTRYPOINT ["java","-jar","Docker_compose_boot.jar"]
#暴露端口作为微服务
EXPOSE 8080