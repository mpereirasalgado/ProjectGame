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
        
        do{
            int option = JOptionPane.showOptionDialog(null, "Benvido ao garaxe", "Garaxe", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Empezar", "Configuración", "Sair"}, null);
            
            switch(option){
                
                case 0:
                    //Empezar
                    break;
                
                case 1:
                    //cofigurar
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
    
}
