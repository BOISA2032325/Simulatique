import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public String toString(){
        String description = "";
        Stream<IComposant> StringCompo = composants.stream();
        description = StringCompo.map(Objects::toString).collect(Collectors.joining());
        return calculerResistance() + calculerCourant() + calculerTension() + description;
    }
}