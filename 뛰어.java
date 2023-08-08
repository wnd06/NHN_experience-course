
public class 뛰어 implements Visitor{
    public void visit(Left left) { System.out.println("왼쪽으로 뛰어");};
    public void visit(Right right) { System.out.println("오른쪽으로 뛰어");}
}
