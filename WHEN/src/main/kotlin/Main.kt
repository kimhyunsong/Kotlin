fun main(){
    val a1 = 2;

    when(a1){
        1 -> println("a1 은 1입니다.")
        2 -> println("a1 은 2입니다.")
        3 -> println("a1 은 3입니다.")
        // 같은 분기조건이 들어갈 경우 첫번째 만족하는 조건만 실행됨

        4, 5 -> println("4, 5 둘중 하나의 값입니다.")
        in 6..22-> println("6~22 사이의 값입니다.")
        else -> println("아무것도 아님")
        // 실수 비교도 가능함
    }
    var str1 = setValue(1)
    var str2 = setValue(2)
    var str3 = setValue(67567)

    println("${str1} ${str2} ${str3}")
}
fun setValue(a1: Int)= when(a1){
    1 -> "문자열 1"
    2 -> "문자열 2"
    else -> "그 외의 문자열"
}

