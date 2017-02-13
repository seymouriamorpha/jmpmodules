package by.epam.jmp.task01.calc.impl.factory;

import by.epam.jmp.task01.calc.AbstractCalculator;
import by.epam.jmp.task01.calc.impl.CalculatorWithMemoryCell;
import by.epam.jmp.task01.calc.impl.EngineeringCalculator;
import by.epam.jmp.task01.calc.impl.SimpleCalculator;

/**
 * @author Eugene_Kortelyov on 2/8/2017.
 */
public class CalculatorFactory {

    public static AbstractCalculator getCalculator(int typeCalculator) {
        AbstractCalculator calculator;
        switch (typeCalculator) {
            case 1:
                calculator = new SimpleCalculator();
                break;
            case 2:
                calculator = new CalculatorWithMemoryCell(new SimpleCalculator());
                break;
            case 3:
                calculator = new EngineeringCalculator();
                break;
            case 4:
                calculator = new CalculatorWithMemoryCell(new EngineeringCalculator());
                break;
            default:
                throw new IllegalArgumentException();
        }
        return calculator;
    }

}
