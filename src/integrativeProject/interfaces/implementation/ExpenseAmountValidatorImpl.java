package integrativeProject.interfaces.implementation;

import integrativeProject.exceptions.InvalidExpenseException;
import integrativeProject.interfaces.ExpenseAmountValidator;

public class ExpenseAmountValidatorImpl implements ExpenseAmountValidator {
    @Override
    public boolean validateAmount(Float amount) throws InvalidExpenseException {
        if(amount < 0) {
            throw new InvalidExpenseException("Invalid amount, it's should be greather than zero");
        }
        return true;
    }
}
