import kr.co.softcampus.pkg1.InternalClass2
import kr.co.softcampus.pkg1.PublicClass2
import kr.co.softcampus.pkg1.TestClass2

fun main(){
    val obj1 = PrivateClass1();
    val obj2 = PublicClass1();

    val obj3 = InternalClass1();
    // private class는 외부에서 사용불가
    val obj4 = PrivateClass2();
    val obj5 = PublicClass2();
    val obj6 = InternalClass2();

    val t1 = TestClass1()
    // private는 안되고 , protected는 상속관계가 아니므로 참조 불가
    println("t1.private1 : ${t1.private1}");
    println("t1.public1 : ${t1.public1}");
    println("t1.protected1 : ${t1.protected1}");
    println("t1.internal1 : ${t1.internal1}")



    val t2 = TestClass2()
    println("t2.private1 : ${t2.private2}");
    println("t2.public1 : ${t2.public2}");
    println("t2.protected1 : ${t2.protected2}");
    println("t2.internal1 : ${t2.internal2}")

}



class SubClass1:TestClass1(){
    fun subMethod1(){
        println("private1 : ${private1}");
        println("public1 : ${public1}");
        println("protected1 : ${protected1}");
        println("internal1 : ${internal1}")
    }
}


class SubClass2: TestClass2(){
    fun subMethod2(){
        // private을 제외한 모든 메서드 사용 가능
        println("private2 : ${private2}");
        println("public1 : ${public2}");
        println("protected1 : ${protected2}");
        println("internal1 : ${internal2}")
    }
}