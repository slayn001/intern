<template>
  <div class="content">
    <div class="md-layout">
      <div
              class="md-layout-item md-medium-size-50 md-xsmall-size-100 md-size-25"
      >
        <stats-card data-background-color="teal">
          <template slot="header">
            <md-icon>done</md-icon>
          </template>

          <template slot="content">
            <p class="category">Total Migrations</p>
            <h3 class="title">34,245</h3>
          </template>

          <template slot="footer">
            <div class="stats">
              <md-icon>date_range</md-icon>
              Last 24 Hours (WE NEED FUNCTIONALITY)
            </div>
          </template>
        </stats-card>
      </div>
      <div
              class="md-layout-item md-medium-size-50 md-xsmall-size-100 md-size-25"
      >
        <stats-card data-background-color="berry">
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
              Just Updated (ALL LIES)
            </div>
          </template>
        </stats-card>
      </div>
      <div
              class="md-layout-item md-medium-size-50 md-xsmall-size-100 md-size-25"
      >
        <stats-card data-background-color="yellow">
          <template slot="header">
            <md-icon>content_copy</md-icon>
          </template>

          <template slot="content">
            <p class="category">Used Space</p>
            <h3 class="title">
              49/50
              <small>GB</small>
            </h3>
          </template>
        </stats-card>
      </div>
      <div
        class="md-layout-item md-large-size-100 md-large-size-100 md-size-50"
      >
        <chart-card
          :chart-data="migrationspermonth.data"
          :chart-options="migrationspermonth.options"
          :chart-type="'Bar'"
          data-background-color="blue"
        >
          <template slot="content">
            <h4 class="title">Migrations per Month</h4>
          </template>
          <template slot="footer">
            <div class="stats">
              <md-icon>access_time</md-icon>
              updated 4 minutes ago (ADD SCRIPT FOR REAL TIME)
            </div>
          </template>
        </chart-card>
      </div>
      <div
        class="md-layout-item md-medium-size-100 md-xsmall-size-100 md-size-50"
      >
        <chart-card
          :chart-data="successratepermonth.data"
          :chart-options="successratepermonth.options"
          :chart-responsive-options="successratepermonth.responsiveOptions"
          :chart-type="'Line'"
          data-background-color="dark-blue"
        >
          <template slot="content">
            <h4 class="title">Migration Success Rate per Month (%)</h4>
          </template>

          <template slot="footer">
            <div class="stats">
              <md-icon>access_time</md-icon>
              updated 10 days ago (THIS DATA IS ALL FAKE)
            </div>
          </template>
        </chart-card>
      </div>
        <div class="md-layout-item md-medium-size-100 md-size-50">
            <edit-profile-form data-background-color="green"> </edit-profile-form>
        </div>
        <div class="md-layout-item md-medium-size-100 md-xsmall-size-100 md-size-50">
            <chart-card
                    :chart-data="migrationsbylocale.data"
                    :chart-options="migrationsbylocale.options"
                    :chart-responsive-options="migrationsbylocale.responsiveOptions"
                    :chart-type="'Line'"
                    data-background-color="dark-blue"
            >
                <template slot="content">
                    <h4 class="title">Migrations by Locale (STATE GOES HERE)</h4>
                </template>

                <template slot="footer">
                    <div class="stats">
                        <md-icon>access_time</md-icon>
                        updated 10 days ago (THIS DATA IS ALL FAKE)
                    </div>
                </template>
            </chart-card>
        </div>
      <div
        class="md-layout-item md-medium-size-100 md-xsmall-size-100 md-size-50"
      >
        <md-card>
          <md-card-header data-background-color="dark-blue">
            <h4 class="title">Most Recent</h4>
            <p class="category">Migrations done within the past: HOUR</p>
          </md-card-header>
          <md-card-content>
            <ordered-table table-header-color="dark-blue"></ordered-table>
          </md-card-content>
        </md-card>
      </div>
      <div
        class="md-layout-item md-medium-size-100 md-xsmall-size-100 md-size-50"
      >
        <nav-tabs-card>
          <template slot="content">
            <span class="md-nav-tabs-title">Tasks:</span>
            <md-tabs md-sync-route class="md-success" md-alignment="left">
              <md-tab id="tab-home" md-label="Bugs" md-icon="bug_report">
                <nav-tabs-table></nav-tabs-table>
              </md-tab>

              <md-tab id="tab-pages" md-label="Website" md-icon="code">
                <nav-tabs-table></nav-tabs-table>
              </md-tab>

              <md-tab id="tab-posts" md-label="server" md-icon="cloud">
                <nav-tabs-table></nav-tabs-table>
              </md-tab>
            </md-tabs>
          </template>
        </nav-tabs-card>
      </div>
    </div>
  </div>
</template>

<script>
import {
  StatsCard,
  ChartCard,
  NavTabsCard,
  NavTabsTable,
  OrderedTable
} from "@/components";

import { EditProfileForm } from "@/pages";

export default {
  components: {
    StatsCard,
    ChartCard,
    NavTabsCard,
    NavTabsTable,
    OrderedTable,
    EditProfileForm
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
