package com.eriy.shequ.pattern.strategy;

import lombok.Data;

/**
 * 除法活动
 *
 * @author sunny
 * @create 2017/11/27 16:42
 **/
@Data
public class DivideActive extends ActiveParent {
    private int a;
    private int b;
}
