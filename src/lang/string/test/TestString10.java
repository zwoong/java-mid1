package lang.string.test;

public class TestString10 {

  public static void main(String[] args) {
    String fruits = "apple,banana,mango";
    String[] splitFruits = fruits.split(",");
    for (String fruit : splitFruits) {
      System.out.println(fruit);
    }

    String joiendString = String.join("->", splitFruits);
    System.out.println("joiendString = " + joiendString);
  }

}
