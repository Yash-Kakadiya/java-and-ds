// Q25: WAP for following Scenario. 
// Given  n  rupees  and  a  chocolate  price  of  m  for  each chocolate,  with  a  wrapper  exchange  offer  of  1 chocolate per k wrappers, calculate the total number of chocolates you can eat with n rupees.

public class Q25 {
    public static void main(String[] args) {
        int n = 15; // rupees
        int m = 1; // price per chocolate
        int k = 3; // wrappers needed

        int chocolates = n / m;
        int wrappers = chocolates;

        while (wrappers >= k) {
            int extra = wrappers / k;
            chocolates += extra;
            wrappers = extra + (wrappers % k);
        }

        System.out.println("Total chocolates: " + chocolates);
    }
}
