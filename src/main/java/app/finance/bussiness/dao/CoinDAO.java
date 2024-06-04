package app.finance.bussiness.dao;

import app.finance.infrastructure.database.entity.CoinEntity;

public interface CoinDAO {
    CoinEntity saveCoin(CoinEntity coinEntity);
}
