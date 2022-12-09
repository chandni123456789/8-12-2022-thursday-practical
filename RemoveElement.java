import java.util.Scanner;
public class RemoveElement
{
     public static void main(String[] args)
     {
      int size,ioc,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      size=sc.nextInt();
       
      int arr[]=new int[size];
      System.out.println("enter the element of array");
      for(i=0;i<size;i++)
       {
         arr[i]=sc.nextInt();
        }
       System.out.println("enter the element location you want to remove");
       ioc=sc.nextInt();
       for(i=ioc;i<size-1;i++) 
       {
        arr[i]=arr[i+1];
       }
       size--;
       for(i=0;i<size;i++)
       {
         System.out.println(arr[i]+ "  ");
       }
   }
}


      