// main.js
import { createApp } from 'vue'
import App from './App.vue'
import van from 'vant'
import 'vant/lib/index.css' // 关键样式引入
import axios from "axios";

const app = createApp(App)
app.use(van)
app.mount('#app')
