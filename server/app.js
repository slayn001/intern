"use strict"

const bodyParser = require('body-parser')
const express  = require('express')
const cors = require('cors')
const mongoose = require('mongoose')

require('./database.js')

const record = require('./routes/record.route')
const recordList = require('./routes/recordList.route')
const materialChart = require('./routes/materialchart.route')

const app = express()
const port = 3000

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended:false}))

app.use(cors());

app.use('/record', record)
app.use('/recordList', recordList)
app.use('/materialChart', materialChart)


app.get('/', (req, res) => res.send('Hello World'))

app.listen(port, ()=> console.log(`Example app listening on port ${port}`))