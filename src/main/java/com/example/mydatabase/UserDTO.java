package com.example.mydatabase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public record UserDTO(String username, String email, LocalDateTime date) {
}
