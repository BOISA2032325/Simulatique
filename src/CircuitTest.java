
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CircuitTest {

    private Resistor[] res;

    @Test
    public void serieTest()
    {
        CircuitSerie p1 = new CircuitSerie();
        for (Resistor r : res)
            p1.ajouterResistor(r);

        p1.mettreSousTension(24);

        assertEquals(29, p1.calculerResistance(), 0.1);
        assertEquals(0.827, p1.calculerCourrant(), 0.1);
        assertEquals(24, p1.calculerTension(), 0.1);
    }

    @Test
    public void paralleleTest() {
        CircuitParallele p1 = new CircuitParallele();
        for (Resistor r : res)
            p1.ajouterResistor(r);

        p1.mettreSousTension(120);

        assertEquals(1.518, p1.calculerResistance(), 0.1);
        assertEquals(79.05, p1.calculerCourrant(), 0.1);
        assertEquals(120, p1.calculerTension(), 0.1);
    }

    @BeforeEach
    public void setUpResistors() {
        res = new Resistor[4];
        res[0] = new Resistor();
        res[0].setResistance(5);
        res[1] = new Resistor();
        res[1].setResistance(4);
        res[2] = new Resistor();
        res[2].setResistance(12);
        res[3] = new Resistor();
        res[3].setResistance(8);
    }
}