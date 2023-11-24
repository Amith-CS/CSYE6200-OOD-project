package edu.neu.csye6200.fbta.service.impl;

import edu.neu.csye6200.fbta.model.Debt;
import edu.neu.csye6200.fbta.repository.DebtRepository;
import edu.neu.csye6200.fbta.service.DebtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DebtServiceImpl implements DebtService {

    @Autowired
    private DebtRepository debtRepository;

    @Override
    public Debt getDebtById(int debtId) {
        return debtRepository.findById(debtId).orElse(null);
    }

    @Override
    public Debt createDebt(Debt debt) {
        // Implement validation or additional logic as needed
        return debtRepository.save(debt);
    }

    @Override
    public Debt updateDebt(int debtId, Debt debt) {
        // Implement validation or additional logic as needed
        debt.setId(debtId);
        return debtRepository.save(debt);
    }

    @Override
    public void deleteDebt(int debtId) {
        debtRepository.deleteById(debtId);
    }
}
