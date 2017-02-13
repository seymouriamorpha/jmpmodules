package by.epam.jmp.task01.calc;

import java.util.List;

/**
 * @author Eugene_Kortelyov on 2/8/2017.
 */
public interface Calculate {

    double perform(Operation operation, double operand1, double operand2);

    double performBatch(List<String> data);

}
