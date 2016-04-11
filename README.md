# springboot-mysql
A simple todo app using spring boot mysql and angularjs

# Install front end assets
Install bower if you dont have it already

npm install bower -g

Then run bower install from the root of the folder

# Running the Application

Run the following from the command line from the root directory

mvn spring-boot:run

ctrl + c to gracefully close the application.

#MySQL

The app uses mysql as backend database to stroe information. Make sure you have a MySQL server running on localhost or point appropriate SQL server url in src\main\resources\application.properties

change url,username,password accordingly.

#Queries

For any queries please raise an issue or mail me amitrai48@gmail.com