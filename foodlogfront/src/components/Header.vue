<script setup lang="ts">

</script>

<template>
  <!-- 顶部导航栏 -->
  <van-sticky>
    <div class="header">
      <van-search
        shape="round"
        placeholder="搜索美食/店铺"
        background="#ffffff"
      />
      <van-icon name="user-circle-o" size="24" class="user-icon"/>
    </div>
  </van-sticky>
</template>

<style scoped>
.header {
  display: flex;
  align-items: center;
  padding: 12px;
  background: white;
}

.user-icon {
  margin-left: 15px;
}
</style>
