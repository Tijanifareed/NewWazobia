package com.africa.semicolon.wazobia_app.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginAdminRequest {
    private String email;
    private String password;
}
