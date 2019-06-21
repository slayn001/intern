"use strict"

const express = require('express')
const router = express.Router()

const recordList_controller = require('../controllers/recordList.controller')

router.get('/test', recordList_controller.test)
router.get('/all', recordList_controller.all)


module.exports = router