# RestH2Example

This is a simple rest spring boot project using h2 in-memory database.
You can run it using embeddd tomcat.If you want to deploy it on OpenLiberty server, you should do:

  1. Download OpenLiberty.
  2. Extract it into a directory.
  3. Open cmd and go to bin directory of OpenLiberty.
  4. Create a new server in OpenLibery: server create server_name.
  5. Open server.xml and add two features : 
      <featureManager>
          <feature>springBoot-2.0</feature>
          <feature>servlet-3.1</feature>
      </featureManager>
  6. You also need to change default httpPort to 9090: httpPort="9090"
  7. Open cmd and go to project directory and make a jar file: mvn package.
  8. Copy project jar file located in target directory into server_name/apps directory.
  9. Run created server: server.bat run server_name [Windows] / server run server_name[Linux].
  10. Test app in your browser: http://localhost:9090/users.
  
You can also add New User using a Post request: http://localhost:9090/add_user.

Sample Post request body:
   
  {
    "id": 10004,
    "firstName": "Hassan",
    "lastName": "Hamedi"
  } 
