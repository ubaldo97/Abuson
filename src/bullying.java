

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruben
 */
public class bullying extends Thread{
     static int n;
 static int co;
    static int pro[] = new int[100];
    static int sta[] = new int[100];

    public bullying() {
        
    }    
    public void run(){
     GUI.mostrar.setText("");
       try{
        n = Integer.parseInt(GUI.nProcesos.getText());
        for(int i=0;i<n;i++)
        {
           
            sta[i]=1;
            pro[i] = i+1;
        }
     try {
         Thread.sleep(1000);
     } catch (InterruptedException ex) {
         Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
     }
        System.out.println("El coordinador actual a fallado");
        GUI.mostrar.setText(GUI.mostrar.getText()+"El coordinador actual a fallado \n");
        GUI.mostrar.setCaretPosition(GUI.mostrar.getDocument().getLength());
        sta[n-1]=0;
        
        
        Random r = new Random();
        int ele = r.nextInt(n-1)+1;
        System.out.println("El proceso: "+ele+" comenzó la eleccion");
         GUI.mostrar.setText(GUI.mostrar.getText()+"El proceso: "+ele+" comenzó la eleccion\n");
         GUI.mostrar.setCaretPosition(GUI.mostrar.getDocument().getLength());
         
         
         
          ele = ele-1;
       
        for(int i=ele;i<n;i++)
        { 
            for(int j=0;j<n;j++){
             if(pro[ele]<pro[j])
             {  
                 try {
                     
                     System.out.println("Mensaje de elección enviado del proceso: "+(ele+1)+" al "+(j+1));
                     GUI.mostrar.setText(GUI.mostrar.getText()+"Mensaje de elección enviado del proceso: "+(ele+1)+" al "+(j+1)+"\n");
                     GUI.mostrar.setCaretPosition(GUI.mostrar.getDocument().getLength());
                     Thread.sleep(100);
                 } catch (InterruptedException ex) {
                     Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
            }
            ele++;
        }
        co = ele-1;
            
        System.out.println("El coordinador es: "+co);
         GUI.mostrar.setText(GUI.mostrar.getText()+"El coordinador es: "+co+"\n");
         GUI.mostrar.setCaretPosition(GUI.mostrar.getDocument().getLength());
          }catch(NumberFormatException ex){
           GUI.mostrar.setText("Ingrese un numero entre 1 y 100");
           GUI.mostrar.setCaretPosition(GUI.mostrar.getDocument().getLength());
       }
        
    }
}
