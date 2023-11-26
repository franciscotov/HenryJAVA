package integrativeProject.interfaces.implementation;

import integrativeProject.entities.ExpenseCategory;
import integrativeProject.entities.Expense;
import integrativeProject.interfaces.ExpenseCalculator;

import java.util.List;

public class ExpenseCalculatorImpl implements ExpenseCalculator {

    @Override
    public Float getAmount(Expense expense) {
        return expense.getAmount();
    }

    @Override
    public Float getAmountByCategory(List<Expense> expenses, ExpenseCategory category) {
        return expenses.stream().reduce((a,b) -> {
            if(b.getCategory() != null &&  b.getCategory().getId() == category.getId()){
                a.setAmount(a.getAmount() + b.getAmount());
            }
            return a;
        }).get().getAmount();
    }

    @Override
    public Float getTotalAmount(List<Expense> expenses) {
        return expenses.stream().reduce((a,b) -> {
            a.setAmount(a.getAmount() + b.getAmount());
            return a;
        }).get().getAmount();
    }
}
