const express = require("express");
const Joi = require("joi");
const session = require("express-session");

const app = express();
app.use(express.json());
app.use("/public", express.static(__dirname + "/public"));
console.log(__dirname);
app.listen(process.env.PORT || 3000);

//Load homepage
app.get("/", (req, res) => {
    res.sendFile(__dirname + '/index.html', (err) => { if (err) console.log(err) });
});

//Load login page
app.get("/login", (req, res) => {
    res.sendFile(__dirname + '/login.html', (err) => { if (err) console.log(err) });
});

//Process login info
app.post("/login", (req, res) =>{
    var username = req.body.user;
    var password = req.body.password;
    console.log("User tried to log in with username " + username + " and password " + password);
    res.end("yes");
});

//Load account page
app.get("/account", (req, res) => {
    res.sendFile(__dirname + '/account.html', (err) => { if (err) console.log(err) });
});

//Process changed account info
app.post("/account", (req, res) =>{
    var username = req.body.user;
    console.log(username + " has altered their account data.");
    res.end("yes");
});
/*app.get("/", (req, res) => {
    res.sendfile(__dirname + "/index.html", (err => {
        if(err){
            console.log(err);
        }
    }))
});*/