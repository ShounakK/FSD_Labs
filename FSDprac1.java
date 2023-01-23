/*
 *  Sort a given array {1,4,382,79,44,86,722,51,9} using Bubble Sort and search the element '79' using Binary Search.
 */
import java.util.*;
public class FSDprac1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        
        int temp;
        int A[]={1,4,382,79,44,86,722,51,9};
        int Alen =A.length;
        int f = 0;
        int l = Alen - 1;
        int mid = (f+l)/2;

        for(int i=0;i<Alen-1;i++)
        {
            for(int j =0;j<Alen-i-1;j++)
            {
                if (A[j] > A[j+1])  
                {
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
       }
        
        System.out.println("Sorted Array is ");
       for(int i=0;i<Alen;i++)
        {
            System.out.print(" "+A[i]+" ");
        }

        System.out.println("\n Enter the number to be found: ");
        int N = sc.nextInt();
        
        while( f <= l )
        {  
            if ( A[mid] < N )
            {  
                f = mid + 1;     
            }
            else if ( A[mid] == N )
            {
                System.out.println("\n Element is found at index: " +(mid+1));  
                break;   
            }
            else
            {  
                l = mid - 1;
            }  
             mid = (f + l)/2;  
       }  
       if (f > l)
       {
           System.out.println("\n Element not found");
       }
   }  
 }  