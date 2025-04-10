package lang.string.test;

public class TestString9 {

  public static void main(String[] args) {
    String email = "hello@example.com";

    String[] string = email.split("@");
    System.out.println("ID = " + string[0]);
    System.out.println("Domain = " + string[1]);
  }

}
