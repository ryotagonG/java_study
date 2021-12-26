public class FizzBuzz2 {
  public static void main(String[] args) {

    int count = 100;
    int numFizz = 3;
    int numBuzz = 5;
    String strFizz = "Fizz";
    String strBuzz = "Buzz";

    for (int i = 1; i <= count; i++) {
      if (i % (numFizz * numBuzz) == 0) {
        System.out.println(strFizz + strBuzz);
      } else if (i % numFizz == 0) {
        System.out.println(strFizz);
      } else if (i % numBuzz == 0) {
        System.out.println(strBuzz);
      } else {
        System.out.println(i);
      }
    }
  }
}
