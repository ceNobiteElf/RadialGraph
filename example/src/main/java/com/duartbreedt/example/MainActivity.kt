package com.duartbreedt.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.duartbreedt.radialgraph.model.Data
import com.duartbreedt.radialgraph.model.Section
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        val sections = mutableListOf(
            Section(
                Section.DisplayMode.PERCENT,
                BigDecimal("10"),
                ContextCompat.getColor(this, R.color.red)
            ),
            Section(
                Section.DisplayMode.VALUE,
                BigDecimal("10"),
                ContextCompat.getColor(this, R.color.blue)
            ),
            Section(
                BigDecimal("10"),
                ContextCompat.getColor(this, R.color.yellow)
            ),
            Section(
                "STAB",
                BigDecimal("10"),
                ContextCompat.getColor(this, R.color.green)
            )
        )

        graph_layout.draw(Data(sections, BigDecimal("50")))
    }
}
