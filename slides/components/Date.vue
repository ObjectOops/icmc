<script setup lang="ts">
import { computed } from 'vue'

const date = computed(() => {
  const date = new Date();
  const month = date.toLocaleString('default', { month: 'long' });
  const day = date.getDate();
  return `${month} ${day}`;
});

</script>

<template>
  <span>{{ date }}</span>
</template>
