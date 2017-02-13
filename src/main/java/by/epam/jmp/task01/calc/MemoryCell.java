package by.epam.jmp.task01.calc;

/**
 * @author Eugene_Kortelyov on 2/8/2017.
 */
public class MemoryCell {

    private double cell;

    public double getCell() {
        return cell;
    }
    public void setCell(double operand) {
        cell = operand;
    }

    public void increaseCell(double operand) {
        cell += operand;
    }

    public void decreaseCell(double operand) {
        cell -= operand;
    }

    public void cleanCell() {
        cell = 0;
    }

}
