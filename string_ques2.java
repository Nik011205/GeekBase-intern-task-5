import java.util.*;

class Ques2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String ogString = input.nextLine();
        System.out.println(String.valueOf(isPalindrome(ogString)));
    }

    public static boolean isPalindrome(String s){
        System.out.printf("Original String : %s\n",s);
        String removeSpecial = s.replaceAll("[^a-zA-Z0-9]", "");

        System.out.printf("String without special characters : %s\n",removeSpecial);
        String revString = "";
        for(int i=removeSpecial.length()-1; i>=0;i--){
            revString += removeSpecial.charAt(i);
        }
        System.out.printf("String after reversing : %s\n",revString);
        return (boolean) removeSpecial.equalsIgnoreCase(revString);
    }
}