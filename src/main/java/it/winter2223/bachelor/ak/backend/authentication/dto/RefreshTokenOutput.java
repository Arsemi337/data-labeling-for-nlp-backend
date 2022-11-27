package it.winter2223.bachelor.ak.backend.authentication.dto;

import lombok.Builder;

@Builder
public record RefreshTokenOutput(String userId, String idToken, String expiresIn, String refreshToken) {
}
