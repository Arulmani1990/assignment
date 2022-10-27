Travel API Client
Travel API Client application should running in port number 9000. Mock API application should running in port 8080. From the angular application integrated with the Travel API Client application, Travel API Client application we have used the rest template to retrieve the data from Mock API.

Start it (on windows systems use the gradlew.bat file):

./gradlew bootRun

Retrieve a specific airport:

http://localhost:9000/airports/code/{code}

Retrieve a fare offer:

http://localhost:9000/airports/fares/{origine}/{destination}

Retrieve all airport:

http://localhost:9000/airports/list/
