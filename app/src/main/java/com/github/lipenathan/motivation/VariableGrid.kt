package com.github.lipenathan.motivation

import android.os.Bundle
import android.view.Gravity.*
import android.widget.LinearLayout
import android.widget.LinearLayout.HORIZONTAL
import androidx.appcompat.app.AppCompatActivity
import com.github.lipenathan.motivation.databinding.ActivityVariableGridBinding
import java.util.*

class VariableGrid : AppCompatActivity() {

    private lateinit var binding: ActivityVariableGridBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVariableGridBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setMenu()
    }

    private fun setMenu() {

        val items = listOf(MenuItem.MENU1, MenuItem.MENU2, MenuItem.MENU3, MenuItem.MENU4, MenuItem.MENU5,
            MenuItem.MENU6, MenuItem.MENU7, MenuItem.MENU1, MenuItem.MENU2, MenuItem.MENU3)
        setAllMenuItems(items)
    }

    private fun setAllMenuItems(menuItems: List<MenuItem>) {
        val size = menuItems.count()
        val rows: Int  = if (size % 4 != 0) (size/4) + 1 else size/4
        val queue = enqueue(menuItems)
        for (i in 1..rows) {
            val row = LinearLayout(this)
            row.orientation = HORIZONTAL
            row.gravity = START
            for (j in 1..4){
                val item = queue.poll()
                if (item != null) {
                    val menu = MenuItemView(this, row)
                    menu.setActivity(item.activity)
                    menu.setText(item.text)
                }
            }
            binding.mainView.addView(row)
        }
    }

    private fun enqueue(menuItems: List<MenuItem>): LinkedList<MenuItem> {
        val queue = LinkedList<MenuItem>()
        menuItems.forEach {
         queue.add(it)
        }
        return queue
    }
}