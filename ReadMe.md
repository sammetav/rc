# Pet Tracker Application

A reactive Java application built with **Project Reactor** and **Spring Data R2DBC**, using PostgreSQL as the database backend.

## Features

- Fully reactive stack powered by **Project Reactor**
- Reactive database access with **Spring Data R2DBC**
- PostgreSQL backend running in Docker
- Pet entities with custom validation logic
- Database migrations managed by Flyway

### why R2DBC?

- R2DBC (Reactive Relational Database Connectivity) is the obvious choice for database access in a reactive world because it is designed for non-blocking, asynchronous I/O operations, making it ideal for reactive applications. Unlike traditional JDBC, which blocks threads during database operations, R2DBC uses reactive streams to handle queries and results, allowing for better scalability and resource utilization. It integrates seamlessly with reactive frameworks like Spring WebFlux and Project Reactor, providing a consistent, non-blocking API. R2DBC ensures that database interactions remain non-blocking and efficient, making it the natural fit for modern, high-performance, reactive applications.