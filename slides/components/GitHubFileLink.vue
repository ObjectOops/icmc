<script setup lang="ts">
import { computed } from 'vue'
import { useSlideContext } from '@slidev/client'

const props = defineProps({
  filePath: {
    default: "",
  },
});

const { $slidev } = useSlideContext();

const href = computed(() => {
  // @ts-expect-error
  return `${$slidev.configs.githubSnippets}/${props.filePath}`;
});

</script>

<template>
  <span><a :href="href" target="_blank" rel="noopener noreferrer"><slot></slot></a></span>
</template>
