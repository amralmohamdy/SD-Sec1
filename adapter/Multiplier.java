/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.math.BigDecimal;

/**
 *
 * @author Dell
 */
public class Multiplier implements MultiplyInterface{

    @Override
    public BigDecimal multiply(BigDecimal num,BigDecimal num2) {
        BigDecimal result = num.multiply(num2);
        return result;
    }


    
}
