<script setup lang="ts">
import { computed } from 'vue'

const props = defineProps({
  ob: {
    default: null,
  },
});

const deobfuscated = computed(() => {
  const obfuscated = props.ob;
  if (!obfuscated) {
    return '';
  }
  return atob(obfuscated);
});

</script>

<template>
  <span>{{ deobfuscated }}</span>
</template>
