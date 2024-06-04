package app.finance.infrastructure.database;

import app.finance.bussiness.dao.CoinDAO;
import app.finance.infrastructure.database.entity.CoinEntity;
import app.finance.infrastructure.database.jpa.CoinJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CoinRepository implements CoinDAO {

    private final CoinJpaRepository coinJpaRepository;

    @Override
    public CoinEntity saveCoin(CoinEntity coinEntity) {
        return coinJpaRepository.saveAndFlush(coinEntity);
    }
}
