package model.infrastucture.Exception;

public class EntityNotFoundException extends Exception {
    public EntityNotFoundException (String message){
        super(message);
    }
    public EntityNotFoundException (String message, Throwable error){
        super (message, error);
    }
}

