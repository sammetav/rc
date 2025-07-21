# Pet Tracker Application

A reactive Java application built with **Project Reactor** and **Spring Data R2DBC**, using PostgreSQL as the database backend.

## Features

- Fully reactive stack powered by **Project Reactor**
- Reactive database access with **Spring Data R2DBC**
- PostgreSQL backend running in Docker
- Pet entities with custom validation logic
- Database migrations managed by Flyway

### why R2DBC?

- R2DBC uses reactive streams, enabling your app to handle many database calls without blocking threads — perfect for reactive frameworks like Spring WebFlux or Project Reactor