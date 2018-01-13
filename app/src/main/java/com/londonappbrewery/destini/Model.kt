package com.londonappbrewery.destini

/**
 * Created by Giancarlo G on 12/01/2018.
 */

data class  Nodo (val story:Int, val top_op: Int, val bott_op:Int, val answ_top: Int = -1, val answ_bott: Int = -1)

val arbol : Array<Nodo> = arrayOf(
        Nodo(R.string.T1_Story,3,2,R.string.T1_Ans1,R.string.T1_Ans2),
        Nodo(R.string.T2_Story,3,4,R.string.T2_Ans1,R.string.T2_Ans2),
        Nodo(R.string.T3_Story,6,5,R.string.T3_Ans1,R.string.T3_Ans2),
        Nodo(R.string.T4_End,-1,-1),
        Nodo(R.string.T5_End,-1,-1),
        Nodo(R.string.T6_End,-1,-1)
)
