package GameProject;

/**
 * @version 1.0 pre-Alfa
 * @author micaelr
 * @author seijas
 */
public class Cars {
    
    String enrollment;
    String color;
    String brand;
    String model;
    int carFills;

    public Cars() {
        enrollment = Aleatory.enrollment();
        color = Aleatory.color();
        brand = Aleatory.marca();
        model = null;
        carFills = Aleatory.vehicle_occupancy();
    }

    public Cars(String matricula, String color, String marca, String modelo, int ocupCoche) {
        this.enrollment = matricula;
        this.color = color;
        this.brand = marca;
        this.model = modelo;
        this.carFills = ocupCoche;
    }

    public String getEnrollment() {
        return enrollment;
    }
    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getCarFills() {
        return carFills;
    }
    public void setCarFills(int carFills) {
        this.carFills = carFills;
    }

    @Override
    public String toString() {
        return "Cars{" + "enrollment=" + enrollment + ", color=" + color + ", brand=" + brand + ", model=" + model + ", carFills=" + carFills + '}';
    }
    
    public String toPrint(){
        return enrollment + "¬" + color + "¬" + brand + "¬" + model+ "¬" + carFills;
    }
    
}
