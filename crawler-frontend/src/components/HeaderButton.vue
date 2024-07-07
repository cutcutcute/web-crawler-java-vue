

<script setup lang="ts">
import { RouterLink } from 'vue-router';
/* __placeholder__ */
import type { NavigationElement } from '@/router/routerConsts';
defineProps<{
    rout: NavigationElement
}>()

</script>

<template>
    <RouterLink class="header-nav" :to="rout.path">
        {{rout.name}}
    </RouterLink>

</template>

<style scoped lang="scss">

    @import "../assets/parent";
    @import "../assets/mixins";

    .header-nav{
        cursor: pointer;
        font-size: 1.3rem;
        @include reset-link;

        &:hover{
            @extend %active-text;
        }
    }
</style>