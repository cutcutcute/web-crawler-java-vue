<script setup lang="ts">
    import { store } from '@/store/store';
    import { ref } from 'vue';

    const word = ref<string>("")
    const inputField = ref<HTMLInputElement | null>(null);


    const addWord = () => {
        
        if (word.value.length > 0){
            store.addKeyword(word.value);
            word.value = "";
            inputField.value !==null?inputField.value.focus():console.warn("ref not found");
        } else {
            console.warn("Empty input area");
        }
        
    }

</script>

<template>
    <section @keyup.del="store.clearKeywords()" class="search-wrapper">
        <input type="text" @keyup.enter="addWord()" ref="inputField" v-model="word" class="search" placeholder="Введите тег"/>
        <button @click="addWord()" class="search-button">Добавить</button>
    </section>
    <section class="keywords-wrapper">
        <div @click="store.removeKeyword(word)" v-for="word in store.keywordsList" class="keywords-item">
            <div  class="keywords-item__text">{{word}}</div>
        </div>  
    </section>
    <section @click="store.clearKeywords()" class="search-clear" v-if="store.keywordsList.length>0">
        Удалить все поля (Клавиша Del)
    </section>
    <section class="start-search">
        <button :disabled="store.keywordsList.length <= 0">Запустить</button>
    </section>
</template>

<style scopped lang="scss">
    
    @import "@/assets/mixins";

    .search-clear{
        text-align: center;
        padding: 15px;
        cursor: pointer;
        opacity: .6;
        @include fluid-text(17);

        &:hover{
            opacity: .9;
            scale: 1.01;
        }

    }
    
    .keywords-wrapper{
        padding: 13px 3px;
        display: flex;
        flex-wrap: wrap;
        width: clamp(200px, 60vw, 900px);
        gap:6px;
        
    }

    .keywords-item{
        position: relative;
        padding: 5px 10px;
        background-color: var(--vt-c-divider-dark-2);
        border-radius: 25px;
        font-size: 18px;
        color: var(--vt-c-white);
        cursor: pointer;
        opacity: .7;
        outline: none;
        border: none;


        &::after{
                content: " ";
                position: absolute;
                aspect-ratio: 1/1;
                right: 5px;
                box-sizing: content-box;
                top:5px;
                bottom: 5px;
                margin-left: 9px;
                background-image: url("@/assets/icons/close.svg");
                background-size: contain;
                background-repeat: no-repeat;
                opacity: .1;

               

        }
        &__text{
            position: relative;
            margin-right: 30px;
           
                
            
        }

        &:hover{
            scale: 1.02;
            opacity: 1;

            &::after{
                opacity: .6;
            }
        
        }
    }

    .start-search{

        position: relative;
        &>button{
            width: 100%;
            height: 40px;
            border: none;
            border-radius: 15px;
            cursor: pointer;
        }
    }
</style>