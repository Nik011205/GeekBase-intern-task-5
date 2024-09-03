import java.util.*;
class Ques3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String ogString = input.next();
        String noRepeat = "";
        HashSet <Character> set = new HashSet<>();
        for(char i : ogString.toCharArray()){
            if(!(set.contains(i))){
                noRepeat += i;
                set.add(i);
            }
        }
        System.out.printf("String without repeated characters : %s\n",noRepeat);
    }
}