package anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DingLei {

    @Autowired
    private Pig pig;
    
    public Pig getPig() {
        return pig;
    }
    public void setPig(Pig pig) {
        this.pig = pig;
    }
    
    public String toString(){
        return "Dinglei has a " + pig.toString();
    }
}
