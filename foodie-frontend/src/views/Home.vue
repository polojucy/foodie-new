<template>
  <h1>{{count}}</h1>
  <button @click="increCount">click me</button>
</template>

<script lang="ts">
import { GlobalStateProps } from '@/props/props'
import { computed, defineComponent } from 'vue'
import { useStore } from 'vuex'
export default defineComponent({
  name: 'home',
  setup() {
    const store = useStore<GlobalStateProps>()
    const count = computed(() => store.state.count)
    const increCount = () => store.commit("increment")
    return {
      count,
      increCount
    }
  }
})
</script>