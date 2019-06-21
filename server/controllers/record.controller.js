"use strict"

const Record = require ('../models/record.model')

exports.test = (req, res) => {
    res.send('test controller')
}

exports.recordByPN = (req, res, next) => {
    Record.findOne({policyNumber: req.params.policyNumber}, function (err, record) {
        if (err) return next(err);
        res.send(record);
    })
}

exports.material = (req, res) => {
    res.send({
            "cols": [{
              "id": "lob",
              "label": "Line of Business",
              "type": "string"
            }, {
              "id": "home",
              "label": "Home",
              "type": "number"
            }, {
              "id": "auto",
              "label": "Auto",
              "type": "number"
            }, {
              "id": "pelp",
              "label": "PELP",
              "type": "number"
            }],

            "rows": [{
              "c": [{
                "v": "CA"
              }, {
                "v": 26
              }, {
                "v": 26
              }, {
                "v": 9
              }]
            }, {
              "c": [{
                "v": "PA"
              }, {
                "v": 26
              }, {
                "v": 27
              }, {
                "v": 27
              }]
            }, {
              "c": [{
                "v": "WA"
              }, {
                "v": 26
              }, {
                "v": 26
              }, {
                "v": 5
              }]
            }, {
              "c": [{
                "v": "AZ"
              }, {
                "v": 4
              }, {
                "v": 6
              }, {
                "v": 17
              }]
            }]
          }
    
    )
}