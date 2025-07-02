<script setup lang="ts">
import { computed } from 'vue'
import { useSlideContext } from '@slidev/client'

const props = defineProps({
  offset: {
    default: 0,
  },
});

const { $slidev } = useSlideContext();

const baseDate = computed(() => {
  // Expecting `headmatter.date` to be a string like '2025-07-01'.
  // @ts-expect-error
  return $slidev.configs.date // @ts-expect-error
    ? new Date(`${$slidev.configs.date}:00:00.000${$slidev.configs.timezone}`) 
    : null;
});

const displayDate = computed(() => {
  if (!baseDate.value) {
    return '';
  }
  const date = new Date(baseDate.value);
  date.setDate(date.getDate() + Number(props.offset));
  const month = date.toLocaleString('default', { month: 'long' });
  const day = date.getDate();
  return `${month} ${day}`;
});

</script>

<template>
  <span>{{ displayDate }}</span>
</template>
