# Dropwizard login

Simple login example using Java [Dropwizard](http://dropwizard.codahale.com/getting-started/).

## Requirements

* Java 1.7
* Maven

## Setup

To build:
    ```
    mvn package
    ```

To run jar:
    ```
    java -jar target/login-0.0.1-SNAPSHOT.jar server
    ```

1. Point DB config at database matching the schema sql in db\schema.sql

2. Post to http://localhost:8080/session with valid values for fields 'username' and 'password' to try out.

