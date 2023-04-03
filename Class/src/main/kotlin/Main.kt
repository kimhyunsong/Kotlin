fun main(){
    val obj1:TestClass1 = TestClass1();
    println("obj1: $obj1" )
    val obj2:TestClass1 = TestClass1();
    println("obj1: $obj2" )

    val obj5 = TestClass3()
    println("obj5.a1 ${obj5.a1}")

    obj5.a2 = 200;
    println("obj5.a2${obj5.a2}")
    obj5.testMethod2();
    obj5.testMethod1();

    println("======================================")

    val obj6 = TestClass4();
    println("obj6: $obj6")
    println("obj6.v1: ${obj6.v1}")
    println("obj6.v2: ${obj6.v2}")

    val obj7 = TestClass4(6, 8);
    println("obj7: $obj7")
    println("obj7.v1: ${obj7.v1}")
    println("obj7.v2: ${obj7.v2}")


    println("==========================================")

    var obj8 = TestClass5(3, 6);
    println(obj8.a1 +  obj8.a2);


    println("==========================================")

    var obj9 = TestClass6(100);

}

class TestClass1{
    init {
        println("객체가 생성되면 자동으로 동작되는 부분입니다.")
    }
}

class TestClass3{
    // 멤버변수
    val a1 = 0;
    var a2 = 0;
    // method

    fun testMethod1():Int{
        println("test Method1");
        return 23
    }
    fun testMethod2(){
        println("test Method2");
    }
}


// 생성자

class TestClass4{
    var v1:Int =0;
    var v2:Int = 0;
    constructor(){
        println("매개변수가 없는 생성자")
    }
    constructor(a1:Int, a2:Int){
        println("매개변수가 두 개인 생성자")
        v1 = a1;
        v2 = a2;
    }
}

// 기본생성자의 매개변수는 해당 클래스의 멤버변수로 자동 등록된다.

class TestClass5 constructor(var a1:Int, var a2:Int){

}

// 객체 생성시 주 생성자가 먼저 실행 된 후 init 코드가 실행된다.

class TestClass6 (var a1:Int?, val a2:Int){
    init {
        println("코드 수행");
    }

    // 보조생성자
    constructor(a1:Int):this(a1, 100){
        println("보조생성자 호출")
    }
}