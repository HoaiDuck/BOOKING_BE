package com.example.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {
    CUSTOMER("Khách hàng"), PARTNER("Người hợp tác"), ADMIN("Quản trị viên");
    private final String displayName;
}
