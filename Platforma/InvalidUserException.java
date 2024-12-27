package Platforma;
// Përjashtimi InvalidUserException
class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}