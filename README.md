# E-Commerce Platform Backend

This repository contains the backend code for an e-commerce platform developed using Spring Boot. It provides RESTful
APIs for user authentication, product catalog, shopping cart, order management, payment processing, and analytics.

## Table of Contents

- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Building and Running](#building-and-running)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)

## Overview

The backend serves as the core of the e-commerce platform, handling business logic, database interactions, and external
integrations. It follows a modular architecture to promote scalability and maintainability.

## Technologies Used

- **Java 17**
- **Spring Boot 2.6**
- **Spring Data JPA**
- **Spring Security**
- **JWT (JSON Web Tokens)**
- **Hibernate**
- **MySQL**
- **Maven**
- **Lombok**
- **MapStruct**

## Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

- Java Development Kit (JDK) 17 or higher
- Maven 3.6+
- MySQL or another supported relational database

### configuration

1. **Clone the repository:**

   ```
   git clone https://github.com/lrdinsu/E-Commerce-Platform-Api.git
   cd E-Commerce-Platform-Api
   ```

2. **Set up the database:**

   Create a new MySQL database:

   ```
   CREATE DATABASE ecommerce_db;
   ```

3. **Configure application properties:**

   Update `src/main/resources/application.properties` with your database credentials.

    ```
   spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
   spring.datasource.username=your_db_username
   spring.datasource.password=your_db_password

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
   ```

## Building and Running

### Build the project

```
mvn clean install
```

### Run the application

```
mvn spring-boot:run
```

The server will start at `http://localhost:8080`.

## API Documentation

API documentation is available using Swagger UI. After starting the application, navigate to:

`http://localhost:8080/swagger-ui.html`

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any
contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

Distributed under the MIT License. See `LICENSE` for more information.

