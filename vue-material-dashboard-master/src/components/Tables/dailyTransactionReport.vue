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

            </md-table-row>
        </md-table>
    </div>
</template>

<script>
    export default {
        name: "dailyTransactionReport",
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
                        id: "Total # Policies Extracted",
                        name: 314,
                        details: 5235,
                        state: 13,
                        city: 14198
                    },
                    {
                        id: "Total # Exposures Extracted",
                        name: 532,
                        details: 1312,
                        state: 231,
                        city: 2
                    },
                    {
                        id: "Total # Drivers Extracted - Auto",
                        name: 12131,
                        details: 2131,
                        state: 321,
                        city: 12
                    },
                    {
                        id: "Total Premium Extracted",
                        name: 643,
                        details: 234,
                        state: 845,
                        city: 24
                    },{
                        id: "Total Extraction Errors",
                        name: 314,
                        details: 5235,
                        state: 13,
                        city: 14198
                    },
                    {
                        id: "Total # Policies Manually Migrated",
                        name: 532,
                        details: 1312,
                        state: 231,
                        city: 2
                    },
                    {
                        id: "Total # Policies Transformed",
                        name: 12131,
                        details: 2131,
                        state: 321,
                        city: 12
                    },
                    {
                        id: "Total # Exposures Transformed",
                        name: 643,
                        details: 234,
                        state: 845,
                        city: 24
                    },
                    {
                        id: "Total # of Drivers Transformed - Auto",
                        name: 643,
                        details: 234,
                        state: 845,
                        city: 24
                    },{
                        id: "Total Premium Transformed",
                        name: 314,
                        details: 5235,
                        state: 13,
                        city: 14198
                    },
                    {
                        id: "Total # of Transformation Errors",
                        name: 532,
                        details: 1312,
                        state: 231,
                        city: 2
                    },
                    {
                        id: "Total # of Policies Loaded",
                        name: 12131,
                        details: 2131,
                        state: 321,
                        city: 12
                    },
                    {
                        id: "Total # of Exposures Loaded",
                        name: 643,
                        details: 234,
                        state: 845,
                        city: 24
                    },
                    {
                        id: "Total # of Drivers Loaded - Auto",
                        name: 532,
                        details: 1312,
                        state: 231,
                        city: 2
                    },
                    {
                        id: "Total Premium Loaded",
                        name: 12131,
                        details: 2131,
                        state: 321,
                        city: 12
                    },
                    {
                        id: "Total # of Load Errors",
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
