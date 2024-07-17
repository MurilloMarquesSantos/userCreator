package userCreator.exceptions;

public class AlreadyExists extends Exception{
    public AlreadyExists() {
        super("This email is already being used, please use another.");
    }
}
