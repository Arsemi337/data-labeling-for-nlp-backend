package it.nlp.backend.authentication.service;

import it.nlp.backend.authentication.dto.RefreshTokenInput;
import it.nlp.backend.authentication.dto.RefreshTokenOutput;
import it.nlp.backend.authentication.dto.UserInput;
import it.nlp.backend.authentication.dto.UserOutput;

public interface UserService {

    UserOutput signUp(UserInput userInput);

    UserOutput signIn(UserInput userInput);

    RefreshTokenOutput refreshToken(RefreshTokenInput refreshTokenInput);
}
