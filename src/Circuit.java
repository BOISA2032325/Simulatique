public class Circuit {

    protected Resistor[] tableauResistor = new Resistor[20];
    protected int emplacementDuTableau = 0;
    protected double tension;


    public double calculerCourrant(){

       double courant = tension/calculerResistance();

        return courant;
    }

    public double calculerResistance(){
        return 0;
    }


    void ajouterResistor(Resistor resistor1){
        tableauResistor[emplacementDuTableau ++] = resistor1;
    }

    void mettreSousTension(double tension){
        this.tension = tension;

    }


    //double CalculerCourrant(){

    //}

    public double calculerTension() {
        return tension;
    }
}
