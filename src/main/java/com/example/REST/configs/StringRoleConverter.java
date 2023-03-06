package com.example.REST.configs;

import com.example.REST.model.Role;
import org.springframework.core.convert.converter.Converter;

public class StringRoleConverter implements Converter<String, Role> {

    @Override
    public Role convert(String id) {
        Role role = new Role();
        role.setId(Integer.valueOf(id));
        return role;
    }
}
