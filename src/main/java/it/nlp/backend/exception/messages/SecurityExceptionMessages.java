package it.nlp.backend.exception.messages;

public enum SecurityExceptionMessages {
    BAD_CREDENTIALS("Entered credentials are invalid"),
    INVALID_EMAIL_ADDRESS("Email address is invalid"),
    INVALID_PASSWORD("Password must be at least 6 characters"),
    EMAIL_ALREADY_TAKEN("There already exists user with entered email: "),
    NO_USER_WITH_PASSED_EMAIL("User with entered email was not found: "),
    TOKEN_DOES_NOT_EXIST("Entered token does not exist: "),
    INVALID_REFRESH_TOKEN("Entered refresh token is invalid: ");

    private final String message;

    SecurityExceptionMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
