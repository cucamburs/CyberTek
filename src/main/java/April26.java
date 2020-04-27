import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class April26 {
        public static void main(String[] args) {
        //task001(); // task002();
            //task003();

        }
        public static void task001(){
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            Pattern pattern = Pattern.compile("[a,e,i,o,u]");
            Matcher matcher = pattern.matcher(str);
            while(matcher.find()){
                    System.out.print(matcher.group() + " ");
            }

        }
        public static void task002(){
        Scanner scn = new Scanner(System.in);
        int beginning = scn.nextInt(), ending = scn.nextInt();
            for (int i = beginning; i <= ending; i++) {
                if(i%2 != 0) System.out.print(i + " ");
            }
        }
        public static void task003(){
        Scanner scn = new Scanner(System.in);
        String str = "";

        try {
            str = scn.next("[a-zA-Z]*");
        }
        catch (InputMismatchException e){

            System.out.println("Inputted incorrect the string");
        }

            String str2 = "";
            for (int i = 0; i < str.length()-1; i++) {
                if(i%2 == 0) str2 = str2 + str.substring(i,i+1).toLowerCase();
                else str2 = str2 + str.substring(i,i+1).toUpperCase();
            }
            System.out.println(str2);
        }
        public static void task004(){}

}

