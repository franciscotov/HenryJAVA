package integrativeProject.interfaces;

import integrativeProject.entities.ExpenseCategory;
import integrativeProject.entities.Expense;

public interface ExpenseCalculator {

    Float getAmount(Expense expense);
    Float getAmountByCategory(Expense[] expense, ExpenseCategory category);

    Float getTotalAmount(Expense[] expense);
}
