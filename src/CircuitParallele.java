public class CircuitParallele extends AbstarctCircuit{


    private double valeurFinal;
    private double courant;


    @Override
    public void mettreSousTension(double tension) {

    }

    @Override
    public void specifierCourant(double courant) {

    }

    @Override
    public double calculerCourant() {
        return 0;
    }

    public double calculerResistance(){

        double valeurDeLaResistance = 0;

       for (int i = 0; i<composants.size(); i ++){
           valeurDeLaResistance += (1/composants.get(i).calculerResistance());
       }

        return 1/valeurDeLaResistance;
    }



    @Override
    public String toString() {
        return "CircuitEnParallele{" +
                ", valeurDeLaResistance=" + calculerResistance() +
                ", courant=" + calculerCourant() +
                '}';
    }
}
