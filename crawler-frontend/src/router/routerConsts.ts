import path from "path";
import type { VueElement } from "vue";


export interface NavigationElement{
    path: string,
    name: string,
    title: string,
    navClass: string,

}

const RouterConsts: NavigationElement[] = [
    {
        path:"/",
        name: "Главная",
        title: "Link",
        navClass:"home-nav",
        
    },

    {
        path: "/keywords",
        name: "Ключевые слова",
        title: "Keywords",
        navClass: "keywords-nav"
    },
    {
        path: "/data",
        name: "Данные",
        title: "Data",
        navClass: "data-nav"

    }
]

export default RouterConsts;

