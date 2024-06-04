package project.deployone.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.deployone.entity.Number;
import project.deployone.repo.NumberRepo;
import project.deployone.service.NumberService;
@Service
@RequiredArgsConstructor
public class NumberServiceImpl implements NumberService {
    private final NumberRepo numberRepo;

    @Override
    public Long add(int num1, int num2) {
        Number number = new Number();
        number.setOperation('+');
        number.setNum1(num1);
        number.setNum2(num2);
        numberRepo.save(number);
        return (long) (num1 + num2);
    }
}
