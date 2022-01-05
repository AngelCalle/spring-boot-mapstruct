# Basic example of the integration of the mapstruct library for mapping.

 - dto > entity
 - entity > dto

1. Pass an entity to a discount.
        localhost:8080/api/dto			{ "id": 321, "name": "Caramelo Entity" }

2. Pass a discount to an entity.
        localhost:8080/api/entity		{ "id": 321, "name": "Caramelo Dto", "type": null }

## Run
 - Update Maven Project
 - Spring Boot App
