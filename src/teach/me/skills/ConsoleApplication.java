package teach.me.skills;

import java.util.ArrayList;


public class ConsoleApplication {
    private CalculatorV1 calculator = new CalculatorV1();
    private CalculatorV2 calculatorV2 = new CalculatorV2();
    private ConsoleReader consoleReader = new ConsoleReader();
    private ConsoleWriter consoleWriter = new ConsoleWriter();

    public double a;
    public double b;

    public void run() {
        menu();

        consoleWriter.writeString("Choose operation: " + "\n" + "1 - Calculator V1" + "\n" + "2 - Calculator V2 (with memory)");
        int c = consoleReader.readInt();
        if (c == 1) {
            while (true) {
                consoleWriter.writeString("Choose operation: " + "\n" + "1 - sum" + "\n" + "2 - minus" + "\n" + "3 - multi" + "\n" +
                        "4 - delenie" + "\n" + "5 - cos" + "\n" + "6 - sin" + "\n" + "7 - history" + "\n" + "0 - Exit");
                switch (consoleReader.readInt()) {
                    case 0:
                        return;
                    case 1:
                        a = getNumber("Enter number 1");
                        b = getNumber("Enter number 2");
                        double sum = calculator.sum(a, b);
                        consoleWriter.writeString("Result " + sum);
                        break;
                    case 2:
                        a = getNumber("Enter number 1");
                        b = getNumber("Enter number 2");
                        double minus = calculator.minus(a, b);
                        consoleWriter.writeString("Result " + minus);
                        break;
                    case 3:
                        a = getNumber("Enter number 1");
                        b = getNumber("Enter number 2");
                        double multi = calculator.multi(a, b);
                        consoleWriter.writeString("Result " + multi);
                        break;
                    case 4:
                        a = getNumber("Enter number 1");
                        b = getNumber("Enter number 2");
                        double delenie = calculator.delenie(a, b);
                        consoleWriter.writeString("Result " + delenie);
                        break;
                    case 5:
                        a = getNumber("Enter number");
                        double cos = calculator.cos(a);
                        consoleWriter.writeString("Result " + cos);
                        break;
                    case 6:
                        a = getNumber("Enter number");
                        double sin = calculator.sin(a);
                        consoleWriter.writeString("Result " + sin);
                        break;
                }
            }
        } else if (c == 2) {
            while (true) {
                consoleWriter.writeString("Choose operation: " + "\n" + "1 - sum" + "\n" + "2 - minus" + "\n" + "3 - multi" + "\n" +
                        "4 - delenie" + "\n" + "5 - cos" + "\n" + "6 - sin" + "\n" + "7 - history" + "\n" + "0 - Exit");
                switch (consoleReader.readInt()) {
                    case 0:
                        return;
                    case 1:
                        a = getNumber("Enter number 1");
                        b = getNumber("Enter number 2");
                        double sum = calculator.sum(a, b);
                        consoleWriter.writeString("Result " + sum);
                    calculatorV2.historyAdd(a,b);
                    calculatorV2.historyAdd(sum);
                        break;
                    case 2:
                        a = getNumber("Enter number 1");
                        b = getNumber("Enter number 2");
                        double minus = calculator.minus(a, b);
                        consoleWriter.writeString("Result " + minus);
                    calculatorV2.historyAdd(a,b);
                    calculatorV2.historyAdd(minus);
                        break;
                    case 3:
                        a = getNumber("Enter number 1");
                        b = getNumber("Enter number 2");
                        double multi = calculator.multi(a, b);
                        consoleWriter.writeString("Result " + multi);
                    calculatorV2.historyAdd(a,b);
                    calculatorV2.historyAdd(multi);
                        break;
                    case 4:
                        a = getNumber("Enter number 1");
                        b = getNumber("Enter number 2");
                        double delenie = calculator.delenie(a, b);
                        consoleWriter.writeString("Result " + delenie);
                    calculatorV2.historyAdd(a,b);
                    calculatorV2.historyAdd(delenie);
                        break;
                    case 5:
                        a = getNumber("Enter number");
                        double cos = calculator.cos(a);
                        consoleWriter.writeString("Result " + cos);
                    calculatorV2.historyAdd(a);
                    calculatorV2.historyAdd(cos);
                        break;
                    case 6:
                        a = getNumber("Enter number");
                        double sin = calculator.sin(a);
                        consoleWriter.writeString("Result " + sin);
                    calculatorV2.historyAdd(a);
                    calculatorV2.historyAdd(sin);
                        break;
                case 7:
                    consoleWriter.writeString("Choose operation: " + "\n" + "1 - read history" + "\n" + "2 - clear history");
                    switch (consoleReader.readInt()) {
                        case 0:
                            return;
                        case 1:
                            for (int i = 0; i < calculatorV2.history.size(); i++) {
                                System.out.println(calculatorV2.history.get(i));
                            }
                            consoleWriter.writeString("Done");
                            break;
                        case 2:
                            calculatorV2.history.clear();
                            consoleWriter.writeString("Done");
                            break;
                    }
                    break;
                }
            }
        }
    }

    private double getNumber(String s) {
        consoleWriter.writeString(s);
        return consoleReader.readDouble();
    }

    private void menu() {
        consoleWriter.writeString("Welcome");
    }
}

