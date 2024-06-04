package project.deployone.service;

import org.springframework.stereotype.Service;
@Service
public interface NumberService {

    Long add(int num1, int num2);

    Long minus(int num1, int num2);
}
