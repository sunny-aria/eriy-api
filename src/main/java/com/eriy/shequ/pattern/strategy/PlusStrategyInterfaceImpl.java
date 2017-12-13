package com.eriy.shequ.pattern.strategy;

/**
 * 加运算
 *
 * @author sunny
 * @create 2017/11/24 14:26
 **/
public class PlusStrategyInterfaceImpl extends ActiveParent implements StrategyInterface<PlusActive> {
    /**
     * a与b的运算，a+b
     *
     * @param a 入参
     * @param b 入参
     * @return 结果
     */
    @Override
    public int Calculation(int a, int b) {
        return a+b;
    }

    @Override
    public int messageBusiness(PlusActive sub) {
        System.out.println(sub);
        return 0;
    }
}
