package integrativeProject.interfaces.implementation;

import integrativeProject.entities.Expense;
import integrativeProject.interfaces.ExpenseStorage;

import java.util.Arrays;

public class ExpenseStorageImpl implements ExpenseStorage {

    Expense[] expenses = new Expense[100000];
    private Long index = 1L;
    @Override
    public void addExpense(Expense expense) {
        System.out.println(expense);
        this.expenses[this.index.intValue()] = expense;
        this.index++;
    }

    public Expense[] getExpenses() {
        return Arrays.copyOfRange(this.expenses, 1, index.intValue());
    }

    public void setExpenses(Expense[] expenses) {
        this.expenses = expenses;
    }
}
