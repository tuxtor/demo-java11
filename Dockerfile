FROM payara/micro:5.2020.4-jdk11
COPY target/demo-java11.war $DEPLOY_DIR
