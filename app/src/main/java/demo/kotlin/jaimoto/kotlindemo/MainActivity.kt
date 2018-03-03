package demo.kotlin.jaimoto.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

/**
 * Ejemplo de app de Android Kotlin Beginner Tutorial (Google I/O '17)
 * https://www.youtube.com/watch?v=sZWMPYIkNd8
 */
class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Poke","Home Burguer","Teriyaki","Da Quei Matti","KFC","McDonalds","Panacleta","Tostao","A Cocinar!!! ")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. referenciar los elementos del layout sin usar el findByID


        decideButton.setOnClickListener {
            println("click en buton")
            var random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList.elementAt(randomFood)
        }

        addFoodBtn.setOnClickListener{
            foodList.add(textDecide.text.toString())
            textDecide.text.clear()
        }



    }
}
