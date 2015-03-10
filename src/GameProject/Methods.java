package GameProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dseijasiglesias
 */
public class Methods {
    
    public static void readFile(ArrayList <Cars> cars, String fileCars, String delimiter){
        
        FileReader fr = null;
        
        try {
            fr = new FileReader(new File (fileCars));
            BufferedReader br = new BufferedReader(fr);
            
            String line ="";
            
            while((line=br.readLine())!= null){
                
                String lineArray[] = line.split(delimiter);
		
                cars.add(new Cars(lineArray[0], lineArray[1], lineArray[2], lineArray[3], Integer.parseInt(lineArray[4])));
            }
            
        }catch(IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error ao tentar leer o ficheiro");
        }finally{
            try{                    
                if( null != fr ){   
                   fr.close();     
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
    }
    
    
    
    
    
}
