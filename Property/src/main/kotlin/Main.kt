fun main() {
    val obj1 = TestClass1(100, 200);
    println("obj1.a1 : ${obj1.a1}")
    println("obj1.a2 : ${obj1.a2}")
    obj1.a1 = 3000;
    println("obj1.a1 : ${obj1.a1}")

    println("====================================")


    val obj2 = TestClass2();
    obj2.v3 = 80000;
    println(obj2.v3);
}



class TestClass1 (var a1:Int, val a2:Int){
    constructor(a1:Int, a2:Int, a3:Int) : this(a1, a2)
}
class TestClass2{
    var v1:Int = 0;
    val v2:Int = 0;
    var v3:Int = 100
        //get() = field // field == v3
        get(){
            println("get 호출")
            return field
        }
        set(value){
            println("set 호출")
            field = value
        }

}