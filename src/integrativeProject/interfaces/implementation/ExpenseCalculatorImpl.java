package integrativeProject.interfaces.implementation;

import integrativeProject.entities.ExpenseCategory;
import integrativeProject.entities.Expense;
import integrativeProject.interfaces.ExpenseCalculator;

public class ExpenseCalculatorImpl implements ExpenseCalculator {

    @Override
    public Float getAmount(Expense expense) {
        return expense.getAmount();
    }

    @Override
    public Float getAmountByCategory(Expense[] expenses, ExpenseCategory category) {
        Float totalExpense = 0F;
        for(Expense expense: expenses){
            if(expense.getCategory() != null &&  expense.getCategory().getId() == category.getId()){
                totalExpense += expense.getAmount();
            }
        }
        return totalExpense;
    }

    @Override
    public Float getTotalAmount(Expense[] expenses) {
        Float totalExpense = 0F;
        for(Expense expense: expenses) {
            totalExpense += expense.getAmount();
        }
        return totalExpense;
    }
}
