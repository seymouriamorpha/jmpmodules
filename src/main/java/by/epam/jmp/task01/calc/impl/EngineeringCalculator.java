package by.epam.jmp.task01.calc.impl;

import by.epam.jmp.task01.calc.Operation;

/**
 * @author Eugene_Kortelyov on 2/8/2017.
 */
public class EngineeringCalculator extends SimpleCalculator {

    @Override
    public double perform(Operation operation, double operand1, double operand2) {
        switch (operation) {
            case COS:
                return Math.sin(operand1);
            case EXP:
                return Math.exp(operand1);
            case SQRT:
                return Math.sqrt(operand1);
            default:
                return super.perform(operation, operand1, operand2);
        }
    }

}
