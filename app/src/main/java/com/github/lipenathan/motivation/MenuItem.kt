package com.github.lipenathan.motivation

import android.app.Activity

enum class MenuItem() {

    MENU1("Menu 1", MainActivity()), MENU2("Menu 2", MainActivity()), 
    MENU3("Menu 3", MainActivity()), MENU4("Menu 4", MainActivity()), 
    MENU5("Menu 5", MainActivity()), MENU6("Menu 6", MainActivity()), 
    MENU7("Menu 7", MainActivity());
    
    lateinit var text: String
    lateinit var activity: Activity

    constructor(text: String, activity: Activity): this() {
        this.text = text
        this.activity = activity
    }
}