fun main() {
    var obj = TestClass1()
    println(obj.a1);

    obj.testMethod1();
    println(obj.a4)
}



class TestClass1{
    var a1 = 100
    var a2:Int
    /* var로 선언된 변수의 초기화를 뒤로 미룰 수 있다.
        변수의 값을 사용하기 전에 반드시 초기화가 이루어져야 한다.
        val로 선언된 변수는 오류가 발생한다.
        상수는 불가능하다. (Int, double, float ...)
    */
    val a4:String by lazy {
        println("a4 init");
        "문자열2"
    }
    lateinit var a3:String
    init{
        a2 = 200;
    }


    fun testMethod1(){
        // :: = > reflection // 해당 객체를 사용하기위한 클래스
        // a3가 초기화 된적이 있는지 여부를 확인
        if (::a3.isInitialized == false){
            a3 = "문자열"
        }
        println("Obj.a3:${a3}")
    }
}

// lazy
/*
* val로 선언된 변수는 lateinit으로 지연 초기화 하는 것이 불가하다
* val로 선언된 변수는 lazy 코드 블록을 이용하면 되는데 이는 나중에 프로퍼티의 값을 셋팅해준다는 의미가 아닌 사용할 때 값을 초기화 한다는 의미를 가진다.
* */