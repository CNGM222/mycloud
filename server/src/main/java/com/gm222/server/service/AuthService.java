package com.gm222.server.service;

import com.gm222.server.model.dto.*;

public interface AuthService {
    public LoginResult login(LoginRequest loginRequest);
    public RegisterResult register(RegisterRequest registerRequest);
}
