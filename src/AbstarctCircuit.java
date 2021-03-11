public abstract class AbstarctCircuit implements IComposant {

    protected Resistor[] tableauResistor = new Resistor[20];
    protected int emplacementDuTableau = 0;
    protected double tension;


    public double calculerCourrant(){

       double courant = tension/calculerResistance();

        return courant;
    }

    public abstract double calculerResistance();



    void ajouterResistor(Resistor resistor1){
        tableauResistor[emplacementDuTableau ++] = resistor1;
    }


    public double calculerTension() {
        return tension;
    }
}
