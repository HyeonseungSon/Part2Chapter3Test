package com.hyeonseungson.part2chapter3test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sum Button
        sumButton.setOnClickListener {

            val int1 = int1.text.toString().toInt()
            val int2 = int2.text.toString().toInt()



            val addLambda = {sum1:Int, sum2:Int -> sum1 + sum2}
            val result = addLambda(int1, int2)

            getOperator(result)
        }
    }

    fun getOperator (result : Int) {
        resultText.setText("결과 : $result")
    }
}