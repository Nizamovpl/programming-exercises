public class TimeTester{
    public static void main(String[] args) {
        Time time = new Time();
        // time.display();
        System.out.println(time);

        //                    h   m   s  am
        Time time2 = new Time(10, 30, 0, true);
        time2.display();
    }
}

//notes taken by Arjun Iyer
