package project.deployone.dto.response;

import lombok.*;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NumberRes {
    private Long id;
    private int num1;
    private int num2;
    private char operation;
}
