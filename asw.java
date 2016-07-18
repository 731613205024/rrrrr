/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aswinaji;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Student
 */
public class asw {
 
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
 
   int[] a={5,7,8,10,9,4,5,2,2,2,2,8};
        int i,flag = 0,j;
        for(i=0;i<=11;i++)
        {
            for(j=i+1;j<11;j++)
            {
                if(flag==1)
                    continue;
                if(a[i]==a[j])
                {
                flag=1;
                System.out.println("the first element which is repeated is"+a[i]);
                break;
         }
            }
        }
    }
}
            
        
    
