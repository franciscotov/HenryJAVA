package integrativeProject.interfaces;

import integrativeProject.classes.Category;

import java.util.Date;

public interface Expense {

    Category getCategory();
    Float getAmount();
    Date getDate();
    Float getAmountByCategory(Expense expense);
}
