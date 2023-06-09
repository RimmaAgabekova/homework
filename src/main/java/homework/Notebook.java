package homework;


import java.util.Objects;

public class Notebook {
    String brand;
    String colour;
    public Notebook(String brand, String colour) {
        this.brand = brand;
        this.colour = colour;

    }
    public String getBrand() {
        return this.brand;
    }
    public String getColour() {
        return this.colour;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "notebook{" + "brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +

                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(brand, notebook.brand) &&
                Objects.equals(colour, notebook.colour);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, colour);
    }
}



