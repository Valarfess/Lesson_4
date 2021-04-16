package teach.me.skills;

import java.util.ArrayList;

public class CalculatorV2 extends CalculatorV1 implements CalculatorWithMemory{

    ArrayList history = new ArrayList();

    @Override
    public ArrayList historyAdd(double a, double b) {
        history.add(a);
        history.add(b);
        return history;
    }

    @Override
    public ArrayList historyAdd(double e) {
        return history;
    }
}
