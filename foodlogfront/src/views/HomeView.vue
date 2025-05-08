<script setup lang="ts">
import { ref } from 'vue';
import Header from "@/components/Header.vue";

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
    shopName: '真搞不懂GitHub',
    dishName: '招牌牛肉面',
    description: '汤头鲜美，牛肉大块软嫩，面条Q弹有嚼劲～',
    tags: ['牛肉面', '性价比高', '网红店']
  },

]);
</script>

<template>
  <Header/>
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

</template>

<style scoped>
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

.food-image {
  width: 100%;
  height: 100%;
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
</style>
