public class FizzBuzz {
  public static void main(String[] args) {
    int i = 0;

    int count = 100;

    int numFizz = 3;

    int numBuzz = 5;

    String strFizz = "Fizz";

    String strBuzz = "Buzz";

    for(i = 1; i <= count; i++) {
      if(i % (numFizz * numBuzz) == 0) {
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
