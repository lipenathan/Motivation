package com.github.lipenathan.motivation

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.lipenathan.motivation.databinding.MenuItemBinding

class MenuItemView(context: Context) : View(context) {

    private var binding: MenuItemBinding
    private var inflater : LayoutInflater

    constructor(context: Context, viewGroup: ViewGroup) : this(context) {
        inflater = LayoutInflater.from(context)
        binding = MenuItemBinding.inflate(inflater)
        inflater.inflate(R.layout.menu_item, viewGroup)
    }

    init {
        inflater = LayoutInflater.from(context)
        binding = MenuItemBinding.inflate(inflater)
    }

    fun setActivity(activity: Activity) {
        binding.icon.setOnClickListener {
            context.startActivity(
                Intent(context, activity::class.java)
            )
        }
    }

    fun setText(text: String) {
        binding.menuText.text = text
    }
}