import DashboardLayout from "@/pages/Layout/DashboardLayout.vue";

import Dashboard from "@/pages/Overview.vue";
import UserProfile from "@/pages/Reporting.vue";
import TestingPage from "@/pages/TestingPage.vue";

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
        name: "Migration Reports",
        component: UserProfile
      },
      {
        path: "testingpage",
        name: "Testinngpage",
        component: TestingPage
      }
    ]
  }
];

export default routes;
