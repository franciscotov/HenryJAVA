package integrativeProject.interfaces.implementation;

import integrativeProject.entities.Expense;
import integrativeProject.interfaces.ExpenseStorage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExpenseStorageImpl implements ExpenseStorage {

    List<Expense> expenses = new ArrayList<>();
    @Override
    public void addExpense(Expense expense) {
        System.out.println(expense);
        expenses.add(expense);
    }

    public List<Expense> getExpenses() {
        return this.expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }
}
