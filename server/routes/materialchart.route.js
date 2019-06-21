"use strict"

const express = require('express')
const router = express.Router()

const materialChart_controller = require('../controllers/materialChart.controller')

router.get('/chart', materialChart_controller.chart)

module.exports = router