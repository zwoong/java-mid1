package nested.test;

public class OuterClass3 {

  public void myMethod() {
    class LocalClass {

      void hello() {
        System.out.println("LocalClass.hello");
      }
    }

    new LocalClass().hello();
  }

}
