public class MainClass {
    static int i = 0;
    public static void main(String[] args) {

        Calculate c = new Calculate();
        System.out.println(Calculate.add(2,5,3));
        System.out.println(c.add(5,6));


        for(i =0;i<10;i++) {
            System.out.println(i) ;
        }
    }
}
