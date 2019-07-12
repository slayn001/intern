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
                    {name:'Texas', code:'TX'}, {name:'Wisconsin', code:'WI'}, {name:'Alaska', code:'AK'}, {name:'Alabama', code:'AL'}, 
                    {name:'District of Columbia', code:'DC'}, {name:'Georgia', code:'GA'}, {name:'Hawaii', code:'HI'}, {name:'IOWA', code:'IA'},
                    {name:'Idaho', code:'ID'}, {name:'Louisiana', code:'LA'}, {name:'Maine', code:'ME'}, {name:'Missouri', code:'MO'},
                    {name:'Mississippi', code:'MS'}, {name:'Montana', code:'MT'}, {name:'Nebraska', code:'NE'}, {name:'New Hampshire', code:'NH'},
                    {name:'New Mexico', code:'NM'}, {name:'Nevada', code:'NV'}, {name:'Oklahoma', code:'OK'}, {name:'Rhode Island', code:'RI'},
                    {name:'South Dakota', code:'SD'}, {name:'Tennesse', code:'TN'}, {name:'West Virginia', code:'WV'}, {name:'Wyoming', code:'WY'},
                    {name:'Arkansas', code:'AR'}, {name:'California', code:'CA'}, {name:'Delaware', code:'DE'}, {name:'Florida', code:'FL'},
                    {name:'Kansas', code:'KS'}, {name:'Kentucky', code:'KY'}, {name:'Massachusettes', code:'MA'}, {name:'Maryland', code:'MD'},
                    {name:'North Dakota', code:'ND'}, {name:'North Carolina', code:'NC'}, {name:'New York', code:'NY'}, {name:'Oregon', code:'OR'},
                    {name:'South Carolina', code:'SC'}, {name:'Utah', code:'UT'}, {name:'Virginia', code:'VA'}, {name:'Washington', code:'WA'}, 
                    {name:'Vermont', code:'VT'}, {name:'Michigan', code:'MI'}, {name:'Minnesota', code:'MN'}
                   ]

    
    const getPolicyNumber = () => {
        return policyNumber.toString()
    } 
    
    const getLineOfBusiness = () => {
        return linesOfBusiness[Math.floor(Math.random() * 3)]
    }
    
    const getState = () => {
        return states[Math.floor(Math.random() * 51)]
    }
    
    const getWritingCompany = () => {
        return writingCompanies[Math.floor(Math.random() * 10)]
    }
    
    const getExtractedDate = (start, end) => {
        return new Date(start.getTime() + Math.random() * (end.getTime() - start.getTime()));
    }
    
    const getError = () => {
        return Math.random() < .5
    }
    
    for (let i=0; i<15000; i++){
        let doc = {
            _id: new ObjectID(),
            state: getState(),
            lineOfBusiness: getLineOfBusiness(),
            policyNumber: getPolicyNumber(),
            writingCompany: getWritingCompany(),
            error: getError(),
            extractedDate: getExtractedDate(new Date(2012, 0, 1), new Date())
        }

        db.collection('records').insertOne(doc);
    }
    
    
}

//This will drop and recreate the Database with data
populateDb();

db.on('error', console.error.bind(console, 'MongoDB connection error:'))