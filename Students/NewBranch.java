
package Students;

import java.io.File;
import java.util.Scanner;


public class NewBranch {

    public NewBranch() {
   
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t\t\t\t\t\tEnter Branch Name = ");
        String branch = input.next().toUpperCase();
        
        String Path = "./records/"+branch+"/";
        try {
            File file = new File(Path);
            if(file.exists()){
                System.out.println("\t\t\t\t\t\tThis Branch Allready Registed with our Records");
            } else {
                file.mkdir();
            }
        } catch (Exception e) {
            System.out.println("\t\t\t\t\t\tError in Dictory Creation => "+e);
        }
    
    }
    
}
