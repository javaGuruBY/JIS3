package by.bariloegor.repository;

import by.bariloegor.bean.User;

public class MockUserRepository extends UserRepository{
    private boolean isMockTriggered = false;

    @Override
    public void save(User user){
        isMockTriggered = true;
    }

    public boolean isMockTriggered() {
        return isMockTriggered;
    }

    public void setMockTriggered(boolean mockTriggered) {
        isMockTriggered = mockTriggered;
    }
}
