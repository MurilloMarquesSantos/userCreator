package userCreator.validation;

public class UserPasswordRegex {
    public static void passwordCheck(String password) throws Exception {
        if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")){
        throw new Exception("""
                The password must contain:\

                At least one lowercase letter\

                At least one uppercase letter\

                At least one digit\

                At least one special character\

                Minimum length of 8 characters""");
        }
    }
}
