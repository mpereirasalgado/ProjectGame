package GameProject;

import java.util.*;

/**
 *
 * @author dseijasiglesias
 */
public class Aleatory {
    
    public static String enrollment(){
        Random rnd = new Random();
        
        String enrollment = null;
        int number = rnd.nextInt(9999);
        
        char [] first = {'A', 'B', 'C', 'D', 'F', 'G', 'H', 'J'}; //no vale 'R' //8
        char [] letter = {'T', 'K', 'W', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'V', 'H', 'L', 'C', 'R'}; //20
        
        char two = '@';
        char three = ' ';
        char one = first[rnd.nextInt(8)];
        if (one == 'A'){
            two = letter[rnd.nextInt(19)];
        }else{
            two = letter[rnd.nextInt(20)];
            three = letter[rnd.nextInt(20)];
        }
        enrollment = String.valueOf(number) + '-' + one + two + three;
        return enrollment;
    }
    
    public static String color(){
        Random rnd = new Random();
        String [] Color = {"Rojo", "Negro", "Granate", "Blanco", "Gris"};
        return Color[rnd.nextInt(5)];
    }
    
    public static String marca(){
        Random rnd = new Random();
        
        String [] Marca = {"Alfa Romeo", "Audi", "BMW", "Chevrolet", "Citroën", "Dacia", "Fiat", "Ford", "Honda", "Hyundai", 
            "Infiniti", "Jaguar", "Jeep", "KIA", "Lamborghini", "Lancia", "Land Rover", "Lexus", "Lotus","Maserati", "Mazda", 
            "Mercedes", "Mini", "Mitsubishi", "Nissan", "Opel", "Peugeot", "Porsche", "Renault", "Rolls Royce", "Seat", 
            "Skoda", "Smart", "Ssangyong", "Subaru", "Suzuki", "Tata","Toyota", "Volkswagen", "Volvo"};
        
        return Marca[rnd.nextInt(40)];
    }
    
    public static int vehicle_occupancy(){
        Random rnd = new Random();
        return rnd.nextInt(5)+1;
    }
    
}