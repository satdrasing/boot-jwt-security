# boot-jwt-security

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) sample app.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `io.satendra.bootjwtsecurity.BootJwtSecurityApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
## Usage example
```shell
curl --header "Content-Type: application/json"
  --request POST
  --data '{"username":"satendra","password":"sa"}'
  http://localhost:8080/api/auth/signin
  
  {
    "accessToken":"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzYXRlbmRyYSIsImlhdCI6MTU1NTUyMTg5MiwiZXhwIjoxNTU2MTI2NjkyfQ.S3vsBMirxGQD2HxSTIMFAb5gUtfNn0Kg7h1K_SKgICXKKRbAzdUsQdV4eFW1zydT1P-_hOI4_I0CvgMYoSDi8Q",
    "tokenType":"Bearer"
   }
```
```shell
curl -H "Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzYXRlbmRyYSIsImlhdCI6MTU1NTUyMTg5MiwiZXhwIjoxNTU2MTI2NjkyfQ.S3vsBMirxGQD2HxSTIMFAb5gUtfNn0Kg7h1K_SKgICXKKRbAzdUsQdV4eFW1zydT1P-_hOI4_I0CvgMYoSDi8Q" http://localhost:8080/test

["satendra","test name"]
```
