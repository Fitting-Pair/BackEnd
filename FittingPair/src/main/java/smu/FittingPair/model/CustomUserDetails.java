package smu.FittingPair.model;

import jakarta.persistence.Entity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class CustomUserDetails implements UserDetails {
    private final Users users;

    public CustomUserDetails(Users users) {
        this.users = users;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        users.getRoles().forEach(e -> authorities.add(() -> String.valueOf(e)));
        return authorities;
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() { return Long.toString(users.getId());}

}
