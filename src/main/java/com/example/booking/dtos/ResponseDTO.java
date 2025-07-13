package com.example.booking.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ResponseDTO<T> {
    private int code;
    private String message;
    private T data;
}
