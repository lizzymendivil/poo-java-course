package com.jalasoft.project.exception;

/**
 * @author Lizzy Mendivil
 * @version 1.1
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
