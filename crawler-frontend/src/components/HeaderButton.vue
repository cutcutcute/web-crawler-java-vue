

<script setup lang="ts">
import { RouterLink } from 'vue-router';
/* __placeholder__ */
import type { NavigationElement } from '@/router/routerConsts';
defineProps<{
    rout: NavigationElement
}>()

</script>

<template>
    <RouterLink class="header-nav" :to="rout.path" exact-active-class="active">
        {{rout.name}}
    </RouterLink>

</template>

<style scoped lang="scss">

    @import "../assets/parent";
    @import "../assets/mixins";

    .header-nav{
        cursor: pointer;
        @include fluid-text(22);
        @include reset-link;

        &:hover{
            @extend %active-text;
        }
    }
</style>