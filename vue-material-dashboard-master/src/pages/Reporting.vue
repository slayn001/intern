<template>
  <div class="content">
    <div class="md-layout">
      <div class="md-layout-item md-medium-size-50 md-xsmall-size-100 md-size-25">
        <stats-card data-background-color="green">
          <template slot="header">
            <md-icon>done</md-icon>
          </template>

          <template slot="content">
            <p class="category">Migrations Today</p>
            <h3 class="title">2,131</h3>
          </template>

          <template slot="footer">
            <div class="stats">
              <md-icon>date_range</md-icon>
              Last 24 Hours
            </div>
          </template>
        </stats-card>
      </div>

      <div class="md-layout-item md-medium-size-50 md-xsmall-size-100 md-size-25">
        <stats-card data-background-color="green">
          <template slot="header">
            <md-icon>done_all</md-icon>
          </template>

          <template slot="content">
            <p class="category">Total Migrations</p>
            <h3 class="title">34,245</h3>
          </template>

          <template slot="footer">
            <div class="stats">
              <md-icon>date_range</md-icon>
              Last 24 Hours
            </div>
          </template>
        </stats-card>
      </div>

      <div class="md-layout-item md-medium-size-50 md-xsmall-size-100 md-size-25">
        <stats-card data-background-color="green">
          <template slot="header">
            <md-icon>timer</md-icon>
          </template>

          <template slot="content">
            <p class="category">Avg. Time per Migration</p>
            <h3 class="title">75 min.</h3>
          </template>
          <template slot="footer">
            <div class="stats">
              <md-icon>update</md-icon>
              Just Updated
            </div>
          </template>
        </stats-card>
      </div>

      <div class="md-layout-item md-medium-size-50 md-xsmall-size-100 md-size-25">
        <stats-card data-background-color="green">
          <template slot="header">
            <md-icon>warning</md-icon>
          </template>

          <template slot="content">
            <p class="category">Errors Today</p>
            <h3 class="title">
              123
            </h3>
          </template>
            <template slot="footer">
              <div class="stats">
                <md-icon>update</md-icon>
                Just Updated
              </div>
            </template>
        </stats-card>
      </div>

      <!--Chart 5-->
      <div class="md-layout-item md-medium-size-100 md-xsmall-size-100 md-size-50">
        <md-card>
          <md-card-header data-background-color="metDarkBlue">
            <h4 class="title">Daily Error Summary Report</h4>
            <p class="category"></p>
          </md-card-header>
          <md-card-content>
            <div align="center">
              <md-button data-background-color="dark-blue"><md-icon>place</md-icon>
                By State</md-button>
              <md-button data-background-color="dark-blue"><md-icon>store</md-icon>
                By Line of Business</md-button>
              <md-button data-background-color="dark-blue"><md-icon>assignment</md-icon>
                By Legacy Writing Company</md-button>
              <p></p>
            </div>
            <daily-error table-header-color="dark-blue"></daily-error>
          </md-card-content>
          <div align="center">
            <md-button data-background-color="dark-blue"><md-icon>print</md-icon>
              Print</md-button>
            <md-button data-background-color="dark-blue"><md-icon>save</md-icon>
              Save in Excel</md-button>
          </div>
        </md-card>
      </div>

      <!--Chart 6-->
      <div class="md-layout-item md-medium-size-100 md-xsmall-size-100 md-size-50">
        <md-card>
          <md-card-header data-background-color="metDarkBlue">
            <h4 class="title">Daily Report of Policy Status</h4>
            <p class="category"></p>
          </md-card-header>
          <md-card-content>
            <div align="center">
              <md-button data-background-color="dark-blue"><md-icon>place</md-icon>
                By State</md-button>
              <md-button data-background-color="dark-blue"><md-icon>store</md-icon>
                By Line of Business</md-button>
              <md-button data-background-color="dark-blue"><md-icon>assignment</md-icon>
                By Legacy Writing Company</md-button>
              <p></p>
            </div>
            <daily-policy-status table-header-color="dark-blue"></daily-policy-status>
          </md-card-content>
          <div align="center">
            <md-button data-background-color="dark-blue"><md-icon>print</md-icon>
              Print</md-button>
            <md-button data-background-color="dark-blue"><md-icon>save</md-icon>
              Save in Excel</md-button>
          </div>
        </md-card>
      </div>

      <!--Chart 1-->
      <div class="md-layout-item md-medium-size-100 md-xsmall-size-100 md-size-50">
        <md-card>

          <md-card-header data-background-color="metDarkBlue">
            <h4 class="title">Daily Policy Level Migration Report</h4>
            <p class="category"></p>
          </md-card-header>

          <md-card-content>

            <div align="center">
              <md-button data-background-color="dark-blue"><md-icon>place</md-icon>
                By State</md-button>
              <md-button data-background-color="dark-blue"><md-icon>store</md-icon>
                By Line of Business</md-button>
              <md-button data-background-color="dark-blue"><md-icon>assignment</md-icon>
                By Legacy Writing Company</md-button>
              <p></p>
            </div>

            <policy-level-migration table-header-color="dark-blue"></policy-level-migration>
          </md-card-content>
          <div align="center">
          <md-button data-background-color="dark-blue"><md-icon>print</md-icon>
            Print</md-button>
          <md-button data-background-color="dark-blue"><md-icon>save</md-icon>
            Save in Excel</md-button>
          </div>
        </md-card>
      </div>

      <!--Chart 2-->
      <div class="md-layout-item md-medium-size-100 md-xsmall-size-100 md-size-50">
        <md-card>
          <md-card-header data-background-color="metDarkBlue">
            <h4 class="title">Daily Summary Level Migration Report</h4>
            <p class="category"></p>
          </md-card-header>
          <md-card-content>
            <div align="center">
              <md-button data-background-color="dark-blue"><md-icon>place</md-icon>
                By State</md-button>
              <md-button data-background-color="dark-blue"><md-icon>store</md-icon>
                By Line of Business</md-button>
              <md-button data-background-color="dark-blue"><md-icon>assignment</md-icon>
                By Legacy Writing Company</md-button>
              <p></p>
            </div>
            <legacy-p-i-f table-header-color="dark-blue"></legacy-p-i-f>
          </md-card-content>
          <div align="center">
            <md-button data-background-color="dark-blue"><md-icon>print</md-icon>
              Print</md-button>
            <md-button data-background-color="dark-blue"><md-icon>save</md-icon>
              Save in Excel</md-button>
          </div>
        </md-card>
      </div>

      <!--Chart 3-->
      <div class="md-layout-item md-medium-size-100 md-xsmall-size-100 md-size-50">
        <md-card>
          <md-card-header data-background-color="metDarkBlue">
            <h4 class="title">ETL Report</h4>
            <p class="category"></p>
          </md-card-header>
          <md-card-content>
            <div align="center">
              <md-button data-background-color="dark-blue"><md-icon>place</md-icon>
                By State</md-button>
              <md-button data-background-color="dark-blue"><md-icon>store</md-icon>
                By Line of Business</md-button>
              <md-button data-background-color="dark-blue"><md-icon>assignment</md-icon>
                By Legacy Writing Company</md-button>
              <p></p>
            </div>
            <etl-report table-header-color="dark-blue"></etl-report>
          </md-card-content>
          <div align="center">
            <md-button data-background-color="dark-blue"><md-icon>print</md-icon>
              Print</md-button>
            <md-button data-background-color="dark-blue"><md-icon>save</md-icon>
              Save in Excel</md-button>
          </div>
        </md-card>
      </div>

      <!--Chart 4-->
      <div class="md-layout-item md-medium-size-100 md-xsmall-size-100 md-size-50">
        <md-card>
          <md-card-header data-background-color="metDarkBlue">
            <h4 class="title">Daily Transaction Report</h4>
            <p class="category"></p>
          </md-card-header>
          <md-card-content>
            <div align="center">
              <md-button data-background-color="dark-blue"><md-icon>place</md-icon>
                By State</md-button>
              <md-button data-background-color="dark-blue"><md-icon>store</md-icon>
                By Line of Business</md-button>
              <md-button data-background-color="dark-blue"><md-icon>assignment</md-icon>
                By Legacy Writing Company</md-button>
              <p></p>
            </div>
            <daily-transaction-report table-header-color="dark-blue"></daily-transaction-report>
          </md-card-content>
          <div align="center">
            <md-button data-background-color="dark-blue"><md-icon>print</md-icon>
              Print</md-button>
            <md-button data-background-color="dark-blue"><md-icon>save</md-icon>
              Save in Excel</md-button>
          </div>
        </md-card>
      </div>



      </div>
      </div>


