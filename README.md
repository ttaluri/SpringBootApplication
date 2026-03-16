# Item Management API
## Project Overview
This project is a RESTful API built with Spring Boot for managing inventory items.

The application allows users to create, retrieve, update, and delete items through HTTP endpoints.

### The project demonstrates:
1. REST API development
2. MVC architecture
3. Exception handling
4. Service and repository layers
5. Integration with a database

### Project Structure:
#### API Endpoints
#### 1. Get Item by ID: 

Endpoint: GET/items/{id}

Description: Retrieves a specific item by its ID.

Example Request: GET/items/1

Response Example: 
{
  "id": 1,
  "name": "Laptop",
  "price": 1200
}

#### 2. Get All Items: Endpoint: GET/items

Description: Retrieves a list of all items.

Response Example:
[
  {
    "id": 1,
    "name": "Laptop",
    "price": 1200
  },
  {
    "id": 2,
    "name": "Phone",
    "price": 800
  }
]

#### 3. Create Item: 

Endpoint: POST/items

Description: Creates a new item.

Request Body: 
{
  "name": "Tablet",
  "price": 500
}

Response Example:
{
  "id": 3,
  "name": "Tablet",
  "price": 500
}

#### 4. Update Item:

Endpoint: PUT/items/{id}

Description: Updates an existing item.

Request Example: 
{
  "name": "Gaming Laptop",
  "price": 1500
}

#### 5. Delete Item:

Endpoint: DELETE/items/{id}

Description: Deletes an item from the system.


### Development Setup
#### Prerequisites
1. Install the following: Java (JDK 17 or later)
2. Apache Maven
3. IntelliJ IDEA
4. Git

#### Installation Steps
1. Clone the repository: git clone https://github.com/ttaluri/SpringBootApplication.git
2. Navigate to the project
3. cd SpringBootApplication
4. Build the project
5. mvn clean install
6. Run the application
7. mvn spring-boot:run

#### The application will start on: http://localhost:8080

### Testing the API
You can test the API using Postman

#### Steps:
1. Open Postman.
2. Create a new request.
3. Enter the API endpoint URL.

Example: http://localhost:8080/items

#### Select the appropriate HTTP method:
1. GET → Retrieve items
2. POST → Create a new item
3. PUT → Update an item
4. DELETE → Delete an item

#### For POST or PUT, add the request body in JSON format.
Example request body:
{
  "name": "Laptop",
  "price": 1200
}

### Author: Tejasree Taluri
