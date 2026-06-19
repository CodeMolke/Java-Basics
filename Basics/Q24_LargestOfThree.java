public class Q24_LargestOfThree {
  public static void main(String[] args) {
    int a = 25;
    int b = 18;
    int c = 40;
    if (a > b && a > c)
      System.out.println(a + " is Largest Number");
    else if (b > a && b > c) {
      System.out.println(b + " is Largest Number");
    } else {
      System.out.println(c + " is largest Number");
    }
  }

}
