package com.epam.mjc.io;

import java.io.IOException;

public class FileNonExistException extends RuntimeException {
    public FileNonExistException() {
        super("Не верный путь к файлу или не существует");
    }
}
