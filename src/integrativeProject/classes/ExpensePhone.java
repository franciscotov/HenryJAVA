package integrativeProject.classes;

import integrativeProject.interfaces.Expense;

import java.util.Date;

public class ExpensePhone implements Expense {
    @Override
    public Category getCategory() {
        return null;
    }

    @Override
    public Float getAmount() {
        return null;
    }

    @Override
    public Date getDate() {
        return null;
    }

    @Override
    public Float getAmountByCategory(Expense expense) {
        return null;
    }
}
