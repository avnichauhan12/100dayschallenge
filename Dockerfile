FROM openjdk:11
WORKDIR /myapp
COPY . .
RUN javac powerofn.java
CMD ["java", "powerofn"]