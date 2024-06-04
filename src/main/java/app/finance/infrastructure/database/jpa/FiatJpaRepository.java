package app.finance.infrastructure.database.jpa;

import app.finance.infrastructure.database.entity.CoinEntity;
import app.finance.infrastructure.database.entity.FiatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiatJpaRepository extends JpaRepository<FiatEntity, Integer> {

}
