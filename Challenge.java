public class Challenge {
    public static void main(String[] args) {
        double x = 20.00;
        double y = 80.00;

        double solution = ((x+y) * 100.00);

        double remainder = solution % 40.00;

        boolean remResult = (remainder == 0) ? true : false;

        System.out.println(remResult);

        if (remResult == false) {
            System.out.println("got some remainder");
        }




    }
}
