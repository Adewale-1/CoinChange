# Coin Change Calculator

This repository contains two Java classes, `CoinChange1.java` and `CoinChange2.java`, which both use a greedy algorithm to convert a given amount (in cents) into change using the lowest combination possible.

## CoinChange1.java

`CoinChange1.java` uses a straightforward approach to calculate the change. It divides the given amount by the value of each denomination starting from the highest (dollar) to the lowest (penny), and calculates the remainder. This process is repeated for each denomination.

### Usage

To use this class, simply run the `main` method. You will be prompted to enter an amount in cents. The program will then output the calculated change in dollars, half dollars, quarters, dimes, nickels, and pennies.

## CoinChange2.java

`CoinChange2.java` uses a slightly different approach to calculate the change. It stores the denominations and their corresponding names in two separate arrays. It then uses a loop to calculate the change for each denomination.

### Usage

To use this class, run the `main` method. You will be prompted to enter an amount in cents. The program will then output the calculated change in dollars, half dollars, quarters, dimes, nickels, and pennies.

## Dependencies

Both classes depend on the `SimpleReader` and `SimpleWriter` classes from the components library for input and output operations.

## Authors

These programs were written by A.Adenle.

## License

This project is open source and available under the [MIT License](https://opensource.org/licenses/MIT).
