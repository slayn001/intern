"use strict"

const mongoose = require('mongoose')
const Schema = mongoose.Schema

let RecordSchema = new Schema({
    policyNumber: String,
    policyNumberSuffix: String
})

module.exports = mongoose.model('Record', RecordSchema)