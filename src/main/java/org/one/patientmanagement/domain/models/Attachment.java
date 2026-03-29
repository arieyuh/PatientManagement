package org.one.patientmanagement.domain.models;

import java.time.LocalDateTime;
import org.one.patientmanagement.domain.enums.AttachmentStatus;

public record Attachment(
        long id,
        byte[] data,
        String name,
        Long doctorId,
        Long patientId,
        AttachmentStatus status,
        LocalDateTime createdAt
) {}
