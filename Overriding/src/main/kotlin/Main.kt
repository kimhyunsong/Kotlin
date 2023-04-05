fun main() {
    val obj1:SubClass1 = SubClass1();

    println("obj1.subA1 : ${obj1.subA1}")
    println("obj1.SupserA1 : ${obj1.superA1}")


    val obj2:SuperClass1 = obj1;

    println(obj2.superA1);
    obj2.superMethod1()


    val obj3:SubClass2 = SubClass2();
    obj3.superMethod2();

    println("------------------------------------------------");

    val obj4 = SuperClass3()

    overridingTest(obj4);

    val obj5 = Subclass3();
    overridingTest(obj5)
}

open class SuperClass1{
    var superA1 = 100;

    fun superMethod1(){
        println("SuperClass1의 superMethod가 호출되었음")
    }
}

class SubClass1 : SuperClass1(){
    var subA1 = 200;
    fun subMethod1(){
        println("SubClass1 subMethod가 호출되었음")
    }
}


open class SuperClass2{
    open fun superMethod2(){
        println("sueprmehtod2")
    }

}

class SubClass2 : SuperClass2(){
    override fun superMethod2() {
        println("subclass2의 supermehtod2로 변경")
    }
}

open class SuperClass3 {
    open fun superMethod3(){
        println("SueprClass3의 superMethod")
    }
}

class Subclass3:SuperClass3(){
    override fun superMethod3() {
        super.superMethod3()
        println("superMethod3을 오버라이딩한 자식 클래스의 메서드")
    }
}


fun overridingTest(obj1:SuperClass3){
    obj1.superMethod3()
}