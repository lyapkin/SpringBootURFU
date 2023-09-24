package ru.liapkin.springbooturfu.service;

import org.springframework.stereotype.Service;
import ru.liapkin.springbooturfu.model.Response;

@Service
public interface ModifyResponseService {

    Response modify(Response response);
}
