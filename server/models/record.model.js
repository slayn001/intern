"use strict"

const mongoose = require('mongoose')
const Schema = mongoose.Schema

let RecordSchema = new Schema({
    policyNumber: String,
    state: Schema.Types.Mixed,
    writingCompany: String,
    lineOfBusiness: String,
    error: Boolean,
    date: Date
})

module.exports = mongoose.model('Record', RecordSchema)