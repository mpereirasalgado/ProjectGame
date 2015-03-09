
package GameProject;

/**
 *
 * @author micaelr
 * @author seijas
 */
public class Cars {
    
    String matricula;
    String color;
    String marca;
    String modelo;
    String ocupCoche;

    public Cars() {
    }

    public Cars(String matricula, String color, String marca, String modelo, String ocupCoche) {
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

    public String getOcupCoche() {
        return ocupCoche;
    }

    public void setOcupCoche(String ocupCoche) {
        this.ocupCoche = ocupCoche;
    }

    @Override
    public String toString() {
        return "Cars{" + "matricula=" + matricula + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", ocupCoche=" + ocupCoche + '}';
    }
    
    
    
}
