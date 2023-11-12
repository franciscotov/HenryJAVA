package integrativeProject.interfaces;

import integrativeProject.exceptions.InvalidExpenseException;

public interface ExpenseAmountValidator {

    boolean validateAmount(Float amount) throws InvalidExpenseException;
}
