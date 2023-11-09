package integrativeProject.interfaces.implementation;

import integrativeProject.entities.Expense;
import integrativeProject.interfaces.ExpenseStorage;

public class ExpenseStorageImpl implements ExpenseStorage {

    Expense[] expenses = new Expense[100000];
    @Override
    public void addExpense(Expense expense, Long index) {
        expenses[index.intValue()] = expense;
    }
}
