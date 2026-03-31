package org.one.patientmanagement.domain.models;

import java.time.LocalDateTime;

/**
 * Represents an attachment of any file.
 * 
 * @param data any file, a blob in the database. 
 */
public record Attachment(
        long id,
        byte[] data,
        String name,
        Long doctorId,
        Long patientId,
        LocalDateTime createdAt
) {
    public Attachment {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("data is required");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is required");
        }
        if (createdAt == null) {
            throw new IllegalArgumentException("createdAt is required");
        }

        if ((doctorId == null || doctorId <= 0) &&
            (patientId == null || patientId <= 0)) {
            throw new IllegalArgumentException(
                "Either doctorId or patientId must be provided"
            );
        }
    }
}