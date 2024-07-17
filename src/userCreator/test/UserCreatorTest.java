package userCreator.test;

import userCreator.domain.User;

public class UserCreatorTest {
    public static void main(String[] args) throws Exception {
        User.createNewUser("Murillo", "murillomarques@gmail.com", "Murillo@2020");
        User.showUsers();

    }
}
