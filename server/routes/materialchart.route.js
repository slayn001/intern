"use strict"

const express = require('express')
const router = express.Router()

const materialChart_controller = require('../controllers/materialChart.controller')

router.get('/mbchart', materialChart_controller.mbchart)
router.get('/mcchart', materialChart_controller.mcchart)

module.exports = router