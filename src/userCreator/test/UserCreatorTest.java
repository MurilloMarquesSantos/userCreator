package userCreator.test;

import userCreator.domain.User;

public class UserCreatorTest {
    public static void main(String[] args) throws Exception {
        User.createNewUser("Murillo", "murillomarques@gmail.com", "Murillo%123");
        User.createNewUser("Pedro", "pedrohenrique@gmail.com", "Pedro&1000");
        User.createNewUser("Maria", "mariahelena@gmail.com", "Maria&100");
        User.showUsers();

    }
}
