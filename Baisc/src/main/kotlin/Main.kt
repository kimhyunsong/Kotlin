fun main() {
    /*
    print("문자열 입니다.")
    println("문자열 입니다.")
    println("문자열 입니다.")


    println("값 : ${1000}")
    println(10000_00000_0000);

    print(12312.214)
    // Raw String
    println("""가나다라 마바사
        | dsfsdf\nㄹㄴ어
        | ㅏ룸ㄴ아ㅓ루""".trimMargin())




    val a1:Int = 100;
    println("a1 : ${a1}");

    val a2 = 200
    println("a2 : $a2")

    var a3:String? = "test";
    println("a3 : $a3")
    a3 = "qdqwd";
    //a2 = 399;
    var a6:Int? = null;
    // null Exception 처리 ( null을 허용하는 변수와 허용하지 않는 변수를 제공함 )
    var a8:Int = a6!!;

    */


    test1()
    test2(12890, 120.3030)
    test2(a2 = 48.25, a1 = 123)
    test5(1, 4);

    val a1:Int = 10;
    val a2:Int = -10;
    val r1:Int = +a1;
    val r2:Int = -a2;

    println("a1 : $a1, r1: $r1")
    println("a2: $a2, r2: $r2")


    val r16:IntRange = 10..20;
    println(r16); // 10..20 으로 화면상에만 출력됨

}
fun test1(){
    println("qwdfqwdf");
}

fun test2(a1: Int, a2: Double){
    println("test2가 호출되었습니다.")
    println("a1 : $a1");
    println("a2 : $a2");
}


fun test5(a1:Int, a2: Int): Unit{
    println("반환값 없음")
}
// 함수 오버로딩 가능함
