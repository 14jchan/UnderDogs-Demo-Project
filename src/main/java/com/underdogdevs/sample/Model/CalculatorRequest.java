package com.underdogdevs.sample.Model;

import lombok.*;
import org.springframework.lang.NonNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CalculatorRequest {

    @NonNull
    Integer numberOne;
    @NonNull
    Integer numberTwo;

}
