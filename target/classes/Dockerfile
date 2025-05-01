FROM openjdk:21
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac src/main/java/Main.java
CMD ["java", "-cp", "src/main/java", "Main"]