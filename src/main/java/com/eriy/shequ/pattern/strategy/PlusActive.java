package com.eriy.shequ.pattern.strategy;

import lombok.Data;

import java.util.List;

/**
 * 加法活动
 *
 * @author sunny
 * @create 2017/11/27 16:44
 **/
@Data
public class PlusActive extends ActiveParent {
    private List<String> list;
}
