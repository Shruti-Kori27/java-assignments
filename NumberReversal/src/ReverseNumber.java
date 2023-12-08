public class ReverseNumber {
    public static void main(String[] args) {
        int inputNumber = 123456;
        System.out.println("Original Number::" + inputNumber + " Reversed Number::" + reverse(inputNumber));
    }

    private static int reverse(int inputNumber) {
        int reverseNumber = 0;

        while (inputNumber != 0) {
            // Using mode operator, get the last digit from input number
            int lastDigit = inputNumber % 10;
            // Divide the number by 10, remove the last digit
            inputNumber /= 10;
            // Multiply output by 10 (which appends zero at the end) and then plus 10 (which replace zero by lastDigit)
            reverseNumber = reverseNumber * 10 + lastDigit;
        }
        return reverseNumber;
    }
}

