package com.locacaoveiculos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ParkingNotException extends RuntimeException {

    public ParkingNotException(String id) {
        super("Parking not found id: " + id);
    }
}
