import DashboardLayout from "@/pages/Layout/DashboardLayout.vue";

import Dashboard from "@/pages/Dashboard.vue";
import UserProfile from "@/pages/UserProfile.vue";

const routes = [
  {
    path: "/",
    component: DashboardLayout,
    redirect: "/overview",
    children: [
      {
        path: "overview",
        name: "Overview",
        component: Dashboard
      },
      {
        path: "reporting",
        name: "Reporting",
        component: UserProfile
      }
    ]
  }
];

export default routes;
