package com.gm222.server.model.entity;

import com.gm222.server.model.enums.users.*;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password_hash;
    private Role role;
    private long total_capacity;
    private long used_capacity;
    private Status status;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
