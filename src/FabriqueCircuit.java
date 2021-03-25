import java.nio.file.attribute.AttributeView;
import java.util.Stack;

public class FabriqueCircuit {



    public static AbstarctCircuit fabriqueCircuit(String description) {


        String[] fabric = description.split("/");
        Stack<AbstarctCircuit> circuits = new Stack<>();
        Stack<Character> parens = new Stack<>();
        AbstarctCircuit circuit = null;
        ValiderParanthesage validerParanthesage = new ValiderParanthesage();

        for (int i = 0; i < description.length(); i++){
            validerParanthesage.validerParanthesage(description);
        }


        for (int x = 0; x < fabric.length; x++){

            Resistor resistor;
            resistor = FabriqueResistor.fabriqueResistor(fabric[x]);


            if (fabric.toString().charAt(x) == '('){

                circuit = new CircuitSerie();
                circuit.ajouterResistor(resistor);
                circuits.push(circuit);

            }else if (fabric.toString().charAt(x) == '['){

                circuit = new CircuitParallele();
                circuit.ajouterResistor(resistor);
                circuits.push(circuit);

            }
        }
        return circuit;
    }

}
