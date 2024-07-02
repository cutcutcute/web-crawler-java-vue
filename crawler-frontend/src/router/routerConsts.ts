import path from "path";



export interface NavigationElement{
    path: string,
    name: string,
    title: string,
    navClass: string
}

const RouterConsts: NavigationElement[] = [
    {
        path:"/",
        name: "Главная",
        title: "Link",
        navClass:"home-nav"
    },

    {
        path: "/keywords",
        name: "Ключевые слова",
        title: "Keywords",
        navClass: "keywords-nav"
    }
]

export default RouterConsts;

