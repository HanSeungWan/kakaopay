<template>

    <v-data-table
        :headers="headers"
        :items="요청받은정보확인"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: '요청받은정보확인View',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            요청받은정보확인 : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/요청받은정보확인'))

            temp.data._embedded.요청받은정보확인.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.요청받은정보확인 = temp.data._embedded.요청받은정보확인;
        },
        methods: {
        }
    }
</script>

