package ru.liapkin.springbooturfu.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.liapkin.springbooturfu.exception.ValidationFailedException;

@Service
public interface ValidationService {

    void isValid(BindingResult bindingResult) throws ValidationFailedException;

}
