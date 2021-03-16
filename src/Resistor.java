public  class Resistor implements IComposant {

    double resistance;
    double tolerence;



    public void setTolerence(double tolerence) {
        this.tolerence = tolerence;
    }

    public double getTolerence() {
        return tolerence;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public double getResistance() {
        return resistance;
    }


    // REB : à implémenter
    @Override
    public void mettreSousTension(double tension) {

    }

    @Override
    public double calculerTension() {
        return 0;
    }

    @Override
    public void specifierCourant(double courant) {

    }

    @Override
    public double calculerCourant() {
        return 0;
    }

    @Override
    public double calculerResistance() {
        return 0;
    }
}
