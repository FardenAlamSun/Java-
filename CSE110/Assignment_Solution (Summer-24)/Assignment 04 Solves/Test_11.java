import java.util.*;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a= sc.nextInt();
        int count =0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                count++;
            }

        }
        if(count==0){
            System.out.println(a+" is a prime number");
            System.out.println(a+" is not a perfect number");
        }
        else if(count!=0){
            System.out.println(a+" is not a prime number");
            System.out.println(a+" is a perfect number");
        }
        else{
            System.out.println("Enter numbers please");
        }

    }
}
