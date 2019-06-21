"use strict"

const mongoose = require('mongoose')
const Record = require('./models/record.model.js')


let db_url = 'mongodb://localhost:27017/testdb'

mongoose.connect(db_url)

mongoose.Promise = global.Promise

let db = mongoose.connection

db.on('error', console.error.bind(console, 'MongoDB connection error:'))


