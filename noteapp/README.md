# README #

This README documents the steps  necessary to get Notes App up and running.

### Architecture of the Application? ###

This application has been developed using SpringBoot, Angular JS, JPA, Maven and H2.

### Prerequisites ###
java, maven 

### How do I get set up? ###

* Clone or download the repository and save it on your computer
* In Command prompt go to the directory where the code is saved 
* Run this command: mvn clean install
* Running the above command should have created a target folder with a snapshot version of the jar
* Run this command: java -jar target/noteapp-0.0.1-SNAPSHOT.jar
* This should startup the server locally
* To view the application open this address in web browser: http://localhost:8080/home
* The home page will have one default note, to add more notes, enter the notes in the Text Box there and click Submit
* This will start showing the newly added comment to the list of comments.
* To edit the comment, click on the edit button and enter the update in the prepopulated text area and click Submit
* To view description of any comment from the list, click on the details link 


# noteapp
