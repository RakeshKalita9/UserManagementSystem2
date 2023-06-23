<h1 style="color:blue;text-align:center;" ><b>User Management System</h1>

<h1 style="color:blue;";><b>Data Structures </h1>
<p>Array List<p>

<h1 style="color:blue;";><b>Data Flow </h1>
<p>Controller -- > Controller package handels all type of Api request. our Api requests are handeled by UserController </p>
<p>Model --> Inside model package we store our user entity as User class </p>
<p>Service--> Inside the service package,we write all type of the business logic inside UserService</p>
<p>Repo -->Inside the Repo Package there is a UserRepo calss which stores Our Data sourece. And we use ArrayList As data Source</p>
<h1 style="color:blue;";><b>Api </h1>
<p>1 . Api for Adding user  --->  "localhost:8080/users" and type of the api is POST and Api request for user body and the user body is given trough Requestbody </p>
<p>2. Api for getting all Users--> "localhost:8080/users"
and type of the Api is GET</p>
<p>3. Api for getting a Specific user --> "localhost:8080/users/userId/{userId}" and the Api is reponsible for returning a specific user based on Input UserId and Type of the Api is GET</p>
<p>4. Api for updating a specific user --> "localhost:8080/users/userId/{userId}", the api Api is Responsible for updating a specific user by Input User of having userId equals to input userId and the type of the Api is PUT</p>
<p>5. Api for Deleting a Specific user --> "localhost:8080/user/userId/{userId}", the Api deletes a Specific user of having userId equal to userId and the type of the Api is DELETE </p>
<h1 style="color:blue;";><b>Git Commands </h1>
$ git init
<br>
$ git status
<br>
$ git add
<br>
$ git  commit -m "rakeshCommit"
<br>
$ git remote add origin https://github.com/rakesh1234-png/UserManagementSystem2.git
<br>
$ git push -u origin master

<br>
