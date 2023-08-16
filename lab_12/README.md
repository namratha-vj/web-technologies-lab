Check if node and npm is installed:
```bash
node -v
npm -v
```

Installing mySQL
```bash
npm install mysql
```

Open XAMPP and start Apache and MySQL

Go to bin folder in XAMPP and run:
```bash
mysql -u root -p
```

Check if database is created:
```bash
show databases;
```

Create database:
```bash
create database lab12;
```

Create `database.js` file:
```bash
touch database.js
```
`databse.js` file:
```javascript
var mysql = require('mysql');

var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "root"
});

con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!");
  con.query("CREATE DATABASE weblab", function (err, result) {
    if (err) throw err;
    console.log("Database created");
  });
});
```

Run server:
```bash
node database.js
```

Create  `table.js`
```bash
touch table.js
```
`table.js` file:
```javascript
var mysql = require('mysql');

var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "root",
  database: "weblab"
});

con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!");
  var sql = "CREATE TABLE users (name VARCHAR(255), address VARCHAR(255))";
  con.query(sql, function (err, result) {
    if (err) throw err;
    console.log("Table created");
  });
});
```

Check if table is created:
```bash
show tables;
desc users;
```

Insert data into table:
```bash
insert into users values('John', 'India');
```

Check if data is inserted:
```bash
select * from users;
```



