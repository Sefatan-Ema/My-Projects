package com.frontend.frontenddemo.Service;
import com.frontend.frontenddemo.Entity.User;
import com.frontend.frontenddemo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository2;

    //post mathod
    //create product by id
    public User saveUser(User user) {
        return repository2.save(user);

    }
    public User getUser(int u_id) {
        return repository2.findById(u_id).orElse(null);

    }
    public List<User> getUsers() {
        return repository2.findAll();
    }

}
