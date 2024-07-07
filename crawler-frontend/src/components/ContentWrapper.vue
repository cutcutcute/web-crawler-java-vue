



<script setup lang="ts">

</script>

<template>
    <section class="content">
        <slot></slot>
    </section>
</template>

<style scoped lang="scss">

    @import "../assets/mixins";
    .content{
        @include flex-center;
        width: 100vw;
        position: relative;
        padding: 24px;
    }
</style>