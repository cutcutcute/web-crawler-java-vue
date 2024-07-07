<script setup lang="ts">
    
    defineProps<{
        imgPath: string,
        path: string,
        blank?: boolean
    }>();

    
</script>


<template>
    
    <a :href="path" class="card" v-if="blank" target="_blank">
        <img class="card-image" v-bind:src="imgPath"/>
    </a>

    <article v-else class="card" @click="this.$router.replace(path)" > 
        <img class="card-image" v-bind:src="imgPath"/>
    </article> 

</template>

<style scopped lang="scss">
    @import "../../assets/mixins";
    .card{
        position: relative;
        border-radius: 15px;
        background-color: var(--vt-c-divider-dark-2);
        box-shadow: 0 0 5px var(--vt-c-divider-dark-2);
        cursor: pointer;
        height: 190px;
    
        

        &:hover{
            scale: 1.04;
        }

        &-image{
            @include abs-center;
            opacity: .7;
            width:50%;
        }
    }
</style>