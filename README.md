# Spring Boot Hello World with Docker

### License

This project is licensed under **MIT** license. See the `LICENSE` file for more informations. 

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/nathan00pdl/java-docker-helloWorld/blob/main/LICENSE) 

# About the Project 

**This is a simple Spring Boot app to send hello world message to a user.**

The reason for this simple project was so that I could pratice and further implement my knowledge in **Docker**. Therfore, I was able to better understand how a **Java Application** is **containerized** using the **SpringBoot** framework, by creating an **Image** defined in **Dockerfile**.

Furthermore, this project also contributed to my development by addresing the good practices of implementing **Unit Tests**, so I understood that the use of **MockMvc** allowos testing the control layer of a **Spring Application** without the need to upload a **real server**, making tests **faster** and more **efficient**.


## How to Run Application

**Start the application using any of the commands mentioned below?**

> **Note:** The commands need to run inside the root folder of this project i.e inside the **java-docker-helloWorld** folder.

- **Using maven**
  <br/>``` mvn spring-boot:run```

- **From jar file**
  Create a jar file using '**mvn clean install**' command and then execute.
  <br/>```java -jar target/hello-world-0.0.1-SNAPSHOT.jar.jar```

- **Using Docker**
  - Image construction: <br/> ```docker build -t image_name .```
  - Climb Container: <br/> ```docker run -d --name container_name -p 9090:9090 image_name```

> **Note:** By default spring boot application starts on port number 8080. If port 8080 is occupied in your system then you can change the port number by uncommenting and updating the **server.port** property inside the **application.properties** file that is available inside the **src > main > resources** folder.

<br/>

**Send an HTTP GET request to '/api/hello' endpoint using any of the two methods**

- **Browser or REST client**
  <br/>```http://localhost:9090/api/hello```

- **cURL**
  <br/>```curl --request GET 'http://localhost:9090/api/hello'```


## How to Run Unit Test Cases

**Run the test cases using any of the commands mentioned below**

> **Note:** These commands need to run inside the root folder of this project i.e inside the **java-docker-helloWorld** folder

- **To run all the test cases**
  <br/>```mvn test```

- **To run a particular test class**
  <br/>```mvn -Dtest=HelloWorldControllerTest test```
  <br/>or
  <br/>```mvn -Dtest=HelloWorldApplicationTests test```
