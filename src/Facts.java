public class Facts {
    public static void main (String[] args){
      int a=10, b=20, c=15, d=25;
      System.out.println("a==b is" + (a==b));
      System.out.println("a!=b is" + (a!=b));
      System.out.println("a>b is" + (a>b));
      System.out.println("a<b is" + (a<b));
      System.out.println("a>=b is" + (a>=b));
      System.out.println("a<=b is" + (a<=b));

      // logical operators
        System.out.println(("&& :" +(true && false)));
        System.out.println("&&:" + ((a>b) && (a!=b)));
        System.out.println("&&:" + ((a==b) || (a!=b)));

        //assignment  operators
        a +=b;
        System.out.println("a+=b" + a);
    }
}
