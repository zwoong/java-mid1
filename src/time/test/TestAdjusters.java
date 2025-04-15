package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

  public static void main(String[] args) {
    int year = 2024;
    int month = 1;

    // 해당 월의 첫째 날
    LocalDate firstDay = LocalDate.of(year, month, 1);
    DayOfWeek firstDayOfWeek = firstDay.getDayOfWeek();

    // 해당 월의 마지막 날
    LocalDate lastDay = firstDay.with(TemporalAdjusters.lastDayOfMonth());
    DayOfWeek lastDayOfWeek = lastDay.getDayOfWeek();

    System.out.println("firstDayOfWeek = " + firstDayOfWeek);
    System.out.println("lastDayOfWeek = " + lastDayOfWeek);
  }
}
