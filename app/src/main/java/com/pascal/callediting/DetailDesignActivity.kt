package com.pascal.callediting


import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailDesignActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_design_detail)

        val image = intent.getParcelableExtra<Design>(MainActivity.INTENT_PARCELABLE)

        val imgSrc = findViewById<ImageView>(R.id._imageDetail)
        val imgTitle = findViewById<TextView>(R.id._imageTitle)
        val imgDesc = findViewById<TextView>(R.id._imageDesc)

        imgSrc.setImageResource(image.imageSrc)
        imgTitle.text = image.imageTitle
        imgDesc.text = image.imageDesc
    }
}