public class Resistor {

    double resistance;
    double tolerence;



    public void setTolerence(double tolerence) {
        this.tolerence = tolerence;
    }

    // REB : Doit s'appeler getTolerance
    public double getTolerance() {
        return tolerence;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public double getResistance() {
        return resistance;
    }


}
