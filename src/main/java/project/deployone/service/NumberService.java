package project.deployone.service;

import org.springframework.stereotype.Service;
import project.deployone.dto.response.NumberRes;

import java.util.List;

@Service
public interface NumberService {

    Long add(int num1, int num2);

    Long minus(int num1, int num2);

    List<NumberRes> res();
}
