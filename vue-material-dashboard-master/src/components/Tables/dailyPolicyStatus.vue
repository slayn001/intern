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
        name: "dailyPolicyStatus",
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
                        id: "Sum of Policies in Extracted Status",
                        name: 314,
                        details: 5235,
                        state: 13,
                        city: 14198
                    },
                    {
                        id: "Status of Policies in Loaded Status on Met360",
                        name: 532,
                        details: 1312,
                        state: 231,
                        city: 2
                    },
                    {
                        id: "Status of Policies in Issued Status on Met360",
                        name: 12131,
                        details: 2131,
                        state: 321,
                        city: 12
                    },
                    {
                        id: "Sum or Renewals Canceled/Not Taken on Met360",
                        name: 643,
                        details: 234,
                        state: 845,
                        city: 24
                    },
                    {
                        id: "Totals",
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
