package app.finance.infrastructure.database;

import app.finance.bussiness.dao.UserAppDAO;
import app.finance.infrastructure.database.entity.UserAppEntity;
import app.finance.infrastructure.database.jpa.UserAppJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class UserAppRepository implements UserAppDAO {

    private final UserAppJpaRepository userAppJpaRepository;

    @Override
    public UserAppEntity saveUserAccount(UserAppEntity userAppEntity) {
        return userAppJpaRepository.saveAndFlush(userAppEntity.withActive(true));
    }
}
