package org.one.patientmanagement.domain.models;

public record Doctor(
        long id,
        Long accountId,
        String name
) {}