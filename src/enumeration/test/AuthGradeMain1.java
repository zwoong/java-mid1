package enumeration.test;

public class AuthGradeMain1 {

  public static void main(String[] args) {
    AuthGrade[] authGrade = AuthGrade.values();
    for (AuthGrade grade : authGrade) {
      System.out.println("grade=" + grade.name() + ", level=" + grade.getLevel() + ", 설명="
          + grade.getDescription());
    }
  }
}
