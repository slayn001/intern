<template>
  <form>
    <md-card>
      <md-card-header :data-background-color="dataBackgroundColor">
        <h4 class="title">Query Reports</h4>
        <p class="category">Select your desired query fields</p>
      </md-card-header>

      <md-card-content>
        <div class="md-layout">
          <div class="md-layout-item md-small-size-100 md-size-40">
            <md-field>
              <label>Policy #</label>
              <md-input v-model="policyNumber" type="text"></md-input>
            </md-field>
          </div>
          <div class="md-layout-item md-small-size-100 md-size-40">
            <md-field>
              <label>Business Name</label>
              <md-input v-model="business" type="text"></md-input>
            </md-field>
          </div>


          <div class="md-layout-item md-small-size-100 md-size-20">
            <div class="md-autocomplete">
              <md-autocomplete
              class="search"
              v-model="selectedState"
              :md-options="states"
              >
                <label>State</label>
              </md-autocomplete>
            </div>
          </div>
          <div class="md-layout-item md-small-size-100 md-size-25">
            <md-field>
              <label>Total Premium</label>
              <md-input v-model="totalPremium" type="text"></md-input>
            </md-field>
          </div>
          <div class="md-layout-item md-small-size-100 md-size-25">
            <md-field>
              <label>Agent ID</label>
              <md-input v-model="lastname" type="text"></md-input>
            </md-field>
          </div>
          <div class="md-layout-item md-small-size-100 md-size-50">
            <md-field>
              <label>Mailing Address</label>
              <md-input v-model="address" type="text"></md-input>
            </md-field>
          </div>
          <div class="md-layout-item md-small-size-100 md-size-20">
            <input type="radio" id="line" value="line" v-model="picked">
            <label for="line">Line</label>
          </div>
          <div class="md-layout-item md-small-size-100 md-size-20">
            <input type="radio" id="bar" value="bar" v-model="picked">
            <label for="line">Bar</label>
          </div>
          <div class="md-layout-item md-size-100 text-left">
            <md-button class="md-raised md-success">Search</md-button>
          </div>
        </div>
      </md-card-content>
    </md-card>
  </form>
</template>
<script>
export default {
  name: "query-form",
  props: {
    dataBackgroundColor: {
      type: String,
      default: "berry"
    }
  },
  data() {
    return {
      picked: "line",
      policyNumber: null,
      business: null,
      disabled: null,
      State: null,
      lastname: null,
      totalPremium: null,
      address: null,
      city: null,
      country: null,
      code: null,
      aboutme: null,
      selectedState: null,
      states: [
        "AK",
        "AL",
        "AR",
        "AZ",
        "CA",
        "CO",
        "CT",
        "DC",
        "DE",
        "FL",
        "GA",
        "HI",
        "IA",
        "ID",
        "IL",
        "IN",
        "KS",
        "KY",
        "LA",
        "MA",
        "MD",
        "ME",
        "MI",
        "MN",
        "MO",
        "MS",
        "MT",
        "NC",
        "ND",
        "NE",
        "NH",
        "NJ",
        "NM",
        "NV",
        "NY",
        "OH",
        "OK",
        "OR",
        "PA",
        "RI",
        "SC",
        "SD",
        "TN",
        "TX",
        "UT",
        "VA",
        "VT",
        "WA",
        "WI",
        "WV",
        "WY"
      ]
    };
  }
};
</script>
<style></style>
