FROM mysql:5.6
RUN apt-get update
RUN mkdir -p /usr/share/man/man1mkdir -p /usr/share/man/man1 
RUN apt-get install -y default-jre-headless
# RUN java --version
ENV MYSQL_ROOT_PASSWORD=root
COPY ./target/BackEndUsers-0.0.1-SNAPSHOT.jar /
EXPOSE 8080
EXPOSE 3306