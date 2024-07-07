


<script setup lang="ts">
import Card from "./Card.vue";

const devGithubURL: string = "https://github.com/cutcutcute"
</script>


<template>
    <section class="cards-wrapper">
        <Card imgPath="src/assets/icons/www-url.svg" path="/by-link"/>
        <Card imgPath="src/assets/icons/keywords.svg" path="/keywords"/>
        <Card imgPath="src/assets/icons/data.svg" path="/data"/>
        <Card imgPath="src/assets/icons/clear-cache.svg" path="/cache"/>
        <Card imgPath="src/assets/icons/settings.svg" path="/settings"/>
        <Card imgPath="src/assets/icons/github.svg" :path="devGithubURL" blank="true"/>
    </section>
</template>


<style scoped lang="scss">
    .cards-wrapper{
        display: grid;
        grid-template-columns: 1fr 1fr;
        gap: 15px;
        position: relative;

        width: clamp(300px, 44%, 500px);

    }
</style>
