package ru.proselyte.mcx73app.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.proselyte.mcx73app.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
