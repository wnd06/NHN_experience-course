package Calculater.practice;

public class Environment { // 이름과 값의 집합
    public static void main(String[] args) {

        int x = 4; // {(x, 4)}
        int y = 5; // {(x, 4)}.{(y,5)} = r

        y += x; // {y + x}r
        // {5 + x}r
        // {5 + 4}r
        // 9r - closer, reduction (envaluation)
        // {y = 9}r
        // r' = {(x, 4), (y, 5)} -> 시간 순서가 생기기 시작하여 위의 r과 다름
        // reduction -> closure를 이용하여 계속 최대한 줄이는 것. - evaluation
        // closer기법 공부하기 -> 코드하고의 문맥의 쌍

        {

            int z = 3; // {(z, 3)} + r'
            int y = 4; // r'' = {(z, 3), (y, 4)} + r'
            y = x; //
            // {y = 4}r''

            //evaluate(c, r) = (c', r')
        }
    }

}
