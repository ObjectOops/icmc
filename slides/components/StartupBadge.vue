<script setup lang="ts">
import { computed } from 'vue'
import { useSlideContext } from '@slidev/client'

const { $slidev } = useSlideContext();

const href = computed(() => {
  // @ts-expect-error
  return $slidev.configs.startupLink;
});

</script>

<template>
  <p><a :href="href" target="_blank" rel="noopener noreferrer"><img src="https://mybinder.org/badge_logo.svg" alt="Binder"></a></p>
</template>
