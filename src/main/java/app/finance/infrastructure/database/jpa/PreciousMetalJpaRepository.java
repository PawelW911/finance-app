package app.finance.infrastructure.database.jpa;

import app.finance.infrastructure.database.entity.CoinEntity;
import app.finance.infrastructure.database.entity.PreciousMetalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreciousMetalJpaRepository extends JpaRepository<PreciousMetalEntity, Integer> {

}
