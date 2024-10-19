package com.jwt_authentication.dto.auth;

import lombok.*;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class AuthenticationResponse {
    private String token;
}
