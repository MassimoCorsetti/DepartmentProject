package model.infrastucture.data.Exception;

public class DataException extends Exception{
        public DataException(String message){
            super(message);
        }
        public DataException(String message, Throwable error){
            super(message,error);
        }

    }


