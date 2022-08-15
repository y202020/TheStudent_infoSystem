
package Students;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class AddStud  {
 
  public void studentDetails (){
   Scanner sc = new Scanner(System.in);
    System.out.println("\t\t\t\t\t\tEnter Roll no ?");
     String rolNo = sc.next();
    System.out.println("\t\t\t\t\t\tEnter Name of the Student ? ?");
     sc.nextLine();
     String nam = sc.nextLine().toUpperCase();
    System.out.println("\t\t\t\t\t\tEnter Contact number ?");
     String Contct= sc.next();
    System.out.println("\t\t\t\t\t\tEnter Branch ?");
     String brnch = sc.next().toUpperCase();
    System.out.println("\t\t\t\t\t\tEnter Fee ?");
     int fee = sc.nextInt(); 
    int dfee=0,bfee=fee;
      try {
           String branch_path = "./records/"+brnch+"/";
            File file = new File(branch_path);
            if(! file.exists()){
                System.out.println("\t\t\t\t\t\tBranch Not Registerd PLZ  Create a Branch First");
            } else {
                String file_path = branch_path+"/"+rolNo+"_"+nam+".txt";
                File fw = new File(file_path);
                fw.createNewFile();
               
                String fl_path = branch_path+"/"+rolNo+"_"+nam+"_fee.txt";
                File f = new File(fl_path);
                f.createNewFile();
                
                if(fw.exists()&&f.exists()){
                    FileWriter myWrtr = new FileWriter(fw);
                    BufferedWriter bufwrtr = new  BufferedWriter(myWrtr);
                     String sDta = (rolNo+"-"+nam+"-"+Contct+"-"+brnch);
                     bufwrtr.write(sDta);
                     bufwrtr.close();

                    FileWriter myWrt = new FileWriter(f);
                    BufferedWriter bufwrt = new  BufferedWriter(myWrt);
                     String feeD = (dfee+"-"+bfee+"-"+fee);
                     bufwrt.write(feeD);
                     bufwrt.close();
                }
            }
          } catch (Exception e) {
          System.out.println(""+e);
      }
     
    }
}
