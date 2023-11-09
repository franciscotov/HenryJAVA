package integrativeProject;

import integrativeProject.entities.Expense;
import integrativeProject.entities.ExpenseCategory;
import integrativeProject.interfaces.implementation.ExpenseStorageImpl;
import integrativeProject.interfaces.implementation.IdGeneratorImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    // usar metodo para pedir datos al usuario
    //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long expenseQuantity = 0L;
        IdGeneratorImpl idGenerator = new IdGeneratorImpl();
        IdGeneratorImpl idGeneratorCategory = new IdGeneratorImpl();
        ExpenseStorageImpl expenseStorage = new ExpenseStorageImpl();
        boolean isWrongType;
        do {
            System.out.print("Please enter the expense quantity: ");
            if(scanner.hasNextInt()){
                expenseQuantity = scanner.nextLong();
                isWrongType = false;
            } else {
                isWrongType = true;
                scanner.nextLine();
                System.out.println("Please enter a correct value");
            }
        } while (isWrongType);

        do {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Long id = idGenerator.generateId();
            Long categoryId = idGeneratorCategory.generateId();

            // Expense amount
            System.out.print("Please enter the Expense " + id + " amount: ");
            Float amount = scanner.nextFloat();
            scanner.nextLine();

            // ExpenseCategory name
            System.out.print("Please enter the category " + categoryId + " name: ");
            String name = scanner.nextLine();

            // Expense date
            System.out.print("Please enter the Expense " + id + " date in format dd/MM/yyyy: ");
            String dateString = scanner.nextLine();

            // Category
            ExpenseCategory category = new ExpenseCategory(categoryId, name);
            // Expense
            try {
                Expense expense = new Expense(id, amount, dateFormat.parse(dateString), category);
                expenseStorage.addExpense(expense, id);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            expenseQuantity--;
        } while (expenseQuantity > 0);
    }
}
