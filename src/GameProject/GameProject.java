package GameProject;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @version pre-Alfa 1.0
 * @author micaelr
 * @author seijas
 */
public class GameProject {

    public static void main(String[] args) {
        
        boolean modifier = false;
        Garage gar = new Garage();
        do{
            int option = JOptionPane.showOptionDialog(null, "Welcome to my garage", "Garage", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Start", "Configuration", "Exit"}, null);
            
            switch(option){
                
                case 0:
                    String dailyT[] = Methods.readFile();
                    JOptionPane.showMessageDialog(null, dailyT[0]);
                    break;
                
                case 1:
                    gar.runGame();
                    break;
                
                case 2:
                    //Salir
                    modifier = true;
                    break;
                
                default:
                    //cerrar
                    modifier = true;
                    break;
            }
            
        }while(modifier == false);
        
    }
    // branch micaelr created, my workspace
}
