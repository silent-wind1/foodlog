<script setup lang="ts">
import {ref} from "vue";

const showUpload = ref(false);
const fileList = ref([]);
const shopName = ref('');
const dishName = ref('');
const description = ref('');
const rating = ref(3);
</script>

<template>
  <div class="wrapper">
    <!-- 发布浮层 -->
    <van-popup v-model:show="showUpload" round position="bottom">
      <div class="upload-panel">
        <van-uploader
          v-model="fileList"
          multiple
          :max-count="9"
          upload-text="添加美食照片"
        />
        <van-cell-group inset>
          <van-field
            v-model="shopName"
            label="店铺名称"
            placeholder="请输入店铺名称"
          />
          <van-field
            v-model="dishName"
            label="菜品名称"
            placeholder="请输入菜品名称"
          />
          <van-field
            v-model="description"
            rows="3"
            autosize
            label="评价"
            type="textarea"
            placeholder="写下你的用餐体验"
          />
          <van-rate v-model="rating"/>
        </van-cell-group>
        <van-button type="primary" block>发布</van-button>
      </div>
    </van-popup>

    <!--  底层路由  -->
    <van-tabbar class="van-tabbar" route>
      <van-tabbar-item
        icon="home-o"
        to="/home"
        replace
      >
        首页
      </van-tabbar-item>

      <van-tabbar-item
        icon="add"
        @click="showUpload = true"
      />

      <van-tabbar-item
        icon="user-o"
        to="/user"
        replace
      >
        我的
      </van-tabbar-item>
    </van-tabbar>
  </div>
</template>

<style scoped>
/* 自定义激活状态颜色 */
:deep(.van-tabbar-item--active) {
  color: #07c160 !important;
  --van-tabbar-item-active-color: #07c160;
}

/* 覆盖图标颜色 */
:deep(.van-tabbar-item__icon .van-icon) {
  color: inherit;
}

/* 默认状态颜色 */
:deep(.van-tabbar-item) {
  color: #666;
}

.upload-panel {
  padding: 20px;
}
</style>
