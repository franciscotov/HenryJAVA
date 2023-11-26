package integrativeProject.interfaces.implementation;

import integrativeProject.entities.Expense;
import integrativeProject.interfaces.ExpenseStorage;

import java.util.*;

public class ExpenseStorageImpl implements ExpenseStorage {

    List<Expense> expenses = new ArrayList<>();
    Map<String, Integer> counterCategory = new HashMap<>();
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

    public void printExpenses() {
        this.expenses.forEach(System.out::println);
    }

    @Override
    public void updateCounterCategory(String key){
        counterCategory.put(key, counterCategory.getOrDefault(key, 0) + 1);
    }

    @Override
    public void printCounterCategory(){
        counterCategory.forEach((key, value) -> System.out.println("Category " + key + ": " + value));
    }
}
