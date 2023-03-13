package com.example.REST.service;

import com.example.REST.dao.*;
import com.example.REST.model.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDaoImpl roleDaoImpl;

    public RoleServiceImpl(RoleDaoImpl roleDaoImpl) {
        this.roleDaoImpl = roleDaoImpl;
    }


    @Override
    @Transactional
    public boolean add(Role role) {
        roleDaoImpl.add(role);
        return true;
    }

    @Override
    public List<Role> getList() {
        return roleDaoImpl.getList();
    }

    @Override
    public Role getRole(Long id) {
        return roleDaoImpl.getRole(id);
    }

    @Override
    @Transactional
    public void deleteRole(Long id) {
        roleDaoImpl.deleteRole(id);
    }

    @Override
    @Transactional
    public void editRole(Role role) {
        roleDaoImpl.editRole(role);
    }

    @Override
    public List<Role> listByRole(List<String> name) {
        return roleDaoImpl.listByName(name);
    }
}