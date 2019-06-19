<template>
    <div>
        <md-table v-model="users" :table-header-color="tableHeaderColor">
            <md-table-row slot="md-table-row" slot-scope="{ item }">

                <md-table-cell md-label="Measure">{{ item.id }}</md-table-cell>
                <md-table-cell md-label="AL">{{ item.name }}</md-table-cell>
                <md-table-cell md-label="AZ">{{ item.details }}</md-table-cell>
                <md-table-cell md-label="AR">{{ item.state }}</md-table-cell>
                <md-table-cell md-label="CA">{{ item.city }}</md-table-cell>
                <md-table-cell md-label="CO">{{ item.name }}</md-table-cell>
                <md-table-cell md-label="CT">{{ item.details }}</md-table-cell>
                <md-table-cell md-label="DE">{{ item.state }}</md-table-cell>
                <md-table-cell md-label="FL">{{ item.city }}</md-table-cell>
                <md-table-cell md-numeric="07/12/1992"></md-table-cell>
            </md-table-row>
        </md-table>
    </div>
</template>

    <script>
        export default {
            name: "policyLevelMigration",
            props: {
                tableHeaderColor: {
                    type: String,
                    default: ""
                }
            },
            data() {
                return {
                    selected: [],
                    users: [
                        {
                            id: "Legacy Policy Number",
                            name: 314,
                            details: 5235,
                            state: 13,
                            city: 14198
                        },
                        {
                            id: "Legacy Policy Number Suffix",
                            name: 532,
                            details: 1312,
                            state: 231,
                            city: 2
                        },
                        {
                            id: "Legacy Line of Business",
                            name: 12131,
                            details: 2131,
                            state: 321,
                            city: 12
                        },
                        {
                            id: "Legacy State",
                            name: 643,
                            details: 234,
                            state: 845,
                            city: 24
                        },{
                            id: "Legacy Policy Effective Date",
                            name: 314,
                            details: 5235,
                            state: 13,
                            city: 14198
                        },
                        {
                            id: "Legacy Writing Company",
                            name: 532,
                            details: 1312,
                            state: 231,
                            city: 2
                        },
                        {
                            id: "Legacy Mono/Combo/GrandProtect Indicator",
                            name: 12131,
                            details: 2131,
                            state: 321,
                            city: 12
                        },
                        {
                            id: "Transformation Error Y/N",
                            name: 643,
                            details: 234,
                            state: 845,
                            city: 24
                        },
                        {
                            id: "Transformation Error Date",
                            name: 643,
                            details: 234,
                            state: 845,
                            city: 24
                        },{
                            id: "Transformation Error Codes",
                            name: 314,
                            details: 5235,
                            state: 13,
                            city: 14198
                        },
                        {
                            id: "Transformation Error Description",
                            name: 532,
                            details: 1312,
                            state: 231,
                            city: 2
                        },
                        {
                            id: "Policy Load Failed Y/N",
                            name: 12131,
                            details: 2131,
                            state: 321,
                            city: 12
                        },
                        {
                            id: "Policy Load Failed Date",
                            name: 643,
                            details: 234,
                            state: 845,
                            city: 24
                        },
                        {
                            id: "Policy Loaded with Error Y/N",
                            name: 532,
                            details: 1312,
                            state: 231,
                            city: 2
                        },
                        {
                            id: "Policy Loaded with Error Date",
                            name: 12131,
                            details: 2131,
                            state: 321,
                            city: 12
                        },
                        {
                            id: "Batch Number(ETL)",
                            name: 643,
                            details: 234,
                            state: 845,
                            city: 24
                        }
                    ]
                };
            }
        };
    </script>
