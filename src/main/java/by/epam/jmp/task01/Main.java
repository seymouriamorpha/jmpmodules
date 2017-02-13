package by.epam.jmp.task01;

import by.epam.jmp.task01.calc.AbstractCalculator;
import by.epam.jmp.task01.calc.impl.factory.CalculatorFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Eugene_Kortelyov on 2/7/2017.
 */
public class Main {

    public static void main(String[] args) {
        List<String> data = readFile(args[0]);

        int calculatorType = Integer.parseInt(data.get(0));
        data.remove(0);

        AbstractCalculator calculator = CalculatorFactory.getCalculator(calculatorType);
        double result = calculator.performBatch(data);

        System.out.println("result: " + result);
    }

    private static List<String> readFile(String file) {
        List<String> data = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(file))) {
            while (scanner.hasNextLine()) {
                data.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file");
        }
        return data;
    }

}
