FROM alpine/java:22-jdk

EXPOSE 8080
ARG JAR_FILE=demo/build/libs/demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

RUN wget --output-document=applicationinsights-agent.jar https://github.com/microsoft/ApplicationInsights-Java/releases/download/3.5.4/applicationinsights-agent-3.5.4.jar

ENTRYPOINT ["java", "-javaagent:applicationinsights-agent.jar", "-jar", "app.jar"]