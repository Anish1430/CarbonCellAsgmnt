# CarbonCell Assignment

## Overview

The CarbonCell Assignment project is a web application developed using Spring Boot. It provides APIs for user authentication, data retrieval, and accessing secured endpoints. The project includes controllers, services, models, repositories, and configuration files.

## Project Structure

### Controllers
- **AuthController**: Defines APIs for user registration and authentication.
- **DataController**: Defines an API for fetching data entries.

### Models
- **DataEntry**: Represents a data entry.
- **User**: Represents a user entity.

### Repositories
- **UserRepository**: Handles CRUD operations for users.

### Services
- **AuthService**: Provides methods for user registration and authentication.
- **DataService**: Fetches data entries from an external API.

### Configuration
- **application.properties**: Contains application-specific configurations such as server port, database connection details, and API URL.

### Main Application Class
- **CarbonCellAsgmntApplication**: Entry point of the application. It bootstraps the Spring Boot application and starts the embedded Tomcat server.

## Running the Application
To run the application:
1. Clone the repository: `git clone <repository_url>`
2. Navigate to the project directory: `cd CarbonCellAsgmnt`
3. Run the application: `mvn spring-boot:run`

## Configuration
The application uses MySQL as the database. The default configurations can be found in the `application.properties` file. Ensure that MySQL is installed and running on the specified port.

## Dependencies
- Spring Boot Web
- Spring Data JPA
- Spring Security

## Endpoints

### AuthController
- **POST /api/auth/register**: Registers a new user.
- **POST /api/auth/login**: Authenticates a user.

### DataController
- **GET /api/data**: Fetches data entries with optional parameters: category and limit.

### SecuredController
- **GET /api/secured**: Accessible only to authenticated users.

## Usage
1. Register a new user by sending a POST request to `/api/auth/register` with user details in the request body.
2. Authenticate a user by sending a POST request to `/api/auth/login` with login credentials in the request body.
3. Access secured endpoints by providing the authentication token in the request headers.
4. Fetch data entries by sending a GET request to `/api/data` with optional query parameters.

## External API URL
The application fetches data entries from an external API. The API URL is configured in the `application.properties` file.

