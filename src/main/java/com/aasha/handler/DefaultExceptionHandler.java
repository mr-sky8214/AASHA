package com.aasha.handler;

import com.mongodb.MongoWriteException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@Slf4j
public class DefaultExceptionHandler {

    @ExceptionHandler({MongoWriteException.class})
    public final ResponseEntity<String> handleDuplicateKeyException(MongoWriteException ex, WebRequest request) {
        log.error("Error occured", ex);
        if (ex.getCode() == 11000)
            return new ResponseEntity("Record Already Exist", HttpStatus.CONFLICT);
        return new ResponseEntity<>("Something went wrong", HttpStatus.BAD_GATEWAY);
    }
}
