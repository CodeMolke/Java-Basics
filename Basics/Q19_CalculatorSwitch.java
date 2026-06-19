public class Q19_CalculatorSwitch {
  public static void main(String[] args) {
    int a = 15;
    int b = 5;
    char operator = '%';
    switch (operator) {
      case '+':
        System.out.println("Addition of a and b is : " + (a + b));
        break;
      case '-':
        System.out.println("Subtraction of a and b is : " + (a - b));
        break;
      case '*':
        System.out.println("Multiplication of a and b is : " + (a * b));
        break;
      case '/':
        System.out.println("Division of a and b is : " + (a / b));
        break;
      case '%':
        System.out.println("Modulus of a and b is : " + (a % b));
        break;
      default:
        System.out.println("Invalid Operator");
    }
  }
}
