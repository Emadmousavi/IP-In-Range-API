# IP-In-Range-API
This is a Simple Web API wriiten in java

with the help of this api you can insert some ip recorde with attributes of (startIP,endIP,country,latitude,longtitude,company,createDate) in a databse by
post request and then you can send get request and send an ip in request.
if the ip is in range of any (startIP,endIP) of existed records api will response to you other information about ip like (startIP,endIP,country,company)

you should have installed :

POSTMAN to send post and get request

XAMPP or MYSQL WORKBENCH to create databse


# How TO RUN :

# 1
fisrt you should have a local database named "spring_webapi" (you can make it using xampp or mysql workbench)

of course tou can change the name but you should go to "src/main/resources/application.properties" and change "spring.datasource.url=jdbc:mysql://localhost:3306/spring_webapi"
to "spring.datasource.url=jdbc:mysql://localhost:3306/YOUR_DATABASE_NAME"

# 2
run the app (for first run go to "src/main/resources/application.properties" and change mode of "spring.jpa.hibernate.ddl-auto" to create and for furthuer run change it to update) . This will create the "ipinfo_model" table in the database

# 3
now the app is ready and you can go to postman and send a post request to the "https://localhost:8080/ip" and in the body of request you should send a json like below format:

{

  "stratIP" : "YOUR_STARTIP",
  
  "endIP" : "YOUR_ENDIP",
  
  "country" : "YOUR_COUNTRY",
  
  "latitude" : "YOUR_LATITUDE",
  
  "longtitude" : "YOUR_LONGTITUDE",
  
  "company" : "YOUR_COMPANY"
  
  "createDate" : "YOUR_CREATEDATE"
  
}

this will insert a record to the "ipinfo_model" table

# 4
for get requests you can send an ip with the "https://localhost:8080/ip/YOUR_IP" url and check if the ip is in range of any (startIP,endIP) record in database . if it is in range then a API will response you some data about ip like below format:

{

  "stratIP" : "YOUR_STARTIP",
  
  "endIP" : "YOUR_ENDIP",
  
  "country" : "YOUR_COUNTRY",
  
  "company" : "YOUR_COMPANY"
  
}
