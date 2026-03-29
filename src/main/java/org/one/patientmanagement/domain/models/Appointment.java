package org.one.patientmanagement.domain.models;

import java.time.LocalDateTime;
import org.one.patientmanagement.domain.enums.AppointmentBlock;

public record Appointment(
        long id,
        AppointmentBlock block,
        long doctorId,
        long patientId,
        String queueNumber,
        LocalDateTime createdAt
) {}