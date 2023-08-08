
public class 걸어 implements Visitor{
    public void visit(Left left) { System.out.println("왼쪽으로 걸어");};
    public void visit(Right right) { System.out.println("오른쪽으로 걸어");}
}
