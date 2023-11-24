package edu.neu.csye6200.fbta.service;

import edu.neu.csye6200.fbta.model.Debt;

public interface DebtService {
    Debt getDebtById(int debtId);

    Debt createDebt(Debt debt);

    Debt updateDebt(int debtId, Debt debt);

    void deleteDebt(int debtId);
}
