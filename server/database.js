"use strict"

const mongoose = require('mongoose')
const Record = require('./models/record.model.js')
let ObjectID = require('mongodb').ObjectID;


let db_url = 'mongodb://localhost:27017/testdb'
let log = (x) => {console.log(x); return x;};

mongoose.connect(db_url)

mongoose.Promise = global.Promise

let db = mongoose.connection

let populateDb = () => {
    
    db.dropCollection('records')
    db.createCollection('records')
    
    let policyNumber = 0;
    
    const linesOfBusiness = ['auto', 'home', 'pelp']
    const writingCompanies = ['wc1', 'wc2', 'wc3', 'wc4', 'wc5', 'wc6', 'wc7', 'wc8', 'wc9', 'wc10']
    const states = [{name:'Arizona', code:'AZ'},{name:'Colorado', code:'CO'},{name:'Connecticut', code:'CT'},{name:'Illinois', code:'IL'},
                    {name:'Indiana', code:'IN'},{name:'New Jersey', code:'NJ'},{name:'Ohio', code:'OH'},{name:'Pennsylvania', code:'PA'},
                    {name:'Texas', code:'TX'}, {name:'Wisconsin', code:'WI'}]

    
    const getPolicyNumber = () => {
        return policyNumber.toString()
    } 
    
    const getLineOfBusiness = () => {
        return linesOfBusiness[Math.floor(Math.random() * 3)]
    }
    
    const getState = () => {
        return states[Math.floor(Math.random() * 10)]
    }
    
    const getWritingCompany = () => {
        return writingCompanies[Math.floor(Math.random() * 10)]
    }
    
    const getExtractedDate = () => {
        return new Date();
    }
    
    for (let i=0; i<1000; i++){
        let doc = {
            _id: new ObjectID(),
            state: getState(),
            lineOfBusiness: getLineOfBusiness(),
            policyNumber: getPolicyNumber(),
            writingCompany: getWritingCompany(),
            extractedDate: getExtractedDate()
        }

        db.collection('records').insertOne(doc);
    }
    
    
}

//This will drop and recreate the Database with data
//populateDb();

db.on('error', console.error.bind(console, 'MongoDB connection error:'))