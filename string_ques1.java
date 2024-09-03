import java.util.*;

class Ques1{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String ogString = input.nextLine();
        String[] arrWords = ogString.split(" ");
        String revString = "";

        System.out.printf("Original sentence : %s\n",ogString);
        int n = arrWords.length;
        for (int i=n-1;i>=0;i--){
            revString += arrWords[i];
            revString += " ";
        }

        System.out.printf("Reversed sentence : %s\n",revString);
    }
}