public class Greatest_among_three {
    public static void main(String[] args) {
        int  a=10 , b=100, c=50;
        if (a>b && a<c) {
            System.out.println("A is greater");
        } else if (b>a && b>c) {
            System.out.println("B is greater");
        } else {
            System.out.println("C is greater");
        }
    }
}