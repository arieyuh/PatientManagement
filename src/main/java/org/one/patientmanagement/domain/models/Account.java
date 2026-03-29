package org.one.patientmanagement.domain.models;

import java.time.LocalDateTime;
import org.one.patientmanagement.domain.enums.Role;

public record Account(
        long id,
        String password,
        Role role,
        LocalDateTime createdAt
) {}
