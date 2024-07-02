

<script setup lang="ts">
import NavigationElement from "../router/routerConsts"
defineProps<{
    rout: NavigationElement
}>()

</script>

<template>
    <nav class="s" >
        {{rout.name}}
    </nav>

</template>