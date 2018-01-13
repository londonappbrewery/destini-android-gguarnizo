package com.londonappbrewery.destini

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Inicializar variables
    var top: Int = arbol[0].top_op
    var bott: Int = arbol[0].bott_op

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Vista inicial
        storyTextView.setText(arbol[0].story)
        buttonTop.setText(arbol[0].answ_top)
        buttonBottom.setText(arbol[0].answ_bott)

        // Eventos de los botones:
        buttonTop.setOnClickListener(){
            updateChapter(top)
        }
        buttonBottom.setOnClickListener(){
            updateChapter(bott)
        }
    }

    fun updateChapter(index: Int){
        top = arbol[index-1].top_op
        bott = arbol[index-1].bott_op
        storyTextView.setText(arbol[index-1].story)

        if( top == -1 || bott == -1){
            buttonTop.visibility = View.GONE
            buttonBottom.visibility = View.GONE
        } else {
            buttonTop.setText(arbol[index-1].answ_top)
            buttonBottom.setText(arbol[index-1].answ_bott)
        }
    }
}