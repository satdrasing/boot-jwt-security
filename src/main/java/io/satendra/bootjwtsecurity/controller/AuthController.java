package io.satendra.bootjwtsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.satendra.bootjwtsecurity.dto.JwtAuthenticationResponse;
import io.satendra.bootjwtsecurity.dto.LoginRequest;
import io.satendra.bootjwtsecurity.config.JwtTokenProvider;

@RestController
@RequestMapping("/api/auth")
public class AuthController
{
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider tokenProvider;

    @PostMapping("/signin")
    public JwtAuthenticationResponse authenticateUser(@RequestBody LoginRequest loginRequest)
    {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = tokenProvider.generateToken(authentication);

        return new JwtAuthenticationResponse(jwt);
    }
}
