

<script setup lang="ts">
import SearchByLink from "./SearchByLink.vue";
import SearchByKeywords from "./SearchByKeywords.vue";

defineProps<{
    byLink: boolean
}>();
</script>

<template>
    <section v-if="byLink">
        <SearchByLink/>
    </section>

    <section v-else>
        <SearchByKeywords/>
    </section>

</template>

<style lang="scss">
    @import "@/assets/mixins";
    @import "@/assets/base";

    .search{
        border: none;
        outline: none;
        border-radius: 20px 0 0 20px;
        background-color: var(--vt-c-divider-dark-2);
        @include fluid-text(22);
        z-index: 10;
        color:var(--vt-c-white);
        padding-inline: 17px;

        &:hover{
            scale: 1.02;
            opacity: .7;

        }

        &-button{
            border-radius: 0 20px 20px 0;
            border: none;
            font-size: 1.1rem;
            color: var(--vt-c-white);
            font-weight: 100;
            z-index: 20;
            &:hover{
                scale: 1.02;
            }
            
            background: linear-gradient(0deg, #ffffff4f -99%, #0c5accba 90%);
            cursor: pointer;
        }

        &-wrapper{
            display: grid;
            grid-template-columns: 1fr 120px;
            position: relative;
            width: clamp(200px, 60vw, 900px);
            height: 65px;
            padding: 2px;
        }
    }
    
</style>