/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
       Scanner sc =  new Scanner(System.in);
        int ch,k=1;
       while(k!=0){
            System.out.println("\t\t\t\t\t\t1:- CREATE BRANCH ? ");    
            System.out.println("\t\t\t\t\t\t2:- ADD STUDENT DATA ? ");
            System.out.println("\t\t\t\t\t\t3:- VIEW STUDENT DATA !");
            System.out.println("\t\t\t\t\t\t4:- VIEW FEE DETAILS !");
            System.out.println("\t\t\t\t\t\t5:- EXIT !");
            System.out.println("\t\t\t\t\t\t Enter choice ?");
            ch=sc.nextInt(); 
           
         
         if(ch==1){
          NewBranch nB= new NewBranch();
         }     
         else if(ch==2){
          AddStud astd = new AddStud();
           astd.studentDetails();
         }     
         else if(ch==3){
             StudDetails std = new StudDetails();
             std.stdDtls();
         }  
         else if(ch==4){
         StudfeeDetails sfee = new StudfeeDetails();
         sfee.feeSys();
         }
         else if(ch==5) {
         break;
         }
         
          System.out.println("\t\t\t\t\t\tDo you want to CONTINUE ? 1-YES/0-NO");
            k = sc.nextInt();
       }
    
    }
}


