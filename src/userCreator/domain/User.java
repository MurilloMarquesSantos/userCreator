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

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void createNewUser(String name, String userEmail, String password) throws Exception {
        if (!userEmail.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new Exception("Invalid email address");
        }
        if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")) {
            throw new Exception("""
                    The password must contain:\

                    At least one lowercase letter\

                    At least one uppercase letter\

                    At least one digit\

                    At least one special character\

                    Minimum length of 8 characters""");
        }
        User newUser = new User(name, userEmail, password);
        for (User user : userDataBase.userDB) {
            if (newUser.getUserEmail().equalsIgnoreCase(user.getUserEmail())){
                throw new AlreadyExists();
            }
        }


        userDataBase.userDB.add(newUser);


    }

    public static void showUsers() {
        for (User user : userDataBase.userDB) {
            System.out.println(user);

        }
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
