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
    #### 1.open each project in Intellij.
    
    #### 2.For each of the projects (Actor, Data, processing, DataRequest, consent, tea-provider ) Add link to data source <name of database>, for example, for PRIAM-Data-service
    ![DatabaseIntellij1](https://user-images.githubusercontent.com/72026369/160208422-ce6454ea-bf88-4210-adb7-11d9ac0f3f8f.jpg)
                
    #### 3.Fill in the fields "user", "password" and the name of the database. e.g: 
        - user: root
        - password:
        - Database: priam-data
    
    
    #### 4.run the projects in this order 
          - Eureka
          - PRIAM-Actor-service 
          - PRIAM-Data-service
          - PRIAM-Processing-service
          - PRIAM-DataRequest-service
          - PRIAM-Consent-service
          - tea-Provider-microservice
          - PRIAM-FrontEnd (you need to install Angular CLI (including nodejs))

    For PRIAM-FrontEnd, Install the project dependencies by running the following command:
            - npm install

    Once the dependencies are successfully installed, you can run the Angular development server using the command:
            - ng serve

    This command will launch the development server, and you can access your application in your browser by opening the URL http://localhost:4200/.
    
## Example 
### 1- Creation of a rectification request by the user (data subject)
![dataSubject steps](https://github.com/gitPriam/PRIAM-MSA/assets/135063280/2bff9e84-b916-456b-aabe-41c4c67511f9)

### 2- Response to the request for rectification by the provider
![provider steps](https://github.com/gitPriam/PRIAM-MSA/assets/135063280/eca1e7f4-9034-416c-a806-dc6300f060f7)
![provider steps 2](https://github.com/gitPriam/PRIAM-MSA/assets/135063280/122166fb-6d45-43a0-8934-9708455f5440)

### Giving/modifying consent
![dataSubject consent](https://github.com/gitPriam/PRIAM-MSA/assets/135063280/13f20c69-3312-4bb5-9a0c-d5bf20a2005f)

