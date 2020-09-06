import axios from 'axios'

const boardUrl = '/api/boards';
export const boardApi = {
    fetch() {
        return axios.get(`${boardUrl}`);
    }
}