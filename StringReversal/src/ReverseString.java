public class ReverseString {
    public static void main(String[] args) {
        String inputStr = args[0];
        System.out.println("Original String::" + inputStr + " Reversed String::" + reverse(inputStr));
    }

    private static String reverse(String inputStr) {
        // Validate input string
        if (inputStr == null || inputStr.isEmpty())
            return inputStr;

        char[] chars = inputStr.toCharArray();
        int leftIndex = 0;
        int rightIndex = chars.length - 1;

        while(leftIndex < rightIndex) {
            // Swap left and right index characters with each other
            char tempChar = chars[leftIndex];
            chars[leftIndex] = chars[rightIndex];
            chars[rightIndex] = tempChar;

            // Move the index pointer to left and right respectively towards center
            leftIndex ++;
            rightIndex --;
        }
        return new String(chars);
    }
}
