/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package localrepo.evenoddchecker;
import java.util.Scanner;
/**
 *
 * @author Huawei
 */
public class EvenOddChecker {

    public static void main(String[] args) {
        int start,end;
        
        Scanner scan = new Scanner(System.in); // scan.next();
        
        System.out.print("Enter the starting number:");
        start = scan.nextInt();
        
        System.out.print("Enter the ending number:");
        end = scan.nextInt();
        
        if (start > end){
            System.out.println("Starting number should bee less than or equal to the ending number.");
            return;
        }
        System.out.println("Even or Odd numbers between" + start + " + end + :");
        for (int i = start; i<= end; i++){
            if (i % 2 ==0){
                System.out.println(i + "is even.");
            }else {
                System.out.println(i + "is odd.");
            }
        }
        
        
        
    }
}
