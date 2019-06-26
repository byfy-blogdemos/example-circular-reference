package io.bywind.blogdemo.circularreference.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.bywind.blogdemo.circularreference.model.User;

/**
 * Created on Jun 26, 2019.
 *
 * @author hatakawas
 */
@Service
public class UserService {
    private final RoleService roleService;

    public UserService(RoleService roleService) {
        this.roleService = roleService;
    }

    public User getUser(Long userId) {
        return new User();
    }

    public List<User> listUsers(Long roleId) {
        return roleService.getRole(roleId).getUsers();
    }
}
