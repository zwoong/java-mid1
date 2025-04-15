package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain {

  interface Strategy {

    void run();
  }

  public static void hello(Strategy strategy) {
    System.out.println("프로그램 시작");
    strategy.run(); // 핵심 코드 조각 실행
    System.out.println("프로그램 종료");
  }

  public static void main(String[] args) {
    hello(() -> {
      int randomValue = new Random().nextInt(6) + 1;
      System.out.println("randomValue = " + randomValue);
    });

    hello(() -> {
      for (int i = 0; i < 3; i++) {
        System.out.println("i = " + i);
      }
    });
  }
}
