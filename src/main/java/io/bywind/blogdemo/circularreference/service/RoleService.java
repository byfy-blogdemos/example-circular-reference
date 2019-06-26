package io.bywind.blogdemo.circularreference.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.bywind.blogdemo.circularreference.model.Role;

/**
 * Created on Jun 26, 2019.
 *
 * @author hatakawas
 */
@Service
public class RoleService {
    private final UserService userService;

    public RoleService(UserService userService) {
        this.userService = userService;
    }

    public Role getRole(Long roleId) {
        return new Role();
    }

    public List<Role> listRoles(Long userId) {
        return userService.getUser(userId).getRoles();
    }
}
