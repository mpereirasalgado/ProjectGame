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
    
    public static String[] readFile(){
        String fileDailyTasks = "src/file/dailyTasks.txt";
        FileReader fr = null;
        
        try {
            
            fr = new FileReader(new File ("src/file/dailyTasks.txt"));
            BufferedReader br = new BufferedReader(fr);
            
            int counter = 0;
            int datum = Aleatory.number(0, 4);
            String line ="";
            
            while(((line=br.readLine())!= null) && counter<=datum){
                
                String lineArray[] = line.split("--");
		
                counter++;
                if(counter>datum){
                    return lineArray;
                }
            }
            return null;
        }catch(IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error ao tentar leer o ficheiro");
            return null;
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
    public static int countLines(String nameFile){
        
        FileReader fr = null;
        
        try {
            fr = new FileReader(new File (nameFile));
            BufferedReader br = new BufferedReader(fr);
            
            int counter = 0;
            
            while(br.readLine()!= null){
                counter++;
            }
            return counter;
        }catch(IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error ao tentar leer o ficheiro");
            return 0;
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
        
    public static boolean comparaciones(String cadena, ArrayList <Cars> coche){
        String posibilidades[] = cadena.split(",");
        
        for(int i=0; i<posibilidades.length; i++){
            if(coche.get(0).toPrint().contains(posibilidades[i])){
            //if(posibilidades[i].equalsIgnoreCase(coche.get(0).getColor())){
                return true;
            }
        }
        return false;
    }
    
    
    public static boolean comparacionescoches(String cadena, ArrayList <Cars> coche){
        String posibilidades[] = cadena.split(",");
        
        for(int i=0; i<posibilidades.length; i++){
            if(coche.get(0).toPrint().contains(posibilidades[i])){
            //if(posibilidades[i].equalsIgnoreCase(coche.get(0).getColor())){
                return true;
            }
        }
        return false;
    }
    
}
