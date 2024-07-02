<script setup lang="ts">
    import {ref} from "vue";
    import RouterConsts from "../router/routerConsts";
    import HeaderButton from "./HeaderButton.vue";

    const isLightTheme = ref(false)
</script>

<template>
    <header :class="{light: isLightTheme}">
        <nav v-for="rout in RouterConsts">
            <HeaderButton :rout="rout" />
        </nav>    
    </header>

</template>

<style scoped lang="scss">
    header{
        height: 90px;
        background-color:var(--vt-c-divider-dark-2)

    }

</style>