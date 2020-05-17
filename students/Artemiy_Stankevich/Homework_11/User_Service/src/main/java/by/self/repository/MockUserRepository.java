package by.self.repository;


import by.self.bean.User;

import java.sql.SQLException;

public class MockUserRepository extends UserRepository {

    private boolean isMockTriggered = false;

    public boolean isMockTriggered() {
        return isMockTriggered;
    }

    public void setMockTriggered(boolean mockTriggered) {
        isMockTriggered = mockTriggered;
    }

    @Override
    public int save(User user) throws SQLException {
        setMockTriggered(true);
        return super.save(user);
    }
}
