import { reactive } from "vue";


export const store = reactive({
    keywordsList: [] as Array<string>,

    addKeyword(keyword: string){
        this.keywordsList.push(keyword);
    },

    removeKeyword(keyword: string){
        this.keywordsList = this.keywordsList.filter(word => word !== keyword);
    },

    clearKeywords(){
        this.keywordsList = [];
    }
})