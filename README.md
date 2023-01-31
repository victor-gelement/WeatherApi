# WeatherAPI
This REST API allows you to receive weather data from weather sensors and save it.

Possibilities of application:
- receive weather data from a weather sensor
- return all measurements
- return the number of rainy days
### Start
- Connect to your DB and create tables (path:src/main/java/com/example/WeatherApi/utill/create_table.sql)
- Run SpringBootApplication (path:src/main/java/com/example/WeatherApi/WeatherApiApplication.java)
- You can use POSTMAN to test the application
- To add a new sensor, send a post request to the address http://localhost:8080/sensors/registration and pass JSON {"name": "sensor 1"} as the request body
- To add a new measurement, send a post request to http://localhost:8080/measurements/add and pass JSON {"value": 24.7, "raining": "false", "sensor":{"name": "sensor 1"}} as the request body
- To return all measurements from the database, send a get request to http://localhost:8080/measurements
- To return the number of rainy days from the database, send a get request to http://localhost:8080/measurements/rainyDaysCount

### Stack
App include:
- Java  11
- Maven
- Spring Boot
- PostgreSQL
- Spring Data JPA
- Spring Web
