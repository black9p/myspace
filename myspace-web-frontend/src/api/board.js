import axios from 'axios'

const boardUrl = '/api/boards';
export const boardApi = {
    fetch() {
        return axios.get(`${boardUrl}`);
    },
    fetchDetail(boardSeq) {
        return axios.get(`${boardUrl}/${boardSeq}`);
    },
    write(board) {
        return axios.post(`${boardUrl}`, board);
    }
}