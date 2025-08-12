
//Recursion
public class Training3
{
   public static void main(String[]args){
       sayHi(5); 
   }
   public static void sayHi(int n){
       if(n == 0)//checks if its zero if not? incemrate -1
       // if it is equal to zero 
       {
           System.out.println("Done!");// print done
       } else {
           System.out.println("hi");
           n--;
           sayHi(n);
       }
   }
   
   //need a base case to stop at
   
}
