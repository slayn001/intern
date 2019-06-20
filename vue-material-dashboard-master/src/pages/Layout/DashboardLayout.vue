<template>
  <div class="wrapper" :class="{ 'nav-open': $sidebar.showSidebar }">
    <notifications></notifications>

    <side-bar>
      <mobile-menu slot="content"></mobile-menu>
      <sidebar-link to="/overview">
        <md-icon>assessment</md-icon>
        <p>Charts</p>
      </sidebar-link>
      <sidebar-link to="/reporting">
        <md-icon>description</md-icon>
        <p>Reports</p>
      </sidebar-link>
      <sidebar-link to="/testingpage">
        <md-icon>error</md-icon>
        <p>Testing</p>
      </sidebar-link>
    </side-bar>

    <div class="main-panel">
      <top-navbar></top-navbar>

      <dashboard-content> </dashboard-content>
    </div>
  </div>
</template>
<style lang="scss"></style>
<script>
import TopNavbar from "./TopNavbar.vue";
import DashboardContent from "./Content.vue";
import MobileMenu from "@/pages/Layout/MobileMenu.vue";

export default {
  components: {
    TopNavbar,
    DashboardContent,
    MobileMenu
  }
};
</script>
