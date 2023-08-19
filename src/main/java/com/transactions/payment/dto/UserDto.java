package com.transactions.payment.dto;

import com.transactions.payment.model.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Setter
@Getter
public class UserDto {

    private Long id;
    private String username;
    private String email;
    private String password;
    private String confirmPassword;
    private boolean isAccountVerified;
    private Set<Role> roles = new HashSet<>();
}
