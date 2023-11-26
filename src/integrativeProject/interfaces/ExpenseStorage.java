package integrativeProject.interfaces;

import integrativeProject.entities.Expense;

public interface ExpenseStorage {
    void addExpense(Expense expense);

    void printCounterCategory();

    void updateCounterCategory(String key);
}
