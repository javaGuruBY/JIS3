package by.rybak.repository;

import by.rybak.bean.User;

public class MockUserRepository extends UserRepository {

    boolean isMockTriggered = false;

    public boolean isMockTriggered() {
        return isMockTriggered;
    }

    @Override
    public void save(User user) {
        if (user != null) {
            users.put(user.getId(), user);
        } else {
            log.warn("Can't save user!");
        }
        isMockTriggered = true;
    }
}
