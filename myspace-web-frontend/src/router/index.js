import Vue from 'vue'
import VueRouter from 'vue-router';

Vue.use(VueRouter)

export default new VueRouter( {
    mode: 'history',
    routes: [
        {
            path: "/board",
            name: "Board",
            component: () => import('@/views/board/list')
        },
        {
            path: "/boardDetail",
            name: "BoardDetail",
            component: () => import('@/views/board/detail')
        },
        {
            path: "/boardForm",
            name: "BoardForm",
            component: () => import('@/views/board/form')
        }
    ]
})