</template>

<script>
  import {
    StatsCard
  } from "@/components";


  import EtlReport from "../components/Tables/etlReport";
  import PolicyLevelMigration from "../components/Tables/policyLevelMigration";
  import LegacyPIF from "../components/Tables/legacyPIF";
  import DailyTransactionReport from "../components/Tables/dailyTransactionReport";
  import DailyError from "../components/Tables/dailyError";
  import DailyPolicyStatus from "../components/Tables/dailyPolicyStatus";

  export default {
    components: {
      DailyPolicyStatus,
      DailyError,
      DailyTransactionReport,
      LegacyPIF,
      PolicyLevelMigration,
      EtlReport,
      StatsCard
    },
    data() {
      return {
        migrationspermonth: {
          data: {
            labels: [
              "Jan",
              "Feb",
              "Mar",
              "Apr",
              "May",
              "Jun",
              "Jul",
              "Aug",
              "Sep",
              "Oct",
              "Nov",
              "Dec"
            ],
            series: [[12, 17, 7, 17, 23, 18, 38, 12, 15, 16, 30, 43]]
          },
          options: {
            lineSmooth: this.$Chartist.Interpolation.cardinal({
              tension: 0
            }),
            low: 0,
            high: 50, // creative tim: we recommend you to set the high sa the biggest value + something for a better look
            chartPadding: {
              top: 0,
              right: 0,
              bottom: 0,
              left: 0
            }
          }
        },
        successratepermonth: {
          data: {
            labels: [
              "Jan",
              "Feb",
              "Mar",
              "Apr",
              "May",
              "Jun",
              "Jul",
              "Aug",
              "Sep",
              "Oct",
              "Nov",
              "Dec"
            ],
            series: [[95, 10, 25, 87, 40, 40, 20, 19, 50, 60, 70, 12]]
          },
          options: {
            axisX: {
              showGrid: false
            },
            low: 0,
            high: 100,
            chartPadding: {
              top: 20,
              right: 0,
              bottom: 0,
              left: 0
            }
          },
          responsiveOptions: [
            [
              "screen and (max-width: 640px)",
              {
                seriesBarDistance: 5,
                axisX: {
                  labelInterpolationFnc: function(value) {
                    return value[0];
                  }
                }
              }
            ]
          ]
        },
        migrationsbylocale: {
          data: {
            labels: ['m', 't', 'w', 't', 'f'],
            series: [[10,20,10,20,10]]
          }
        },
        options: {
          lineSmooth: this.$Chartist.Interpolation.cardinal({
            tension: 0
          }),
          low: 0,
          high: 50,
          chartPadding: {
            top: 20,
            right: 0,
            bottom: 0,
            left: 0
          }
        }
      };
    }
  };
</script>
