public class Circuit {

    protected Resistor[] tableauResistor = new Resistor[20];
    protected int emplacementDuTableau = 0;
    protected double tension;


    void ajouterResistor(Resistor resistor1){
        tableauResistor[emplacementDuTableau ++] = resistor1;
    }

    void mettreSousTension(double tension){
        this.tension = tension;

    }

    // REB : Doit s'appeler calculerTension
    public double calculerTension() {
        return tension;
    }
}
