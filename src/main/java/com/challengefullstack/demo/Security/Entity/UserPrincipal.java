package com.challengefullstack.demo.Security.Entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UserPrincipal implements UserDetails {

    private String documento;
    private String clave;

    public UserPrincipal(String documento, String clave) {
        this.documento = documento;
        this.clave = clave;
    }

    public UserPrincipal(){}

    public static UserPrincipal build(User user){
        return new UserPrincipal(user.getDocumento(), user.getClave());
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    public String getClave() {
        return clave;
    }

    public String getDocumento(){
        return documento;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
