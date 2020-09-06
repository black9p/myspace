import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import VueMaterial from 'vue-material'
import 'vue-material/dist/vue-material.min.css'
import 'vue-material/dist/theme/default.css'

const app = createApp(App)
app.use(router)
app.use(store)
app.use(VueMaterial)
app.mount('#app')
