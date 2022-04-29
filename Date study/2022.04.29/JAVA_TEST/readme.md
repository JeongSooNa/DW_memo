1. 메소드 리턴,이름,파라미터 타입 작성.

```java
    public int getCount(List<Object> list){
        return 0;
    }
    //리턴 타입 : int
    //메소드 이름: getCount
    //파라미터 타입 : List<Object>
```

2. 메소드 리턴,이름,파라미터 타입 작성.

```java
    public void insertData(Map<String, Object> map){

    }
    //리턴 타입 : 없음(void)
    //메소드 이름: insertData
    //파라미터 타입 : Map<String, Object>
```

3. 메소드 리턴,이름,파라미터 타입 작성.

```java
    public List<Object> list insertData(String str){
        return null;
    }
    //리턴 타입 : List<Object>
    //메소드 이름: insetData
    //파라미터 타입 : String
```

4. 오버라이딩(Overriding)과 오버로딩(Overloading)이 무엇인지 간략히 기술하시오.
```
오버라이딩과 오버로딩 모두 객체지향 언어의 특징으로
오버로딩은 메소드이름은 같으나 파라미터의 데이터타입, 갯수 등을 다르게 하여
동일한 이름의 메소드를 여러번 사용하기 위해 사용하고,
오버라이딩은 메소드이름, 파라미터의 데이터타입, 갯수 등이 모두 동일하고 부모 클래스에서 선언된 메소드를
자식 클래스에서 재정의 하기위해 사용된다.
```

5. 추상클래스와 Interface(인터페이스)에 차이점을 간략히 기술하시오.
```
Interface는 추상메소드, 변수만 존재하며 구현하지 않고 선언만 한다.
다중상속을 구현할 수 있고, 인스턴스화(new)할 수 없다.
implements 라는 키워드로 Interface를 가져와 Method를 사용한다.
오버라이딩을 무조건(필수) 해야한다.

추상 class는 앞에 abstract 키워드가 붙는다.
public 이어야 하고, 마찬가지로 다중상속을 목적으로 사용하나 오버라이딩을
무조건 할 필요는 없다.
```
6. 상속에 대해 아는 내용을 간략히 기술하시오.
```
자식클래스에 extends 부모클래스 하여 상속하며
상속받은 자식클래스는 부모클래스의 메소드, 필드변수를 인스턴스화 하지 않아도
사용할 수 있다. 모든 클래스의 부모 클래스는 Object(최상위 class)이다.
```
7. 생성자에 대해 아는 내용을 간략히 기술하시오.
```
생성자란 다른 클래스에서 필드변수, 메소드 등을 사용하기 위해 선언.
클래스이름과 동일한 이름을 갖는다.
생성자를 따로 작성하지 않아도 디폴트생성자가 존재하지만,
파라미터를 받는 생성자를 임의로 만들게 되면 디폴트생성자를 따로 지정해 주어야 한다.
```
8. 컬렉션에 대해 아는 내용을 간략히 서술하시오.
```
컬렉션은 JAVA에서 제공되는 class를 사용하는 것으로 주로 배열에 많이 사용된다.
List, ArrayList, Map, HashMap 등이 있으며 import를 통해 선언하여 사용하고,
기존 배열에 비해 수정, 삭제 등이 용이한 장점이 있다.
```
9. 아래 코드를 보고 예상되는 결과는?

```java
    class A{

        public static int count;
        public int temp;

    }
    class B{

        main(){

            A a1 = new A();
            a1.count = 10;
            a1.temp = 20;

            A a2 = new A();
            a2.count = 20;
            a2.temp = 20;

            System.out.println(a1.count); // 답 : 20
            // a1.count는 10으로 정의되었으나 static 벼수이기 때문에
            // a2에서 다시 20으로 정의된 것이 공유되어 20!
            System.out.println(a1.temp); // 답 : 20

            System.out.println(a2.count); // 답 : 20
            System.out.println(a2.temp); // 답 : 20
        }
    }

```

10. 아래 코드를 보고 예상되는 결과는?

```java
    class A{
        public int money;
    }
    class B{
        public A getInstance(){
            A a = new A();
            return a;
        }
    }
    class C{
        main(){
            B b = new B();
            A a = b.getInstance();
            a.money = 1000;
            a = b.getInstance();
            a.money = a.money + 1000;
            System.out.println(a.money); // 답 : 1000
            // a.money가 1000으로 선언되었으나
            // a = b.getInstance(); 에서 a가 new A()로 다시 초기화 되서.
        }
    }
```

11. getter, setter을 이용하지 않고 필드변수 값을 초기화 하는 방법을 아래 코드로 작성하시오.

```java
class A{
    private String name;
    private int age;

    public A(String name, int age){
        this.name = name;
        this.age = age;
    }
    // 생성자를 이용한다.
}
```