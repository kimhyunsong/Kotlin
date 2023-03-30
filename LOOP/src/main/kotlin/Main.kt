fun main(){
    /*
    for (i in 1..6){
        println(i)
    }

    for (i in a1){
        println(i)
        if (i ==7)break
    }
    */
    val a1 = 1..10;
    for (i in a1 step 2){
        println(i)
        if (i ==7)break
    }


    val a3  = 10 downTo 1
    for (i in a3){
        println(i)
    }



}