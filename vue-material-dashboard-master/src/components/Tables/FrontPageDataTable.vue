<template>
  <div>
    <md-table v-model="users" :table-header-color="tableHeaderColor">
      <md-table-row slot="md-table-row" slot-scope="{ item }">
        <md-table-cell md-label="ID">{{ item.id }}</md-table-cell>
        <md-table-cell md-label="Name">{{ item.name }}</md-table-cell>
        <md-table-cell md-label="Details">{{ item.details }}</md-table-cell>
        <md-table-cell md-label="State">{{ item.state }}</md-table-cell>
        <md-table-cell md-label="City">{{ item.city }}</md-table-cell>
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
          id: 123,
          name: "Policy Name",
          details: "some data",
          state: "Rhode Island",
          city: "Providence"
        },
        {
          id: 124,
          name: "Another Policy Name",
          details: "D a T a",
          state: "New York",
          city: "New York"
        },
        {
          id: 125,
          name: "Yet Another Policy Name",
          details: "[null]",
          state: "Carolina",
          city: "North"
        },
        {
          id: 126,
          name: "Policy: a Name",
          details: "less data",
          state: "Space",
          city: "Space"
        }
      ]
    };
  }
};
</script>
