FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER sharank@thoughtworks.com
#VOLUME /tmp
EXPOSE 8080
 
#ENV USER_NAME shar
#ENV APP_HOME /home/$USER_NAME/app
ENV APP_HOME /app

#RUN useradd -ms /bin/bash $USER_NAME
RUN mkdir $APP_HOME
 
ADD myapp.war $APP_HOME/myapp.war
#RUN chown $USER_NAME $APP_HOME/myapp.war
 
#USER $USER_NAME
WORKDIR $APP_HOME
#RUN bash -c 'myapp-0.war'
 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","myapp.war"]
