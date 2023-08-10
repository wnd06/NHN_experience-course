public class 실험 implements Top{

    public static void main(String[] args) {
        Top leftTop = new Left();
        Top rightTop = new Right();
        leftTop.accept( new 걸어() );
        rightTop.accept( new  뛰어() );
      }
    
}
