package project.deployone.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.deployone.dto.response.NumberRes;
import project.deployone.entity.Number;
import project.deployone.repo.NumberRepo;
import project.deployone.service.NumberService;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public Long minus(int num1, int num2) {
        Number number = new Number();
        number.setOperation('-');
        number.setNum1(num1);
        number.setNum2(num2);
        numberRepo.save(number);
        return (long) (num1 - num2);
    }

    @Override
    public List<NumberRes> res() {
        List<Number> all = numberRepo.findAll();
        List<NumberRes> res = new ArrayList<>();
        for (int i = 0; i < all.size(); i++) {
            res.add(NumberRes.builder().build());
        }
        return res;
    }
}
