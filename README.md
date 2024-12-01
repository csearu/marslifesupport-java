###Mars Life Support Monitor

### Java Spring Boot application that exposes sensor data via HTTP endpoints. The app will provide a simple API for the Mars Life Support Monitor, allowing the React client (or any HTTP client) to fetch data periodically
```
mars-life-support-monitor/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.example.marslifesupport/ 
│   │   │   │   ├── MarsLifeSupportApplication.java # Main Spring Boot App
│   │   │   │   ├── controller/                    
│   │   │   │   │   └── SensorDataController.java  # REST Controller
│   │   │   │   ├── model/
│   │   │   │   │   └── SensorData.java            # POJO for sensor data
│   │   │   │   ├── service/
│   │   │   │   │   └── SensorDataService.java     # Service to generate data
│   │   ├── resources/
│   │   │   ├── application.properties             # Spring Boot config
├── pom.xml                                         # Maven dependencies
```

##1. Run the Application:

```
./mvnw spring-boot:run
```

The server will start at http://localhost:8080.

##2. Access the API:
Navigate to http://localhost:8080/sensor-data in your browser or a tool like Postman.
The response will look like:
```
{
  "oxygenLevel": 21.3,
  "co2Level": 400,
  "temperature": 22.5,
  "pressure": 101.3,
  "waterSupply": 500
}
```