public class MainClass {
    public static void main(String[] args) {

        //_____________________________________________________________________________________________________________________
        //reverse a string
        String strOriginale = "This is the original string";

        //solve using a library
        String stringBuffer = new StringBuffer(strOriginale).reverse().toString();
        System.out.println(stringBuffer);

        //solve by iteration
        String reversedString = reverse(strOriginale);
        System.out.println(reversedString);

        //_____________________________________________________________________________________________________________________
        //see if a string is a palindrome
        String palindrome = "deified";

        //solve by creating its reversed string and check if both are equal
        String stringBuffer2 = new StringBuffer(palindrome).reverse().toString();
        if (palindrome.equals(stringBuffer2)) {
            System.out.println("String to check is indeed palindrome");
        } else {
            System.out.println("nope the string to check is not a palindrome");
        }

        //solve by dividing the length of the string in half
        //and see if each character is equal to its mirroring one
        boolean stillOk = false;
        int count = palindrome.length() - 1;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) == palindrome.charAt(count)) {
                stillOk = true;
                count--;
            } else {
                stillOk = false;
                break;
            }
        }
        if (stillOk) {
            System.out.println("String to check is indeed palindrome");
        } else {
            System.out.println("nope the string to check is not a palindrome");
        }
        //______________________________________________________________________________________________________________________
        //seeing if I can recall the only sorting algorithm I know(Bubble sort)
        int array[] = {4, 5, 8, 9, 1, 0, 3};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
        //______________________________________________________________________________________________________________________

    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            strBuilder.append(str.charAt(i));
        }

        return strBuilder.toString();
    }
}
