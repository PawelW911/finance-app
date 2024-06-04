package app.finance.bussiness.dao;

import app.finance.infrastructure.database.entity.UserAppEntity;

public interface UserAppDAO {
    UserAppEntity saveUserAccount(UserAppEntity userAppEntity);
}
