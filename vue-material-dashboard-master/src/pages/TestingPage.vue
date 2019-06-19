

<head>
    <script src="vue.js"></script>
    <script src="vue-google-charts/dist/vue-google-charts.browser.js">
    </script>
</head>


<template>
    <div class="content">
        <div class="md-layout">
            <div class="md-layout-item md-medium-size-50 md-xsmall-size-100 md-size-25">


                <md-card>
                    <md-card-header data-background-color="custom">Test Chart</md-card-header>
                    <md-card-content>
                        <GChart
                                :settings="{packages: ['corechart','table','map']}"
                                type="ColumnChart"
                                :data="chartData"
                                :options="chartOptions"
                        />
                    </md-card-content>
                    <md-card-actions md-alignment="left">
                        <slot name="footer">
                            <div class="stats">
                                <md-icon>access_time</md-icon>
                                updated just now.
                            </div>
                        </slot>
                    </md-card-actions>
                </md-card>

                <GChart
                        :settings="{packages: ['corechart','table','map']}"
                        type="ColumnChart"
                        :data="chartData"
                        :options="chartOptions"
                />


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
    import {
        GChart
    } from 'vue-google-charts'

    export default {
        components: {
            StatsCard,
            ChartCard,
            NavTabsCard,
            NavTabsTable,
            OrderedTable,
            GChart
        },
        data () {
            return {
                // Array will be automatically processed with visualization.arrayToDataTable function
                chartData: [
                    ['Year', 'Sales', 'Expenses', 'Profit'],
                    ['2014', 1000, 400, 200],
                    ['2015', 1170, 460, 250],
                    ['2016', 660, 1120, 300],
                    ['2017', 1030, 540, 350]
                ],
                chartOptions: {
                    chart: {
                        title: 'Company Performance',
                        subtitle: 'Sales, Expenses, and Profit: 2014-2017',
                        width: 1500,
                        height: 1500

                    }
                }
            }
        }
    };
</script>

<style scoped>

</style>