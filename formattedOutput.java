import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                
                System.out.printf("%-15s%03d%n",s1,x);
                
                // "%" ->  formatted
                // "-"  -> left identation means starting from left side
                // "15s" -> 15 spaces
                // "%"  -> formatted 
                // 0  -> pads/inputs the zero first before writing anything
                // 3d -> maximum of 3 digits 
                // %n -> new line character
                
                
                
            }
            System.out.println("================================");

    }
}



