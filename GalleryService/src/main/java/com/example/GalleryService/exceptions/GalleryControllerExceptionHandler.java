package com.example.GalleryService.exceptions;

import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;

@Log4j
@ControllerAdvice
public class GalleryControllerExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(GalleryControllerExceptionHandler.class);

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public void handleNotFound(HttpClientErrorException.NotFound) {
        logger.error("Requested resource not found");
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public void handleGeneralError(Exception ex) {
        logger.error("Exception occured" + ex);
    }

}
