/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.io.IOUtils;

public class StudfeeDetails extends AddStud {
   public void feeSys() {
       Scanner sc = new Scanner(System.in);
       int k=1;
       while(k!=0){
            System.out.println("\t\t\t\t\t\t  1.FEE DETAILS ! ");
            System.out.println("\t\t\t\t\t\t  2.DEPOSITE Fee ! ");
            int n= sc.nextInt();
         if(n==1){ 
            System.out.println("\t\t\t\t\t\tEnter branch name ?");
            String brnch = sc.next().toUpperCase();
            System.out.println("\t\t\t\t\t\tEnter Name of Student ? ");
             sc.nextLine();
            String naam = sc.nextLine().toUpperCase();
            System.out.println("\t\t\t\t\t\tEnter Roll No. ?"); 
            int Rol = sc.nextInt();

            String branch_path = "./records/"+brnch+"/";
            String fl_pth = branch_path+"/"+Rol+"_"+naam+"_fee.txt";
            File fl = new File(fl_pth);

        try {
           if(fl.exists()){
            FileInputStream fstream = new FileInputStream(fl_pth);
            
            String data = IOUtils.toString(fstream,"UTF-8");
             String splt[] = data.split("-");
               System.out.println("Deposited = "+splt[0]);
               System.out.println("Balance  = "+splt[1]);
               System.out.println("Total  = "+splt[2]);
            //Close the input stream
             fstream.close();
             }else{
                System.out.println("\t\t\t\t\t\tStudent Data Not Registered !! ");
             }
           } catch (IOException e) {
           }
         }
        else if(n==2){
            System.out.println("\t\t\t\t\t\tEnter branch name ?");
            String brnch = sc.next().toUpperCase();
            System.out.println("\t\t\t\t\t\tEnter Name of Student ? ");
             sc.nextLine();
            String naam = sc.nextLine().toUpperCase();
            System.out.println("\t\t\t\t\t\tEnter Roll No. ?"); 
            int Rol = sc.nextInt();
           
            String branch_path = "./records/"+brnch+"/";
            String fl_pth = branch_path+"/"+Rol+"_"+naam+"_fee.txt";
            File fl = new File(fl_pth);
             
         try {
            if(fl.exists()){
             FileInputStream fstream = new FileInputStream(fl_pth);
             String data = IOUtils.toString(fstream,"UTF-8");
             String splt[] = data.split("-"); 
             fstream.close();
             System.out.println("Enter amount to be Deposited ?");
             int dfe = sc.nextInt();
             int fee = Integer.parseInt(splt[2]);
             int bfe = fee - dfe;   
             FileWriter  wrtr = new FileWriter(fl); 
             BufferedWriter br = new BufferedWriter(wrtr);
             String newData = dfe+"-"+bfe+"-"+fee;
             br.write(newData);
             br.close();
             }else{
               System.out.println("\t\t\t\t\t\tStudent Data Not Registered !! ");
             }
           } catch (IOException e) {
            }
        }
         
        System.out.println("\t\t\t\t\t\tDo u want to go to MAIN MENU ? 0-YES/1-NO");
        k=sc.nextInt();
     }
   
   
   }
}
 