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
        name: "legacyPIF",
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
                        id: "Legacy Total # Policies in Force",
                        name: 314,
                        details: 5235,
                        state: 13,
                        city: 14198
                    },
                    {
                        id: "Legacy Policy Effective Date",
                        name: 532,
                        details: 1312,
                        state: 231,
                        city: 2
                    }
                ]
            };
        }
    };
</script>
