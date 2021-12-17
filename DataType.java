class DataType {
  public static void main(String[] args) {
    //整数
    byte var01 = 1;
    short var02 = 12345;
    int var03 = 1234567890;
    long var04 = 123456789000L;

    //少数
    double var05 = 1.23456789;
    float var06 = 1.234F;

    //文字
    char var07 = 'c';
    String var08 = "hello,World!";

    //ブール型
    int var_a = 10;
    int var_b = 1;
    boolean var_bool;

    var_bool = (var_a < var_b);

    System.out.println(var01);
    System.out.println(var02);
    System.out.println(var03);
    System.out.println(var04);

    System.out.println(var05);
    System.out.println(var06);

    System.out.println(var07);
    System.out.println(var08);

    System.out.println(var_bool);
  }
}
