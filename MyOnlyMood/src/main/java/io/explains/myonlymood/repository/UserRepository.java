package io.explains.myonlymood.repository;

import io.explains.myonlymood.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);

}