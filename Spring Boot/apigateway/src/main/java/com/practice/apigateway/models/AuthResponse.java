package com.practice.apigateway.models;

import lombok.*;

import java.util.Collection;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AuthResponse {

    private String userId;
    private String accessToken;
    private String refreshToken;
    private Long expireAt;

    private Collection<String> authorities;
}
