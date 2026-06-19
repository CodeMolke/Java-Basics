public class Q18_GradeCalculator {

  public static void main(String[] args) {
    int marks = 95;
    if (marks >= 90) {
      System.out.println("Student Scored A Grade");
    } else if (marks >= 80) {
      System.out.println("Student Scored B Grade");
    } else if (marks >= 70) {
      System.out.println("Student Scored C Grade");

    } else if (marks >= 60) {
      System.out.println("Student Scored D Grade");

    } else {
      System.out.println("Student is Fail");
    }
  }
}