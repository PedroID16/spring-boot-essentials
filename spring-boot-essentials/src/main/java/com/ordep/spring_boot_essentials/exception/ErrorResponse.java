package com.ordep.spring_boot_essentials.exception;

import lombok.*;

@Getter 
@Setter  
@Builder 
@AllArgsConstructor

public class ErrorResponse {
    private String message;
    private Integer status;
}
