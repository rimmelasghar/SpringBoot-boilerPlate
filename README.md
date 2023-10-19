![](https://github.com/rimmelasghar/SpringBoot-boilerPlate/blob/main/imgs/springboot-boilerplate.jpg)

# Spring-Boot BoilerPlate

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

## Description

Spring Boot Boilerplate is an advanced foundation designed to facilitate the development of robust, production-ready Spring Boot applications. This comprehensive project encompasses a cutting-edge technology stack, featuring Spring Boot (version 3.1.2), Spring Data JPA, Spring Validation, Spring Security with JWT Token support, MySQL integration, Mapstruct for seamless data mapping, Lombok for concise code generation, and Swagger for streamlined API documentation.

## Table of Contents

- [Installation](#installation)
- [Features](#features)
- [Documentation](#documentation)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Installation
```
$ git clone https://github.com/rimmelasghar/SpringBoot-boilerPlate.git
$ cd SpringBoot-boilerPlate
```

Make sure you have docker and docker-compose installed [docker installation guide](https://docs.docker.com/compose/install/)
## Step 1: Configuration Setup
create ```.env``` file in root folder.
```
DB_ROOT_PASSWORD=mySecretRootPass
MYSQL_DATABASE=yourdbname
MYSQL_USER=yourdbusername
MYSQL_PASSWORD=dbpasswword
JWT_ISSUER=https://github.com/rimmelasghar
SWAGGER_CONTACT_MAIL=youremail
SWAGGER_CONTACT_URL=yourwebsite
SWAGGER_APP_NAME=Spring Boot Boilerplate Project
SWAGGER_APP_VERSION=2.0.0
SWAGGER_APP_LICENSE_URL=https://www.apache.org/licenses/LICENSE-2.0.html
SWAGGER_APP_LICENSE=Apache 2.0
```
This .env file contains the essential environment variables needed for your application to run.

## Step 2: Build Docker Images
Open a terminal or command prompt, navigate to your project's root folder, and run the following command to build the Docker images:
```
docker-compose build
```
This command will create Docker images based on the configurations defined in your docker-compose.yml file.
## Step 3: Start Application
After the Docker images are built, run the following command to start your application:
```
docker-compose up
```
Now, your application will be up and running. You can access it in your web browser at http://localhost:8000.


## Features

1. **Spring Boot 3.1.2**: The application is built using the latest version of Spring Boot, providing a solid foundation for developing robust and efficient Spring applications.

2. **Spring Data JPA**: Spring Data JPA simplifies database access using the Java Persistence API (JPA) and provides easy-to-use repositories for interacting with the database.

3. **Spring Validation**: The application implements Spring Validation to ensure data integrity and validity, making it more reliable and secure.

4. **Spring Security + JWT Token**: Spring Security is integrated into the application to handle authentication and authorization. It uses JSON Web Tokens (JWT) for secure token-based authentication.

5. **MySQL**: The application is configured to use MySQL as the backend database, allowing for persistent data storage.

6. **Mapstruct**: Mapstruct is used to simplify the mapping between DTOs (Data Transfer Objects) and entities, reducing boilerplate code and enhancing maintainability.

7. **Lombok**: Lombok reduces the verbosity of Java code by providing annotations to automatically generate boilerplate code for getters, setters, constructors, etc.

8. **Swagger**: The application includes Swagger, a powerful tool for documenting and testing APIs. Swagger UI provides an interactive API documentation that makes it easy for developers to understand and use the API endpoints.

These features collectively form a strong foundation for developing production-ready Spring Boot applications, saving development time and effort and ensuring best practices are followed throughout the development process.

## Documentation
- Swagger UI:
  ![](https://github.com/rimmelasghar/SpringBoot-boilerPlate/blob/main/imgs/swagger-1.jpg)
- Get Request:
  ![](https://github.com/rimmelasghar/SpringBoot-boilerPlate/blob/main/imgs/swagger-2.jpg)
  
  
## Contributing

To contribute to this project, follow these steps:

1. Fork this repository.
2. Create a new branch: ```git checkout -b feature/your-feature```
3. Make your changes and commit them: ```git commit -m 'Add some feature'```
4. Push to the branch: ```git push origin feature/your-feature.```
5. Submit a pull request.

## License

This project is licensed under the MIT License.

## Contact


Reach out to me ```rimmelasghar4@gmail.com```

made by Rimmel Asghar with ❤️
