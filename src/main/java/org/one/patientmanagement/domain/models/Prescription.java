package org.one.patientmanagement.domain.models;

import java.time.LocalDateTime;

public record Prescription(
        long id,
        String medicationName,
        String dosage,
        String frequency,
        String duration,
        String instructions,
        long doctorId,
        long patientId,
        LocalDateTime createdAt
) {}