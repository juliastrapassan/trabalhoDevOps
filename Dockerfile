FROM openjdk:21
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac src/Main.java
CMD ["java", "-cp", "src", "Main"]
