package com.uet.microservices.limitsservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LimitConfiguration {
    private int maximum;
    private int minimum;
}
