package com.example.mydatabase;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    private Long id;
    @Column(name = "Name")
    private String username;
    @Column(name = "Email")
    private String email;
    @Column(name = "Date")
    private Timestamp date;
}
