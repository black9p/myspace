<script>
import { boardApi } from '@/api'

export default {
    name: 'BoardDetail',
    created() {
        if (this.$route.query.boardSeq) {
            this.fetch(this.$route.query.boardSeq);
        }
    },
    data() {
        return {
            item: {}
        }
    },
    methods: {
        fetch(boardSeq) {
            boardApi.fetchDetail(boardSeq).then(({data}) => {
                this.item = data;
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
      <h2>{{item.title}}</h2>
      <p>{{item.content}}</p>
      {{item.writer}}
      {{item.registerYmdt}}
  </v-main>
  <v-footer dark absolute class="font-weight-medium">
      <v-col class="text-center white--text" cols="12">
        <strong>© Black9p. All rights reserved.</strong>
      </v-col>
    </v-footer>
</v-app>
</template>