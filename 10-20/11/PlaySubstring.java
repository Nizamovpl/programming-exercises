public class PlaySubstring
{
  public static void main ( String[] args )
  {
    String str = new String( "Golf is a good walk spoiled." ); // create the original object

    String sub = str.substring(8); //create a new object from the original

    System.out.println( sub );

  }
}

//change 8 to something else which cuts more of the string 