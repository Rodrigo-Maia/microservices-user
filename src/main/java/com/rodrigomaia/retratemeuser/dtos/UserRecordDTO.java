package com.rodrigomaia.retratemeuser.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRecordDTO(
        @NotBlank
        String name,
        Integer level,
        Boolean isActive,
        @Email
        @NotBlank
        String email,
        String city,
        Integer areaCode,
        String phone,
        String cnpj,
        String bankNumber,
        String agenceNumber,
        String bankType,
        String numberAcc,
        String instagram,
        String twitter,
        String facebook
) {}