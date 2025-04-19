<template>
  <!-- 首页 -->
  <div class="app-container">
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

    <!-- 内容卡片 -->
    <div class="content-list">
      <div v-for="(item, index) in foodList" :key="index" class="card">
        <!-- 菜品图片 -->
        <van-image
            class="food-image"
            :src="item.image"
            fit="cover"
            position="top"
            radius="8"
        />

        <!-- 交互按钮 -->
        <div class="action-buttons">
          <van-icon name="like-o" size="24"/>
          <van-icon name="star-o" size="24"/>
          <van-icon name="comment-o" size="24"/>
        </div>

        <!-- 内容描述 -->
        <div class="content">
          <h3 class="shop-name">{{ item.shopName }}</h3>
          <p class="dish-name">{{ item.dishName }}</p>
          <p class="description">{{ item.description }}</p>
          <div class="tags">
            <van-tag
                v-for="(tag, i) in item.tags"
                :key="i"
                type="primary"
                size="medium"
            >
              {{ tag }}
            </van-tag>
          </div>
        </div>
      </div>
    </div>

    <!-- 底部导航 -->
    <van-tabbar route>
      <van-tabbar-item icon="home-o">首页</van-tabbar-item>
      <van-tabbar-item icon="home-o">点餐</van-tabbar-item>
      <van-tabbar-item icon="add" @click="showUpload = true"/>
      <van-tabbar-item icon="home-o">记录</van-tabbar-item>
      <van-tabbar-item icon="user-o">我的</van-tabbar-item>
    </van-tabbar>

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
          <van-rate v-model="rating" />
        </van-cell-group>
        <van-button type="primary" block>发布</van-button>
      </div>
    </van-popup>
  </div>
</template>

<script setup>
import { ref } from 'vue';

const showUpload = ref(false);
const fileList = ref([]);
const shopName = ref('');
const dishName = ref('');
const description = ref('');
const rating = ref(3);

const foodList = ref([
  {
    image: 'https://yefeng-1308017062.cos.ap-guangzhou.myqcloud.com/generator_picture/1777702612496613378/cSePXgAU-1712061208890.jpg',
    shopName: '幸福小馆',
    dishName: '招牌牛肉面',
    description: '汤头鲜美，牛肉大块软嫩，面条Q弹有嚼劲～',
    tags: ['牛肉面', '性价比高', '网红店']
  },
  {
    image: 'https://yefeng-1308017062.cos.ap-guangzhou.myqcloud.com//generator_picture/1777702612496613378/dEOxtB6F-《HeartCatch光之美少女》暗之美少女、月影百合4k壁纸.jpg',
    shopName: '幸福小馆',
    dishName: '招牌牛肉面',
    description: '汤头鲜美，牛肉大块软嫩，面条Q弹有嚼劲～',
    tags: ['牛肉面', '性价比高', '网红店']
  },
  // 更多数据...
]);
</script>

<style scoped>
.app-container {
  max-width: 500px;
  margin: 0 auto;
  background: #f5f5f5;
  min-height: 100vh;
}

.header {
  display: flex;
  align-items: center;
  padding: 12px;
  background: white;
}

.user-icon {
  margin-left: 15px;
}

.content-list {
  margin-bottom: 30px;
  padding: 12px;
}

.card {
  background: white;
  border-radius: 12px;
  margin-bottom: 12px;
  padding: 12px;
  box-shadow: 0 2px 8px rgba(0,0,0,0.05);
}

.user-info {
  display: flex;
  align-items: center;
  margin-bottom: 12px;
}

.username {
  margin-left: 8px;
  font-size: 14px;
  font-weight: 500;
}

.food-image {
  width: 100%;
  height: 300px;
  border-radius: 8px;
}

.action-buttons {
  display: flex;
  gap: 16px;
  padding: 12px 0;
}

.shop-name {
  margin: 8px 0;
  font-size: 16px;
  color: #333;
}

.dish-name {
  color: #666;
  font-size: 14px;
  margin-bottom: 8px;
}

.description {
  font-size: 14px;
  color: #333;
  line-height: 1.5;
}

.tags {
  margin-top: 8px;
  display: flex;
  gap: 8px;
  flex-wrap: wrap;
}

.upload-panel {
  padding: 20px;
}
</style>
