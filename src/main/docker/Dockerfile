FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER ybd <yangbingdong1994@gmail.com>
VOLUME /tmp
ENV PROJECT_NAME="@project.build.finalName@.@project.packaging@" JAVA_OPTS="" TZ="Asia/Shanghai"
ADD $PROJECT_NAME app.jar
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && \
    echo $TZ > /etc/timezone && \
    sh -c 'touch /app.jar'
CMD ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=${ACTIVE:-docker1}  -jar /app.jar"]
# ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]