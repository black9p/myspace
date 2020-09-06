import Vue from 'vue'
import Vuex from 'vuex'
import board from './modules/board.store'

Vue.use(Vuex);

export default new Vuex.Store({
    board
});