package com.gm222.server.model.entity;


import com.gm222.server.model.enums.tasks.Client_type;
import com.gm222.server.model.enums.tasks.Status;
import com.gm222.server.model.enums.tasks.Task_type;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
@Setter
@Getter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class tasks {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final long id;

    @ToString.Include @EqualsAndHashCode.Include
    private final long user_id;

    @ToString.Include @EqualsAndHashCode.Include
    private final long file_id;

    @ToString.Include @EqualsAndHashCode.Include
    private final Task_type task_type;

    @ToString.Include @EqualsAndHashCode.Include
    private final Client_type client_type;

    @ToString.Include @EqualsAndHashCode.Include
    private final Status status;

    @ToString.Include @EqualsAndHashCode.Include
    private final int progress;

    @ToString.Include @EqualsAndHashCode.Include
    private final String error_message;

    @ToString.Include @EqualsAndHashCode.Include
    private final LocalDateTime created_at;

    @ToString.Include @EqualsAndHashCode.Include
    private final LocalDateTime updated_at;
}
