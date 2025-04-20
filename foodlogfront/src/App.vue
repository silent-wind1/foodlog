<script setup lang="ts">
import {RouterLink, RouterView} from 'vue-router'
import Header from "@/components/Header.vue";
import Footer from "@/components/Footer.vue";

</script>

<template>
  <div class="app-container">
    <Header/>
    <RouterView/>
    <Footer/>
  </div>
</template>

<style scoped>
.app-container {
  max-width: 500px;
  margin: 0 auto;
  background: #f5f5f5;
  min-height: 100vh;
}
</style>
