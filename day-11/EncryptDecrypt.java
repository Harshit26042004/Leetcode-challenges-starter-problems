import java.util.*;
public class EncryptDecrypt {
    public static void main(String[] args) {
//        String enc = "21abc00bA*c";
        String enc = "62aH*ri00s";
        Stack<Character> ar = new Stack<>();
        String res = "5";

        int i=0;


        while(i<enc.length()){

            if(Character.isDigit(enc.charAt(i)) && enc.charAt(i)!='0'){
                ar.push(enc.charAt(i));
                i++;
            }
            else if(Character.isLowerCase(enc.charAt(i))  && i+1<enc.length()-1 && i+2<enc.length()-1 && Character.isUpperCase(enc.charAt(i+1)) && enc.charAt(i+2)=='*'){

                    res += (enc.charAt(i + 1) + "" + enc.charAt(i));
                    i += 3;


            }
            else if(enc.charAt(i)=='0'){
//                System.out.println("uyiroda irukiya....");
                res+=""+ar.peek();
                ar.pop();
                i++;
            }
            else{
                res+=(enc.charAt(i));
                i++;
            }
        }
//        System.out.println(ar);
        System.out.println(res);
    }
}
