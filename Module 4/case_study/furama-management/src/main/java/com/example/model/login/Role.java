package com.example.model.login;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long roleId;
    private String roleName;

    @ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL)
    private Set<Username> users;

    public Role() {
    }

    public Role(Long roleId, String roleName, Set<Username> users) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.users = users;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<Username> getUsers() {
        return users;
    }

    public void setUsers(Set<Username> users) {
        this.users = users;
    }
}
