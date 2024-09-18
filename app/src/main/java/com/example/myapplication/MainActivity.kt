package com.example.myapplication

import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
        val linearLayout = LinearLayout(this)
        linearLayout.orientation = LinearLayout.VERTICAL
        linearLayout.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )

        val edit: EditText = EditText(this)
        edit.setText("Бирюков Марк ПИ-231")

        val img = ImageView(this)
        img.setImageResource(R.mipmap.ic_launcher_round)

        val textView1 = TextView(this)
        textView1.text = "Бирюков Марк ПИ-231"
        textView1.textSize = 18f

        val btn = Button(this).apply {
            text = "ОК"
        }
        btn.setOnClickListener {
            textView1.text = edit.text
        }

        val textView2 = TextView(this)
        textView2.text = "Если б мишки были пчелами,\n" +
                "То они бы нипочём\n" +
                "Никогда и не подумали\n" +
                "Так высоко строить дом!\n"
        textView2.textSize = 18f

        val textView3 = TextView(this)
        textView3.text = getString(R.string.bears)
        textView3.textSize = 18f

        linearLayout.addView(edit)
        linearLayout.addView(img)
        linearLayout.addView(btn)
        linearLayout.addView(textView1)
        linearLayout.addView(textView2)
        linearLayout.addView(textView3)

        setContentView(linearLayout)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}