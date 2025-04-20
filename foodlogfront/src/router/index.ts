import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: import('@/views/HomeView.vue'),
    },
    {
      path: '/home',
      name: 'home',
      component: import('@/views/HomeView.vue'),
      meta: { title: '首页' }
    },
    {
      path: '/user',
      name: 'user',
      component: () => import('@/views/UserView.vue'),
      meta: { title: '我的' }
    },
  ],
})

export default router
