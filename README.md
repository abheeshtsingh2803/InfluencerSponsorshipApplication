# 📘 Influencer Sponsorship Application

A Spring Boot application that manages sponsorship deals between **brands** and **influencers**.  
Brands create sponsorship offers, influencers can accept them, and the system tracks:

- Influencer total earnings
- Brand remaining budget
- Offer acceptance status

The project uses **PostgresQL**, **Spring Data JPA**, **REST APIs**, and includes **pagination and sorting**.

---

## 🚀 Features

### ✔ Influencers
- Register influencers with:
    - Name
    - Platform (Instagram, TikTok, YouTube, etc.)
    - Followers count
    - Engagement rate
- Tracks the total earnings for each influencer

### ✔ Brands
- Register brands with:
    - Name
    - Total sponsorship budget

### ✔ Offers
- Brands create sponsorship offers for influencers
- Influencers can accept offers
- When accepted:
    - Offer becomes *accepted*
    - Brand budget is reduced
    - Influencer earnings increase

### ✔ Database
- Lightweight **PostgresQL** database
- Hibernate auto-generates tables

### ✔ Pagination + Sorting
Available for:
- `GET /influencers`
- `GET /brands`

---

## 📂 Technology Stack

| Component | Technology      |
|----------|-----------------|
| Backend Framework | Spring Boot     |
| Build Tool | Gradle          |
| Database | PostgresQL      |
| ORM | Spring Data JPA |
| API | REST            |
| Language | Java 17+        |

---

## 🔧 Configuration

### `src/main/resources/application.properties`

```properties
spring.application.name=InfluencerSponsorshipApplication
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/influencerSponsorshipApplication
spring.datasource.username=username
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
server.port=8082
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.open-in-view=true
