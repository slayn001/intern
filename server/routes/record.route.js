"use strict"

const express = require('express')
const router = express.Router()

const record_controller = require('../controllers/record.controller')

router.get('/test', record_controller.test)
router.get('/:policyNumber', record_controller.recordByPN)


module.exports = router