package com.gm222.server.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "operation_logs")
@Getter
@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class operation_logs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private final Long user_id;
    private final String action;
    private final Long target_id;
    private final String target_type;
    private final String client_type;
    private final String ip_address;
    private final LocalDateTime created_at;
}
