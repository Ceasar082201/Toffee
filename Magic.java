/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package localrepo.magic;
import java.util.Scanner;
/**
 *
 * @author Huawei
 */
public class Magic {

    public static void main(String[] args) {
        String name,middle,last,full;
        int age,grade1,grade2,grade3,grade4,grade5,grade6;
        float ave;
       
        Scanner n = new Scanner(System.in);
        
        System.out.print("What is your name: ");
        name = n.nextLine();
        System.out.print("What is your middle initial: ");
        middle = n.nextLine();
        System.out.print("What is your last name: ");
        last = n.nextLine();
 
        System.out.print("How old are you: ");
        age = n.nextInt();
        
        full = last+" "+name+" "+middle;
        System.out.print("My name is : "+full);
        System.out.println("\nI am " + age + " years. old");
        
        System.out.print("What is your grade in Integrative Programming and Technology-2: ");
        grade1=n.nextInt();
        System.out.print("What is your grade in System integration and Architecture: ");
        grade2=n.nextInt();
        System.out.print("What is your grade in Networking-2: ");
        grade3=n.nextInt();
        System.out.print("What is your grade in Arts and Humanities-2: ");
        grade4=n.nextInt();
        System.out.print("What is your grade in Entrepreneurship: ");
        grade5=n.nextInt();
        System.out.print("What is your grade in Software Engineering: ");
        grade6=n.nextInt();

        ave = ((grade1 + grade2 + grade3 + grade4 + grade5 + grade6)/6);
        System.out.println("Average: " + ave);
        
    }
}
