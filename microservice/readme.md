### To test the solution, you need: 
    - IntelliJ IDEA.
    - MySQL DBMS.
## Deployment
-
  ### Create database
     1.In MySQL, create for each file in the ``databases'' folder a database with the same name.
    
     2.Import the priam-<name>.sql file into the corresponding database in mysql.
-
  ### Integration of PRIAM_GDPR
    1.open each project in Intellij.
    
    2.For each of the projects (Actor, Data, processing, DataRequest, consent, tea-provider ) Add link to data source <name of database>, for example,
      for PRIAM-Data-service
                ![DatabaseIntellij1](https://user-images.githubusercontent.com/72026369/160208422-ce6454ea-bf88-4210-adb7-11d9ac0f3f8f.jpg)
                
    
    3.Fill in the fields "user", "password" and the name of the database. e.g: 
        user: root
        password:
        Database: priam-data
    
    
    5.run the projects in this order 
          - Eureka
          - PRIAM-Actor-service 
          - PRIAM-Data-service
          - PRIAM-Processing-service
          - PRIAM-DataRequest-service
          - PRIAM-Consent-service
          - tea-Provider-microservice
          - PRIAM-FrontEnd
