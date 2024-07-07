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
        title: "Home",
        navClass:"home-nav",
        
    },

    {
        path: "/by-link",
        name: "По ссылке",
        title: " ByLink",
        navClass: "link-nav"
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

