package integrativeProject.interfaces;

import integrativeProject.entities.ExpenseCategory;
import integrativeProject.entities.Expense;

import java.util.List;

public interface ExpenseCalculator {

    Float getAmount(Expense expense);
    Float getAmountByCategory(List<Expense> expense, ExpenseCategory category);

    Float getTotalAmount(List<Expense> expense);
}
