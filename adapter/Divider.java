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
class Divider implements DividerInterface{
 
    @Override
    public BigDecimal divide(BigDecimal num1, BigDecimal num2) {
        BigDecimal result = num1.divide(num2);
        return result;
    }
}
