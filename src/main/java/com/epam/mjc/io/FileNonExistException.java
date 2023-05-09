package com.epam.mjc.io;


public class FileNonExistException extends RuntimeException {
    public FileNonExistException() {
        super("Не верный путь к файлу или не существует");
    }
}
