"use strict"

const Record = require ('../models/record.model')

exports.mbchart = (req, res) => {
    
    let ret = []
    
    console.log(req.query)
    
    Record.find({'state.code': {$in: req.query.st}}, (err, recordList) => {
        
        if (err) return next(err)
        
        
        const result = (arr, stateCode, lob ) => {
            return arr.filter( elem => {
                return elem.state.code === stateCode && elem.lineOfBusiness === lob && elem.error
            }).length
        }
        
        req.query.st.forEach( (el) => {
            ret.push({state:el, auto:result(recordList, el, 'auto'), home: result(recordList, el, 'home'), pelp:result(recordList, el, 'pelp')})
        })
        
        res.send(ret)
        
    })

//    res.send([
//        ['State', 'Auto', 'Home', 'Pep'],
//        ['PA', 1000, 400, 200],
//        ['IL', 1170, 460, 250],
//        ['WI', 660, 1120, 300],
//        ['TX', 1030, 540, 350]
//      ]
//    )
}

exports.mcchart = (req, res) => {
    
    let ret = []
    
    console.log(req.query)
    
    Record.find({'state.code': {$in: req.query.st}}, (err, recordList) => {
        if(err) return next(err)
        
        const result = (arr, stateCode, lob) => {
            return arr.filter( (elem) => {
                return elem.state.code === stateCode && elem.lineOfBusiness === lob
            }).length
        }
         
        req.query.st.forEach( (el) => {
            ret.push({state:el, auto:result(recordList, el, 'auto'), home: result(recordList, el, 'home'), pelp:result(recordList, el, 'pelp')})
        })
        
        res.send(ret)
    })
}