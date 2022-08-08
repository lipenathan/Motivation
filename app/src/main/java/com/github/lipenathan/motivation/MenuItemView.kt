package com.github.lipenathan.motivation

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.lipenathan.motivation.databinding.MenuItemBinding

class MenuItemView(context: Context) : View(context) {

    private lateinit var binding: MenuItemBinding
    private lateinit var inflater: LayoutInflater

    constructor(context: Context, viewGroup: ViewGroup, text: String, activity: Activity) : this(context) {
        inflater = LayoutInflater.from(context)
        binding = MenuItemBinding.inflate(inflater, viewGroup, true)
        binding.menuText.text = text
        binding.icon.setOnClickListener {
            context.startActivity(
                Intent(context, activity::class.java)
            )
        }
    }
}