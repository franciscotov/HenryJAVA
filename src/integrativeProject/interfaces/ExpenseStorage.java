package integrativeProject.interfaces;

import integrativeProject.entities.Expense;

@FunctionalInterface
public interface ExpenseStorage {
    void addExpense(Expense expense, Long index);
}
