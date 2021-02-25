public class CircuitParallele extends AbstarctCircuit {


    // REB : Retirez ces attributs
    private double valeurFinal;
    private double courant;

    public double calculerResistance(){
        // REB : indentation
        double valeurDeLaResistance = 0;

       for (int i = 0; i<emplacementDuTableau; i ++){
           valeurDeLaResistance += (1/tableauResistor[i].getResistance());
       }

        return 1/valeurDeLaResistance;
    }



    @Override
    public String toString() {
        return "CircuitEnParallele{" +
                ", valeurDeLaResistance=" + calculerResistance() +
                ", valeurFinal=" + valeurFinal +
                ", courant=" + courant +
                '}';
    }
}
