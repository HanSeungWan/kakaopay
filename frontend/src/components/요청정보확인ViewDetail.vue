<template>

    <v-card outlined>
        <v-card-title>
            요청정보확인 # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: '요청정보확인ViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/요청정보확인/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

