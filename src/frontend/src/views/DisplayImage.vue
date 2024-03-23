<template>
  <h1>Select product color</h1>
  <img :src="getImageUrl(imageName)" alt="Image" style="width: 300px; height: auto;">
</template>

<script setup>
import {defineProps} from "vue";

/** Props */
const props = defineProps(['imageName'])

/** Functions */
function getImageUrl() {
  return `/api/${props.imageName}`;
}
</script>

<style scoped>

</style>
