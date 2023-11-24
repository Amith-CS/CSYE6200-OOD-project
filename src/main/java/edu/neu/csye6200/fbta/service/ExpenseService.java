package edu.neu.csye6200.fbta.service;

import edu.neu.csye6200.fbta.dto.ExpenseUnequal;
import edu.neu.csye6200.fbta.model.Expense;

public interface ExpenseService {
    Expense getExpenseById(int expenseId);

    void createExpenseEqually(Expense expense);

    void createExpenseUnequally(ExpenseUnequal expenseUnequal);

    Expense updateExpense(int expenseId, Expense expense);

    void deleteExpense(int expenseId);
}
