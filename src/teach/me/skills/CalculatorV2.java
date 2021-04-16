package teach.me.skills;

import java.util.ArrayList;

public class CalculatorV2 extends CalculatorV1 implements CalculatorWithMemory {

    ArrayList history = new ArrayList();


    @Override
    public ArrayList historyAdd(String d, double a, double b) {
        return history;
    }

    @Override
    public ArrayList historyAdd(String f, double e) {
        return history;
    }
}
