package enumeration.test;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    AuthGrade[] authGrade = AuthGrade.values();

    System.out.print("당신의 등급을 입력하세요" + Arrays.toString(authGrade) + ": ");
    String grade = scanner.nextLine();

    AuthGrade selectedGrade = AuthGrade.valueOf(grade.toUpperCase());
    System.out.println("당신의 등급은 " + selectedGrade.getDescription() + "입니다.");
    System.out.println("==메뉴 목록==");

    for (String accessiblePage : selectedGrade.getAccessiblePages()) {
      System.out.println("- " + accessiblePage);
    }

  }
}
