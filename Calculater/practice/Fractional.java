package Calculater.practice;
// 모든 메서드의 공통점 : this

/*
 * How to design a type (1)primitive operations to define a (data) type (set) - ADT(abstract data
 * type), where primtives = abstraction barrier (2) combinations (combinational operations) e.g)
 * add, multiply... get - 값을 받을 때, set - 값을 바꿀 때
 */
public class Fractional extends Number { // name space, 의미를 간추리기 위해서 만듦 = 연산을 붙여놓은 이름 - static
                                         // typing
    private int numerator; // numerator는 numerator를 할당받는 공간이며 선언이다.
    private int denominator;
    // private int[] rep;

    public Fractional(int numerator, int denominator) { // 이름은 같지만 다른 규칙을 가지고 있으면 이름은 상관이 없다.
        // this.rep = new int[] {numerator, denominator};
        this.numerator = numerator;
        this.denominator = denominator;
        classInvariant(); // -----------------------------------------------> 구현 과제
        normalize();
        // 기약분수가 된다.


    }

    private void classInvariant() {
        if (denominator == 0)
            throw new IllegalArgumentException("분모가 0이야!!");
        this.denominator = denominator; 
    }

    private static int gcd(int numerator, int denominator) {

        while (denominator != 0) {
            int swap = denominator;
            denominator = numerator % denominator;
            numerator = swap;
        }

        return numerator;
    }

    // small talk 공부 방식
    // move(cicle == Fractional, point(x, y))
    // cicle move: point(x, y) - message passing paradigm
    // circle.move(point(x, y)) 의미가 같다.
    private void normalize() {
        // int g = gcd(rep[0], rep[1]);
        // rep[0] = rep[0] / g;
        // rep[1] = rep[1] / g;
        int g = gcd(this.numerator, this.denominator);
        this.numerator /= g;
        this.denominator /= g;
    }

    public int getNumerator() {
        // normalize(r); // 분자
        // return rep[0];
        return this.numerator;
    }

    public int getDenominator() { // 분모
        // normalize(r);
        // return rep[1];
        return this.denominator;
    }



    public Fractional add(Fractional r) {
        return new Fractional(
                this.getNumerator() * r.getDenominator() + r.getNumerator() * this.getDenominator(),
                this.getDenominator() * r.getDenominator());
    }

    public String toString() {
        String str = this.getNumerator() + "/" + this.getDenominator();
        return str;
    }

    public boolean equals(Fractional that) {
        if (this == that)
            return true;
        if (that == null)
            return false;
        return this.getNumerator() == that.getNumerator()
                && this.getDenominator() == that.getDenominator();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.getNumerator();
        result = prime * result + this.getDenominator();
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Fractional)) // getClass -> 클래스의 타입(Fractional)
            return false;
        Fractional other = (Fractional) obj;
        return this.equals(other);
    }

    @Override
    public int intValue() {
        return (int) this.longValue();
    }

    @Override
    public long longValue() {
        // TODO Auto-generated method stub
        return (long) (this.getNumerator() / this.getDenominator());
    }

    @Override
    public float floatValue() {
        // TODO Auto-generated method stub
        return (float) (this.getNumerator() / (float) this.getDenominator());
    }

    @Override
    public double doubleValue() {
        // TODO Auto-generated method stub
        return (double) (this.getNumerator() / (double) this.getDenominator());
    }


}
