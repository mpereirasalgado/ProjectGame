package GameProject;

/**
 * @version 1.0 pre-Alfa
 * @author micaelr
 * @author seijas
 */
public class Cars {
    
    String matricula;
    String color;
    String marca;
    String modelo;
    int ocupCoche;

    public Cars() {
        matricula = Aleatory.enrollment();
        color = Aleatory.color();
        marca = Aleatory.marca();
        modelo = null;
        ocupCoche = Aleatory.vehicle_occupancy();
    }

    public Cars(String matricula, String color, String marca, String modelo, int ocupCoche) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.ocupCoche = ocupCoche;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getOcupCoche() {
        return ocupCoche;
    }
    public void setOcupCoche(int ocupCoche) {
        this.ocupCoche = ocupCoche;
    }

    @Override
    public String toString() {
        return "Cars{" + "matricula=" + matricula + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", ocupCoche=" + ocupCoche + '}';
    }
    
    public String toPrint(){
        return matricula + "¬" + color + "¬" + marca + "¬" + modelo+ "¬" + ocupCoche;
    }
    
}
