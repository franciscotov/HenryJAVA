package integrativeProject.entities;

import java.util.Date;

public class Expense {

    public Long id;
    private Float amount;
    private Date date;
    private ExpenseCategory expenseCategory;
    public Expense() {
    }

    public Expense(Long id, Float amount, Date date, ExpenseCategory expenseCategory) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.expenseCategory = expenseCategory;
    }

    public ExpenseCategory getCategory() {
        return expenseCategory;
    }

    public void setCategory(ExpenseCategory expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private int counter(){
        return 1;
    }
}
