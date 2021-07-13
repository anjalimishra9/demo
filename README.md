# demo (Sample project for a REST API using Spring Boot)
--------------------------------------------------------------------------------------------------------------------------------------------------------------------

This is a sample Java / Maven / Spring Boot (version 2.5.2) application that has a REST API to get details based on rl100_code from a csv file.

How to Run
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
This application is packaged as a war which has Tomcat 9.0.48 embedded. No Tomcat installation is necessary. You  can run it using the java -jar command.

-Clone this repository
-Make sure you are using JDK 11 and Maven 3.6.3
-You can build the project and run the tests by running mvn clean install
-Once successfully built, you can run the service by using below command:

        java -jar target/demo-0.0.1-SNAPSHOT.war
  
-Check the console to make sure no exceptions are thrown

Once the application runs you should see something like this

2021-07-13 15:10:44.389  INFO 35865 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2021-07-13 15:10:44.390  INFO 35865 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2021-07-13 15:10:44.390  INFO 35865 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 0 ms

About the Service
------------------------------------------------------------------------------------------------------------------------------------------------------------------
The below mentioned service provides all the information related to an operating point(BetriebStelle) based on rl100_code. It uses an OpenCSV library to read data from a csv file.

http://localhost:8080/operations/aamp (http://localhost:8080/operations/{rl100_code})

When the above mentioned endpoint is used,the JSON response is like this: (404 in case of no record)
Response: HTTP 200

{"rl100_Code":"AAMP","plc":"DE14378","rl100_LangName":"Hamburg Anckelmannsplatz","rl100_KurzName":"Anckelmannsplatz","typ_Kurz":"ÜST","typ_Lang":"Üst","betriebsZustand":"Betrieb","datumAb":"2020-04-01","datumBis":null,"niederlassung":2,"regionalBereich":"Nord","letzeAenderung":"2020-10-29"}


