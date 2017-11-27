package com.eriy.shequ.pattern.strategy;

import com.eriy.shequ.exception.BusinessExcetion;

/**
 * 除法运算
 *
 * @author sunny
 * @create 2017/11/24 14:31
 **/
public class DivideStrategyInterfaceImpl implements StrategyInterface<DivideActive>{
    /**
     * a与b的运算，a/b
     *
     * @param a 入参
     * @param b 入参
     * @return 结果
     */
    @Override
    public int Calculation(int a, int b) {
        if(b==0){
            throw new BusinessExcetion(40000,"除数为0");
        }
        return a/b;
    }

    @Override
    public <T> int messageBusiness(T sub) {
        if((sub instanceof DivideActive)){
            System.out.println(sub);
            return 1;
        }
        return 0;
    }
}
