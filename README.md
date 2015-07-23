Malinkil-fp Readme
Project Summary:
The library management portal maintains the record of the book user want to have and helps in controlling and monitoring of all the transactions. It allows user and seller to create the account. The user can see all the books and choose which all books he wanted. The vendor has to create the account and can create orders.
Roles:
Customer can either login as User or Admin and can create and manage the transactions.
Overview:
On login screen enter the credentials
Then  you can see the various connections related to users, vendors and books
Can create new customer and seller , can view all the customer and seller list. Which seller is associated with the book . Can create new book records and assign the sender from which the book needs to be purchased. The page shows the complete navigation for the books that the user has issued and the seller who is associated with the book.
Development Insights:
 Used and had good learning for the following
Hibernate 
Spring mvc
Spring security roles
I faced a lot of problem while creating the project which lead to a great learning and successful completion of project.
Requirements:
Eclipse Luna
Java 1.6 or higher version
Tomcat 8 the same which comes with netbeans
MySql 5.6
For running the project please follow the steps:
Import the project in eclipse not in netbeans because security is different in both the IDE’s
Right click on the project> Maven>Update Project
Please make sure to add the below lines before running the code .In your apache tomcat server 
In Context.xml add:
<Resource auth="Container" driverClassName="com.mysql.jdbc.Driver" maxActive="50" maxIdle="4" name="jdbc/itmd4515DS" password="mith27may91" type="javax.sql.DataSource" url="jdbc:mysql://localhost:3306/itmd4515" username="root"/>


In Server.xml:

<Context docBase="malinkil-fp" path="/malinkil-fp" reloadable="true" source="org.eclipse.jst.j2ee.server:malinkil-fp"/>

 Clean and Start the server. Incase, if there are any issues or exception thrown, kindly follow the following steps. Its also advisable to perform this step even before starting the server.
 Open the project's properties (e.g., right-click on the project's name in the project explorer and select "Properties").
Select "Deployment Assembly".
 Click the "Add" button 
 Select "Java Build Path Entries" from the menu of Directive Type and click "Next".
  Select "Maven Dependencies" from the Java Build Path Entries menu and click "Finish".
After the server has started and tables have been created have the followings scripts be executed:
Insert into itmd4515.USER_DETAILS (USERID,ACTIVE,ADDRESS,CONTACTNO,CREATEDDATE,DATEOFBIRTH,DATEOFJOINING,EMAIL,FIRSTNAME,LASTNAME,MEMBERSHIPID,PASSWORD,ROLE,USERNAME) values (1,0,'2738 S West','6549849',null,'2015-05-08','2015-06-16','mith@gmail.com','Mith','Alinkil',1,'Mith27','ADMIN','Mith27');
Insert into itmd4515.MEMBERSHIP_TABLE (MEMBERID,DUE,FINE,PREMIUM,TYPE) values (1,20,30,40,'Regular');
Insert into itmd4515.MEMBERSHIP_TABLE (MEMBERID,DUE,FINE,PREMIUM,TYPE) values (2,60,60,30,'Premium');
After executing login with following credentials
Username: Mith27
Password: Mith27
Sanpshots:

Login Page


 
Welcome Page: Add User     View User 
Add Seller     View Seller
Create Book order    Search Book      My Book
 

Create User:
 

 









After Successful Creation of User: View User
 
Create Seller:
 
 

 
After Successful Creation of Seller: View Seller


 






Create Book records:
 

 






After Successful creation of Books:Can Search the books 
If the user has no books in his record or he has not issued any books:
 






Search record for available books: Search by book name, it shows the books with number of quantity Like for below snapshot Basics of Biology Quantity :3. Then User can select the book and the number will decrement
 
After user has selected the books will be getting reflected in users account

 





Update: Update User : Directs to Update Page
 
 

 




Update: To Update Seller:
 
 

Delete :Delete Seller
 







After Delete:
 

Delete User:
 




After Delete:
 



Error Pages:
Invalid Username and Password
 
If no entries are  there: User Page
 
Seller Page:
 














