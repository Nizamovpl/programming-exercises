class BoxTester
{

  public static void main ( String[] args ){
     Box box = new Box( 2, 5, 6 ) ;

     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );

     System.out.println( "length: " + box.length + " height: " + box. height +
                         "width:  " + box.width )  ;

  }
}