<script>
import { boardApi } from '@/api'

export default {
    name: 'BoardForm',
    data() {
        return {
            name:'',
            title: '',
            content: ''
        }
    },
    methods: {
        write() {
            const board = Object.assign({}, {writer: this.name, title: this.title, content: this.content});
            boardApi.write(board).then(({data}) => {
                alert('저장 완료!');
                this.$router.push({ name: 'Board'});
            })
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
    <v-form ref="form">
    <v-text-field
      v-model="name"
      label="작성자"
      required
    ></v-text-field>

    <v-text-field
      v-model="title"
      label="제목"
      required
    ></v-text-field>

    <v-text-field
      v-model="content"
      label="내용"
      required
    ></v-text-field>

    <v-btn color="success" class="mr-4" @click="write">작성
    </v-btn>
  </v-form>
  </v-main>
  <v-footer dark absolute class="font-weight-medium">
      <v-col class="text-center white--text" cols="12">
        <strong>© Black9p. All rights reserved.</strong>
      </v-col>
    </v-footer>
</v-app>
</template>