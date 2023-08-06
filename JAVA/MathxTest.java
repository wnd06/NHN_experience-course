package JAVA;

import Calculater.practice.RangeTest;

public class MathxTest {
    public static void main(String[] args) {
        MathxTest.AddTest();
        MathxTest.RangeTest();
    }

    private static void RangeTest() {
        TestRange.classInveriant();
    }

    private static void AddTest() {
        AddTest.postCondition();
        AddTest.preCondition();
        AddTest.recursionCase();
        AddTest.classInveriant();
        
    }
}
