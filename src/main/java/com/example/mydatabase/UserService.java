package com.example.mydatabase;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> getUsers(Pageable pageable) {
        Page<User> all = userRepository.findAll(pageable);

        return all.get()
                .map(user -> new UserDTO(user.getUsername(), user.getEmail(), user.getDate().toLocalDateTime()))
                .collect(Collectors.toList());
    }
}
