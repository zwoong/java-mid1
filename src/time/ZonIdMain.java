package time;

import java.time.ZoneId;

public class ZonIdMain {

  public static void main(String[] args) {
    for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
      ZoneId zoneId = ZoneId.of(availableZoneId);
      System.out.println("zoneId = " + zoneId);
      System.out.println("zoneId.getRules() = " + zoneId.getRules());
    }

    ZoneId zoneId = ZoneId.systemDefault();
    System.out.println("zoneId = " + zoneId);

    ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
    System.out.println("seoulZoneId = " + seoulZoneId);
  }

}
