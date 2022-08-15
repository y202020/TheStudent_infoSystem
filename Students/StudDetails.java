/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.io.IOUtils;

public class StudDetails {
    public void stdDtls() throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\tEnter Branch ?");
        String brnch = sc.next();
        System.out.println("\t\t\t\t\t\tEnter Student Roll ! ");
        String Rol = sc.next();
        System.out.println("\t\t\t\t\t\tEnter Name ?");
        sc.nextLine();
        String nam = sc.nextLine().toUpperCase();
        String pth = "./records/"+brnch+"/";
        String fil_pth = pth+"/"+Rol+"_"+nam+".txt";
        File sdfile = new File(fil_pth);
        try {
          if(sdfile.exists()){
            //open File
            FileInputStream fstream = new FileInputStream(fil_pth);
            String s = IOUtils.toString(fstream,"UTF-8");
            String splt[] = s.split("-");
               System.out.println("Roll No = "+splt[0]);
               System.out.println("Name = "+splt[1]);
               System.out.println("Cotact no = "+splt[2]);
               System.out.println("Branch = "+splt[3]); 
                     
           //Close the input stream
            fstream.close();
           }
          else{
               System.out.println("\t\t\t\t\t\tStudent Data Not Registered !! ");
           }
        } 
        catch (Exception e) {
          }
    
    
    }
}
