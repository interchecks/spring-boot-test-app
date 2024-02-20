# Interchecks Spring Boot Test App 
Congratulations on making it to the next step of
the Interchecks hiring process 🎉 

## About the Project
This is a standard Maven based Spring Boot 3 project. An
H2 embedded Database is used for convenience.  

The next stage of the process is known as the Skills Assessment.

This project's purpose is to provide an opportunity to get
your local development environment into the state needed during the Skills Assessment.


During the skills assessment, we will work on a similar project together. 
You will be asked to implement features and improve code.
This will be a live coding exercise.


## Prerequisites
Please prepare the following items before the Skills Assessment meeting
- You must have this project set up and running in your IDE of choice. If you have issues getting the project running, please reach out so that we can have this in place before we meet.
- Be prepared to share your screen in Zoom
- Ideally, a GitHub account and git client
- Some way to initiate http calls to the API ie: curl, postman etc.,

During the Skills Assessment, a new project will be made available in GitHub with identical setup requirements.  Please be prepared to set up the Skills Assessment project in the same way you set up this project.


 
## Application requirements
You will need Java 17+ installed in your local development environment


# Helpful Stuff

#### Run the application
##### MacOs/Linux
``` BASH
./mvnw spring-boot:run
```
##### Windows
``` BASH
mvnw.cmd spring-boot:run
```
(or use your favorite IDE)


# HTTP CLIENT CALLS

#### GET TEST
##### MacOs/Linux
``` BASH
curl -v localhost:8080/test    \
     -H 'Content-Type: application/json'
```

#### POST TEST
##### MacOs/Linux
``` BASH
curl -v -X POST localhost:8080/test \
     -H 'Content-Type: application/json' \
     -d 'test'
```

# spring-boot-test-app
