import java.util.Scanner;

/**
 * This code uses Greedy Solution to convert a given amount(in cent) into change
 * using the lowest combination possible.
 *
 * @author A.Adenle
 *
 */
public final class CoinChange1 {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private CoinChange1() {
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
        final int pennyValue  = 1;

        //Input of change to be calculated.
        System.out.print("Enter the amount of cent: ");
        int money = in.nextInt();

        //Input value divided by a constant value of cents and make
        //money = change left.
        int dollars = money / dollarValue;
        money %= dollarValue;

        int halfDollars = money / halfDollarValue;
        money %= halfDollarValue;

        int quarter = money / quarterValue;
        money %= quarterValue;

        int dime = money / dimeValue;
        money %= dimeValue;

        int nickel = money / nickelValue;
        money %= nickelValue;

        int penny = money / pennyValue;
        money = penny;

        // Output value with there associated denomination constant
        System.out.print(dollars + " dollars,");
        System.out.print(halfDollars + " halfDollars,");
        System.out.print(quarter + " quarter,");
        System.out.print(dime + " dime,");
        System.out.print(nickel + " nickel,");
        System.out.print(penny + " pennies");

        in.close();
    }
}