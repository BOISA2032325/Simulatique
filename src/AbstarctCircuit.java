import java.util.ArrayList;
import java.util.List;

public abstract class AbstarctCircuit implements IComposant {

    List<IComposant> composants = new ArrayList<>();
    protected double tension;


    public double calculerCourrant(){

       double courant = tension/calculerResistance();

        return courant;
    }

    public abstract double calculerResistance();



    void ajouterResistor(Resistor resistor1){
        composants.add(resistor1);
    }


    public double calculerTension() {
        return tension;
    }
}
