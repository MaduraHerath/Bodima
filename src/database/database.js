var mysql = require('mysql');
var express    = require("express");
 
var con = mysql.createConnection({
  host: "localhost",
  user: "user",
  password: "user",
  database: "bodima"
});
var app = express();


con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!");

  con.query("CREATE DATABASE IF NOT EXISTS bodima", function (err, result) {
    if (err) throw err;
    console.log("Database created"); 
    // create database
  });


});

 app.get("/",function(req,res){
 connection.query('SELECT * from user LIMIT 2', function(err, rows, fields) {
 connection.end();
   if (!err)
     console.log('The solution is: ', rows);
   else
     console.log('Error while performing Query.');
   });
 });

 app.listen(3000);