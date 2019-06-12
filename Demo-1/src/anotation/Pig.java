package anotation;

import org.springframework.stereotype.Component;

@Component
public class Pig {

    private Double weight;
    private String color;
    public Pig(){
        this.weight = 55.8;
        this.color = "black";
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return  weight + " kg " + color + " pig!";
    }
}
