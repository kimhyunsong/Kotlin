/*
* Priavte : 외부에서 객체를 생성할 수 없다.
* Public : 외부에서 객체를 생성할 수 있다.(기본)
* protected : 클래스에 지정할 수 없다.
* internal : 같은 모듈일 경우만 객체를 생성할 수 있다.
* */


/*
* private : 외부에서 접근할 수 없다.
* public : 외부에서 접근이 자유롭다(기본)
* protected 상속관계일 경우에만 접근이 가능하다.
* internal : 같은 모듈일 경우에만 접근이 가능하다.
* */
private class PrivateClass1
public class PublicClass1
// 클래스에는 protected를 붙일 수 없음
protected class ProtedctedClass1
internal class InternalClass1


open class TestClass1{
    private val private1 = 100
    public val public1 = 200
    protected val protected1 = 300
    internal val internal1 = 400
}