
package Day_2_Exception_Handling;
import java.util.Scanner;

 class StudentData{
    int age;
    String name;
    public StudentData(String name, int age){
        this.age = age;
        this.name = name;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.next();

        try{
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
        }
        catch (Exception e){
            System.out.println("e");
        }

    }

}

