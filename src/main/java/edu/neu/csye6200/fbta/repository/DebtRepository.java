package edu.neu.csye6200.fbta.repository;

import edu.neu.csye6200.fbta.model.Debt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebtRepository extends JpaRepository<Debt, Integer> {
}
