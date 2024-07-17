package userCreator.domain;

import userCreator.exceptions.AlreadyExists;

import java.util.ArrayList;
import java.util.List;

class userDataBase {
    static List<User> userDB = new ArrayList<>();
}

public class User {
    private String username;
    private String userEmail;
    private String password;

    public User(String username, String userEmail, String password) {
        this.username = username;
        this.userEmail = userEmail;
        this.password = password;
    }

    public static void createNewUser(String name, String userEmail, String password) throws AlreadyExists {
        User newUser = new User(name, userEmail, password);
        for (User user : userDataBase.userDB) {
            if (user.getUserEmail().equalsIgnoreCase(newUser.getUserEmail())) {
                throw new AlreadyExists();
            }
        }
        userDataBase.userDB.add(newUser);


    }

    public String getUsername() {
        return username;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getPassword() {
        return password;
    }
}
