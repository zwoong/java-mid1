package nested.anonymous.ex;

public class Ex0RefMain {

  public static void main(String[] args) {
    hello("Hello Java");
    hello("Hello Spring");
  }

  public static void hello(String str) {
    System.out.println("프로그램 시작");
    System.out.println(str);
    System.out.println("프로그램 종료");
  }
}
