package Calculater.practice;

// 인터페이스는 지켜할 조건을 작성한다
// 하나만 존재해야 한다.
// 제네릭 코드가 나오면 이 코드는 실행하는 코드가 아니다. 
@FunctionalInterface
public interface BinaryOperation<T extends Number> { //Number의 타입만 사용할 수 있다.
    public T apply(T x, T y);
}

// class Stack<T> { //타입을 파라미터로 보내기 -> 어떠한 타입 클래스에 보낼 때 필요하다
//     public stack() {}
//     public Stack push(T newElem) {}
//     public Stack pop() {}
//     public T top() {}

    public static void main(String[] args) {
        int x = 4;
        Integer y = new Integer(4); //4가 들어있는 메모리 주소
        String s = new String("");
        Object o = s;
        String s2 = (String) o;
        System.out.println(s == o);
    }
}

