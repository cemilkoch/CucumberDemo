package com.fizzbuzz.methods;

public class FizzBuzz {

    // If the number is divisible by 3 return Fizz
    // If the number is divisible by 5 return Buzz
    // If the number is divisible by 5 and 3 return FizzBuzz
    // If the number is not divisible by 3 or 5 or 15 return number itself
    public String play(int number) {
        if (isMultipleOf(number, 5) && isMultipleOf(number, 3)) {
            return "FizzBuzz";
        }
        if (isMultipleOf(number, 3)) {
            return "Fizz";
        }
        if (isMultipleOf(number, 5)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isMultipleOf(int number, int i) {
        return number % i == 0;
    }

}

