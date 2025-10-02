public class Main
{
  public static void main(String[] args)
  {
    removeStr( "bbbbbbadaboom", "ada");
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String output;
    String firstN = s1;
    String lastN = s2;

  firstN = s1.substring(0,n);

   int L = lastN.length() ;
  lastN = s2.substring(L - n);

    output = lastN + firstN;
   System.out.println(output);
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
  
 String Word1 = s1.toUpperCase();
 String firstS2 = s2.substring(0,1).toUpperCase();
 String restS2 = s2.substring(1).toLowerCase();

 System.out.println(Word1 + firstS2 + restS2);

  }

  public static String removeStr(String s1, String s2)

  {

    String before = s1.substring(0,s1.indexOf(s2));

    String after = s1.substring(s1.indexOf(s2) + s2.length());


    System.out.println(before + after);
    return before + after;
  }

}
