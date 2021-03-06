package com.eriy.shequ.pattern.strategy;

/**
 * 乘法运算
 *
 * @author sunny
 * @create 2017/11/24 14:29
 **/
public class MultiplyStrategyInterfaceImpl extends ActiveParent implements StrategyInterface<MultiplyActive> {
    /**
     * a与b的运算，
     *
     * @param a 入参
     * @param b 入参
     * @return 结果
     */
    @Override
    public int Calculation(int a, int b) {
        return a*b;
    }

    @Override
    public int messageBusiness(MultiplyActive sub) {
        System.out.println(sub);
        return 0;
    }
}
