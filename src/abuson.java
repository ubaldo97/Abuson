/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruben
 */
   import java.io.*;
import java.util.Scanner;
public class abuson {
    static int n;
    static int pro[] = new int[100];
    static int sta[] = new int[100];
    static int co;
     
    public static void main(String args[])throws IOException, InterruptedException
    {
        System.out.println("Ingresa el numero de procesos");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
         
        int i,j,k,l,m;
         
        for(i=0;i<n;i++)
        {
           
            sta[i]=1;
            pro[i] = i+1;
        }
        Thread.sleep(1000);
        System.out.println("El coordinador actual a fallado");
        sta[n-1]=0;
        
        
        System.out.println("Cual proceso iniciará la elección?");
        int ele = in.nextInt();
         
        elect(ele);
        System.out.println("El coordinador es: "+co);
    }
     
    public static void elect(int ele)
    {
        ele = ele-1;
       
        for(int i=ele;i<n;i++)
        { 
            for(int j=0;j<n;j++){
             if(pro[ele]<pro[j])
             {  
                System.out.println("Mensaje de elección enviado del proceso: "+(ele+1)+" al "+(j+1));
                
             }
            }
            ele++;
        }
        co = ele-1;
    }

}

