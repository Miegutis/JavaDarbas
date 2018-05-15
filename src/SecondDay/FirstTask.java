package SecondDay;

public class FirstTask {

    private static final String PALINDROME_1 = "KOL EINU ŠUNIE LOK";
    private static final String PALINDROME_2 = "ARGI TEN NE TIGRA";
    private static final String PALINDROME_3 = "SĖDĖK UŽU KĖDĖS";

    public static void main(String[] args) {


        String[] palindromeMas = {PALINDROME_1, PALINDROME_2, PALINDROME_3};

        for (String p : palindromeMas) {
            if (isWordIsPalindrome(p.replaceAll(" ", ""))) {
                System.out.println("Polindromas");

            } else {
                System.out.println("NE Polindromas");
            }
        }

        /*boolean isPalindrome = isWordIsPalindrome("KOL EINU ŠUNIE LOK".replaceAll(" ",""));

        if (isPalindrome) {
            System.out.println("Tai yra palindromas");

        } else {
            System.out.println("Tai nera palindromas");
        }*/
    }

        private static boolean isWordIsPalindrome (String word){
            boolean isPalindrome = true;
            for (int i = 0; i < word.length(); i++) {
                char a = word.charAt(i);
                int t = word.length() - 1 - i;
                char b = word.charAt(t);

                if (a != b) {
                    isPalindrome = false;
                    break;
                }
            }
            return isPalindrome;

        }

    }

