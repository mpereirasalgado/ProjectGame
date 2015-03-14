package GameProject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dseijasiglesias
 */
public class Garage {
    
    private int tamaño;
    private float tarifa;
    private int plazas_disponibles;
    
    public Garage(){
        
    }
    
    public void runGame(){
        boolean modif2 = false;
        boolean modif = false;
        do{
            
            String tareas[] = Methods.readFile();
            JOptionPane.showMessageDialog(null, tareas[0]);
            
            do{
                Cars vehiculo = new Cars();
                ArrayList <Cars> coche = new ArrayList();
                coche.add(vehiculo);
                
                    System.out.println(Methods.comparaciones(tareas[1], coche));
                
                coche.clear();
                /**
                if(tareas[1].equalsIgnoreCase(vehiculo.getColor())){
                    System.out.println("coincide color");
                }else
                {
                    System.out.println("no coincide");
                }
                */
            }while(modif2 == false);
        }while(modif == false);
    }
}
