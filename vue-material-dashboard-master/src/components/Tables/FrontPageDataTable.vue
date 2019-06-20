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
        <md-table-cell md-label="GE">{{ item.name }}</md-table-cell>
        <md-table-cell md-label="HI">{{ item.details }}</md-table-cell>
        <md-table-cell md-label="IL">{{ item.state }}</md-table-cell>
        <md-table-cell md-label="IN">{{ item.city }}</md-table-cell>
      </md-table-row>
    </md-table>
  </div>
</template>

<script>
export default {
  name: "ordered-table",
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
          id: "Total PIF Start of Migration",
          name: 314,
          details: 5235,
          state: 13,
          city: 14198
        },
        {
          id: "Total # of Policies Extracted to Date",
          name: 532,
          details: 1312,
          state: 231,
          city: 2
        },
        {
          id: "Total # of Extract Errors",
          name: 12131,
          details: 2131,
          state: 321,
          city: 12
        },
        {
          id: "Total # Policies Transformed",
          name: 643,
          details: 234,
          state: 845,
          city: 24
        },{
          id: "Total # Transformation Errors",
          name: 314,
          details: 5235,
          state: 13,
          city: 14198
        },
        {
          id: "Total # of Policies Loaded",
          name: 532,
          details: 1312,
          state: 231,
          city: 2
        },
        {
          id: "Total # Load Errors",
          name: 12131,
          details: 2131,
          state: 321,
          city: 12
        },
        {
          id: "Total # Policies Issued",
          name: 643,
          details: 234,
          state: 845,
          city: 24
        },
        {
          id: "Total # Policies Manually Migrated",
          name: 643,
          details: 234,
          state: 845,
          city: 24
        },{
          id: "Total # Policies Canceled/Not Taken Met360",
          name: 314,
          details: 5235,
          state: 13,
          city: 14198
        },
        {
          id: "Total # PIF on Met360",
          name: 532,
          details: 1312,
          state: 231,
          city: 2
        },
        {
          id: "Total % of Policies Migrated to Date",
          name: 12131,
          details: 2131,
          state: 321,
          city: 12
        },
        {
          id: "Total # of Policies Errored to Date",
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
