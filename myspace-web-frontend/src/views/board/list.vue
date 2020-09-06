<script>
import { boardApi } from '@/api'

export default {
    name: 'Board',
    created() {
        this.fetch();
    },
    data() {
        return {
            items:[]
        }
    },
    methods: {
        fetch() {
            boardApi.fetch().then(({data}) => {
                this.items = data;
            })
        },
        read(boardSeq) {
          this.$router.push({ name: 'BoardDetail', query: { 'boardSeq' : boardSeq } });
        }
    }
}
</script>
<template>
<v-app>
  <v-app-bar color="black" dense dark app>
    <v-toolbar-title>My Space</v-toolbar-title>
  </v-app-bar>

  <v-main>
    <v-row>
      <v-col md="10" offset-md="1">
        <v-simple-table dark>
          <template v-slot:default>
            <thead>
              <tr>
                <th class="text-left">글번호</th>
                <th class="text-left">제목</th>
                <th class="text-left">작성자</th>
                <th class="text-left">작성일</th>
              </tr>
            </thead>
            <tbody>
              <tr v-for="item in items" :key="item.boardSeq">
                <td class="text-left">{{ item.boardSeq }}</td>
                <td class="text-left" @click="read(item.boardSeq)">{{ item.title }}</td>
                <td class="text-left">{{ item.writer }}</td>
                <td class="text-left">{{ item.registerYmdt }}</td>
              </tr>
            </tbody>
          </template>
        </v-simple-table>
      </v-col>
    </v-row>
  </v-main>
  <v-footer dark absolute class="font-weight-medium">
      <v-col class="text-center white--text" cols="12">
        <strong>© Black9p. All rights reserved.</strong>
      </v-col>
    </v-footer>
</v-app>
</template>