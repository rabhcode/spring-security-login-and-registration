package com.rabhcode.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(String token);

}
