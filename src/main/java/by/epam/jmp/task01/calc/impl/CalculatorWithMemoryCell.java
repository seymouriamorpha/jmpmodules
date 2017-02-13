package by.epam.jmp.task01.calc.impl;

import by.epam.jmp.task01.calc.AbstractCalculator;
import by.epam.jmp.task01.calc.MemoryCell;
import by.epam.jmp.task01.calc.Operation;

/**
 * @author Eugene_Kortelyov on 2/8/2017.
 */
public class CalculatorWithMemoryCell extends AbstractCalculator {

    private MemoryCell memoryCell;
    private SimpleCalculator calculator;

    public CalculatorWithMemoryCell(SimpleCalculator calculator) {
        this.memoryCell = new MemoryCell();
        this.calculator = calculator;
    }

    public double perform(Operation operation, double operand1, double operand2) {
        double result = operand1;
        switch (operation) {
            case MEMORY_SAVE:
                memoryCell.setCell(operand1);
                break;
            case MEMORY_INCREASE:
                memoryCell.increaseCell(operand1);
                break;
            case MEMORY_DECREASE:
                memoryCell.decreaseCell(operand1);
                break;
            case MEMORY_RETURN:
                result = memoryCell.getCell();
                break;
            case MEMORY_CLEAN:
                memoryCell.cleanCell();
                break;
            default:
                result = calculator.perform(operation, operand1, operand2);
        }
        return result;
    }

}
