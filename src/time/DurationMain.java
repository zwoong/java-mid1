package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {

  public static void main(String[] args) {
    Duration duration = Duration.ofMinutes(30);
    System.out.println("duration = " + duration);

    LocalTime localTime = LocalTime.of(1, 0);
    System.out.println("localTime = " + localTime);

    // 계산에 사용
    LocalTime plus = localTime.plus(duration);
    System.out.println("plus = " + plus);

    // 시간 차이
    LocalTime start = LocalTime.of(9, 0);
    LocalTime end = LocalTime.of(10, 0);
    Duration between = Duration.between(start, end);
    System.out.println("between = " + between);
    System.out.println("between.toHours() = " + between.toHours());

  }

}
