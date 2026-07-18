<script setup lang="ts">
import { computed } from 'vue'
import { useSlideContext } from '@slidev/client'

const { $slidev } = useSlideContext();

const href = computed(() => {
  // @ts-expect-error
  return $slidev.configs.startupLink;
});

const href_colab = computed(() => {
  // @ts-expect-error
  return $slidev.configs.startupColabLink;
});

</script>

<template>
  <p class="badges">
    <a :href="href" target="_blank" rel="noopener noreferrer"><img src="https://mybinder.org/badge_logo.svg" alt="Binder"></a>
    <a :href="href_colab" target="_blank" rel="noopener noreferrer"><img src="https://colab.research.google.com/assets/colab-badge.svg" alt="Colab"></a>
  </p>
</template>


<style scoped>
.badges {
  display: flex;
  flex-direction: row;
  gap: 8px;
}
</style>
