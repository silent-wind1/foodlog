import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import van from 'vant'
import 'vant/lib/index.css' // 关键样式引入

const app = createApp(App)

app.use(router)
app.use(van)
app.mount('#app')
