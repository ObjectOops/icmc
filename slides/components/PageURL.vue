<script setup lang="ts">
import { computed } from 'vue'

const href = computed(() => {
  const { origin, pathname } = window.location;
  const parts = pathname.replace(/\/$/, '').split('/');
  if (parts.length > 1) {
    parts.pop();
  }
  const newPath = parts.join('/');
  return origin + newPath;
});

const display = computed(() => {
  const url = href.value;
  return url.replace(/^https?:\/\//, '');
});
</script>

<template>
  <a :href="href">{{ display }}</a>
</template>
