package com.example.REST.service;

import com.example.REST.model.Role;

import java.util.List;

public interface RoleService {

    boolean add(Role role);

    List<Role> getList();

    Role getRole(Long id);

    void deleteRole(Long id);

    void editRole(Role role);

    List<Role> listByRole(List<String> name);
}
