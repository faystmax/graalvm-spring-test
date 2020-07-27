FROM oracle/graalvm-ce:20.1.0-java11 as builder
COPY . /app
WORKDIR /app
RUN gu install native-image
RUN ./gradlew buildNativeImage

FROM oraclelinux:7-slim
COPY --from=builder "/app/build/native" native
WORKDIR /native
CMD [ "sh", "-c", "./graalvm-spring-test" ]