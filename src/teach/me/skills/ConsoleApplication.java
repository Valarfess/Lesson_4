package teach.me.skills;

import java.util.ArrayList;

public class ConsoleApplication {
    private Calculator calculator = new Calculator();
    private ConsoleReader consoleReader = new ConsoleReader();
    private ConsoleWriter consoleWriter = new ConsoleWriter();

    public void run() {
        menu();

        ArrayList history = new ArrayList();

        while (true) {
            consoleWriter.writeString("Choose operation: " + "\n" + "1 - sum" + "\n" + "2 - minus" + "\n" + "3 - multi" + "\n" +
                    "4 - delenie" + "\n" + "5 - cos" + "\n" + "6 - sin" + "\n" + "7 - history" + "\n" + "0 - Exit");
            switch (consoleReader.readInt()) {
                case 0:
                    return;
                case 1:
                    double a = getNumber("Enter number 1");
                    double b = getNumber("Enter number 2");
                    double sum = calculator.sum(a, b);
                    consoleWriter.writeString("Result " + sum);
                    history.add(a);
                    history.add(b);
                    history.add(sum);
                    break;
                case 2:
                    double c = getNumber("Enter number 1");
                    double d = getNumber("Enter number 2");
                    double minus = calculator.minus(c, d);
                    consoleWriter.writeString("Result " + minus);
                    history.add(c);
                    history.add(d);
                    history.add(minus);
                    break;
                case 3:
                    double e = getNumber("Enter number 1");
                    double f = getNumber("Enter number 2");
                    double multi = calculator.multi(e, f);
                    consoleWriter.writeString("Result " + multi);
                    history.add(e);
                    history.add(f);
                    history.add(multi);
                    break;
                case 4:
                    double g = getNumber("Enter number 1");
                    double h = getNumber("Enter number 2");
                    double delenie = calculator.delenie(g, h);
                    consoleWriter.writeString("Result " + delenie);
                    history.add(g);
                    history.add(h);
                    history.add(delenie);
                    break;
                case 5:
                    double num1 = getNumber("Enter number");
                    double cos = calculator.cos(num1);
                    consoleWriter.writeString("Result " + cos);
                    history.add(num1);
                    history.add(cos);
                    break;
                case 6:
                    double num2 = getNumber("Enter number");
                    double sin = calculator.sin(num2);
                    consoleWriter.writeString("Result " + sin);
                    history.add(num2);
                    history.add(sin);
                    break;
                case 7:
                    consoleWriter.writeString("Choose operation: " + "\n" + "1 - read history" + "\n" + "2 - clear history");
                    switch (consoleReader.readInt()) {
                        case 0:
                            return;
                        case 1:
                            for (int i = 0; i < history.size(); i++) {
                                System.out.println(history.get(i));
                            }
                            consoleWriter.writeString("Done");
                            break;
                        case 2:
                            history.clear();
                            consoleWriter.writeString("Done");
                            break;
                    }
                    break;
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

