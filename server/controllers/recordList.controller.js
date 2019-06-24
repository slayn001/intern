"use strict"

const Record = require ('../models/record.model')

exports.test = (req, res) => {
    res.send('test controller')
}

exports.all = (req, res, next) => {
    Record.find({}, (err, recordList) => {
        if(err) return next(err) 
        res.send(recordList)
    })
}