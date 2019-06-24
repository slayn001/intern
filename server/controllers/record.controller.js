"use strict"

const Record = require ('../models/record.model')

exports.test = (req, res) => {
    res.send('test controller')
}

exports.recordByPN = (req, res, next) => {
    Record.findOne({policyNumber: req.params.policyNumber}, function (err, record) {
        if (err) return next(err);
        
        Object.keys(record).forEach(function(key) {
            if( key === '_doc')
            console.log(key, record[key].state);
        });
        res.send(record);
    })
}
