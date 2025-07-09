const express = require("express");
const {faker}=require('@faker-js/faker')
const app = express();
const port = 8000;
    
// req is shorthand for request
// res is shorthand for response
app.use( express.json() );
app.use( express.urlencoded({ extended: true }) );

const createUser=()=>{
    return {
        _id:faker.database.mongodbObjectId(),
        fisrtName:faker.person.firstName(),
        lastName:faker.person.lastName(),
        email:faker.internet.email(),
        password:faker.internet.password(),
        phoneNumber:faker.phone.number()
    }
}

const createCompany=()=>{
    return{
        _id:faker.database.mongodbObjectId(),
        name:faker.company.name(),
        address:{
            street:faker.location.street(),
            city:faker.location.city(),
            state:faker.location.state(),
            zipCode:faker.location.zipCode(),
            country:faker.location.country()
        }
      
    }
}

app.get("/api/users/new",(req,res)=>{
    const newUser= createUser()
    res.json(newUser)
})

app.get("/api/companies/new",(req,res)=>{
    const newCompany= createCompany()
    res.json(newCompany)
})

app.get("api/user/company",(req,res)=>{
    const newCompany= createCompany()
    const newUser= createUser()
    res.json(newCompany,newUser)
})




app.get("/api", (req, res) => {
    res.json({ message: "Hello World" });
});


app.listen(port)