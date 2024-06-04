package app.finance.infrastructure.database.jpa;

import app.finance.infrastructure.database.entity.CoinEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinJpaRepository extends JpaRepository<CoinEntity, Integer> {

}
