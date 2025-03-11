import java.util.Scanner;
class conditional {
    public static void main(String[] args){
        System.out.println("hello world");
        Scanner a=new Scanner(System.in);
        int age=a.nextInt();
        if (age<18){
            System.out.print("minor");
        }
        else if(age<60){
            System.out.print("major");
        }
        else{
            System.out.print("senior");
        }

    }
    
}