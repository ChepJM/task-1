<template>
  <display-image :image-name="imageName"/>
  <br>
  <br>
  <select name="colors" v-model="imageName">
    <option value='red-product.jpg'>빨강</option>
    <option value='blue-product.jpg'>파랑</option>
    <option value='green-product.jpg'>녹색</option>
  </select>
</template>

<script setup>
import {ref} from "vue";
import DisplayImage from "@/views/DisplayImage.vue";


const imageName = ref('red-product.jpg')
</script>
<style>
body {
  background-color: #e0e7e4;
  border-radius: 5px;
  border-color: green;
}
</style>