fun main(){
    var obj1 = SubClass1();
    obj1.subMember1();
    obj1.superMethod1()
}


open class SuperClass{
    var superMember1:Int = 100;

    fun superMethod1(){
        println("SuperClass1의 메서드가 호출되었습니다.")
    }
}

//ex1
class SubClass1: SuperClass(){
    val subMember1 = 200;
    fun subMember1(){
        println("SubClass 호출 : subMember1 :${subMember1}")
    }
}

//ex2
/*
* class SubClass: SuperClass{
*   constructor: super()
* }
*
* */


open class SuperClass2(val a1:Int)

class SubClass2:SuperClass2(100){

}

class SubClass3:SuperClass2{
    constructor():super(100)
}