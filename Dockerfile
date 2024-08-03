FROM openjdk:17-jdk-alpine


WORKDIR /app


COPY --from=builder /app/target/*.jar /app/app.jar


EXPOSE 8080


ENTRYPOINT ["java","-jar","app.jar"]