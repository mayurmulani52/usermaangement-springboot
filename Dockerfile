FROM java:8
VOLUME /tmp
ADD /build/libs/usermanagement-0.0.1 usermanagement.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Duser.timezone=UTC","-jar","/usermanagement.jar"]
