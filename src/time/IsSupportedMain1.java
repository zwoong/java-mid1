package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    int minute = now.get(ChronoField.SECOND_OF_MINUTE); // 지원하지않는 필드이기떄문에 오류 발생
    System.out.println("minute = " + minute);
  }

}
