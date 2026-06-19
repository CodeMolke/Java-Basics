public class Q25_EvenNumbers1To100 {
  public static void main(String[] args) {
    for (int i = 2; i <= 100; i += 2) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }

}
