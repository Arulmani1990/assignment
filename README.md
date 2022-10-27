# assignment


Travel API Client
=================

Travel API Client application should running in port number 9000. Mock API application should running in port 8080. From the angular application integrated with the Travel API Client application, Travel API Client application we have used the rest template to retrieve the data from Mock API.

Start it (on windows systems use the gradlew.bat file):

`./gradlew bootRun`

Retrieve a specific airport:

http://localhost:9000/airports/code/{code}

Retrieve a fare offer:

http://localhost:9000/airports/fares/{origine}/{destination}

Retrieve all airport:

http://localhost:9000/airports/list/



For Angular 

Download the Angular folder into local machine.

Npm version shoule be greater than 8.0

Node version - 14 and above

Angular version - 12 and above.

start the application use - ng serve

Once application started successfully go to browser use http://localhost:4200/.

It's automatically redirect to faredetails page. then select the Origin and Destination from the dropdown and click submit, it will get the fare details.
