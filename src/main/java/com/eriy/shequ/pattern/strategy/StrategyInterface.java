package com.eriy.shequ.pattern.strategy;

/**
 * 策略接口
 *
 * @author sunny
 * @create 2017/11/24 14:24
 **/
public interface StrategyInterface<T extends ActiveParent> {


    /**
     * a与b的运算，a+b a-b a/b a*b
     * @param a  入参
     * @param b  入参
     * @return 结果
     */
    int Calculation(int a,int b);


     int  messageBusiness(T sub);

}
