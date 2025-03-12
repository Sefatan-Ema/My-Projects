package com.frontend.frontenddemo.Repository;

import com.frontend.frontenddemo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>

{

}