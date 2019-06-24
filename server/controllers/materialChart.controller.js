"use strict"

exports.mbchart = (req, res) => {
    res.send([
        ['State', 'Auto', 'Home', 'Pep'],
        ['PA', 1000, 400, 200],
        ['IL', 1170, 460, 250],
        ['WI', 660, 1120, 300],
        ['TX', 1030, 540, 350]
      ]
    )
}

exports.mcchart = (req, res) => {
    res.send([
                {
                    "state": "PA",
                    "Auto": 15,
                    "Home": 14,
                    "Pelp": 12
                },
                {
                    "state": "IL",
                    "Auto": 13,
                    "Home": 15,
                    "Pelp": 21
                },
                {
                    "state": "WA",
                    "Auto": 7,
                    "Home": 6,
                    "Pelp": 4
                },
                {
                    "state": "AZ",
                    "Auto": 12,
                    "Home": 9,
                    "Pelp": 20
                },
                {
                    "state": "KY",
                    "Auto": 19,
                    "Home": 12,
                    "Pelp": 13
                },
                {
                    "state": "IN",
                    "Auto": 17,
                    "Home": 11,
                    "Pelp": 9
                },
        
        
        ])
}