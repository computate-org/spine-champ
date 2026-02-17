FROM registry.access.redhat.com/ubi9/openjdk-21:latest

USER root

RUN microdnf install -y git

RUN install -d /home/default/spine-champ
COPY . /home/default/spine-champ

RUN git clone https://github.com/computate-org/computate-base.git /home/default/computate-base
RUN git clone https://github.com/computate-org/computate-search.git /home/default/computate-search
RUN git clone https://github.com/computate-org/computate-vertx.git /home/default/computate-vertx
RUN git clone https://github.com/computate-org/spine-champ-static.git /home/default/spine-champ-static

WORKDIR /home/default/computate-base
RUN mvn clean install -DskipTests
WORKDIR /home/default/computate-search
RUN mvn clean install -DskipTests
WORKDIR /home/default/computate-vertx
RUN mvn clean install -DskipTests
WORKDIR $HOME/spine-champ
RUN mvn clean install -DskipTests

WORKDIR /home/default/spine-champ
RUN mvn clean install -DskipTests
RUN mvn dependency:build-classpath -Dmdep.outputFile=/home/default/spine-champ/cp.txt -q
CMD java -cp "$(cat /home/default/spine-champ/cp.txt):/home/default/spine-champ/target/classes" org.computate.spinechamp.verticle.MainVerticle
