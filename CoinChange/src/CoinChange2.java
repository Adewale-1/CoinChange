import java.util.Scanner;

/**
 * This code uses Greedy Solution to convert a given amount(in cent) into change
 * using the lower combination possible.
 *
 * @author A.Adenle
 *
 */
public final class CoinChange2 {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private CoinChange2() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Declaration of constant denomination in cents.
        final int dollarValue = 100;
        final int halfDollarValue = 50;
        final int quarterValue = 25;
        final int dimeValue = 10;
        final int nickelValue = 5;
        final int pennyValue = 1;

        //Input of change to be calculated.
        System.out.print("Enter the amount of cent: ");
        int money = in.nextInt();

        //Declaration of Constant arrays
        int[] coinDinomination = { dollarValue, halfDollarValue, quarterValue,
                dimeValue, nickelValue, pennyValue };

        //Declaration of Denomination arrays
        String[] value = { " dollars,", " halfDollars,", " quarter,", " dime,",
                " nickel,", " penny" };

        // change return in each iteration of the for loop
        int[] change = new int[coinDinomination.length];

        for (int i = 0; i < coinDinomination.length; i++) {
            //Append the value of money into the new array index-> change
            change[i] = money / coinDinomination[i];
            money %= coinDinomination[i];
            //Print the value of the change with there associated denomination
            System.out.print(change[i] + " " + value[i]);
        }

        in.close();
    }
}