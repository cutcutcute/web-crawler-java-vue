import { createRouter, createWebHistory } from 'vue-router'
import RouterConsts from './routerConsts'
import HomeView from "../views/HomeView.vue";
import KeywordsView from "../views/KeywordsView.vue";
import DataView from '@/views/DataView.vue';
import ByLinkView from "@/views/ByLinkView.vue";
import Settings from "@/views/Settings.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),

  
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },

    {
      path: "/keywords",
      name: "Keywords",
      component: KeywordsView
    },

    {
      path: "/data",
      name: "data",
      component: DataView
    },

    {
      path: "/by-link",
      name: "By Links",
      component: ByLinkView
    },
    {
      path: "/settings",
      name: "Settigns",
      component: Settings
    }
    //{
      //path: '/about',
      //name: 'about'
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      //component: () => import('../views/AboutView.vue')
    //}
  ]
})

export default router
