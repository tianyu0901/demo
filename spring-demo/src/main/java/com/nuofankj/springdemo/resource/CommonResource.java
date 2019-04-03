package com.nuofankj.springdemo.resource;

import com.nuofankj.springdemo.anno.Id;
import com.nuofankj.springdemo.anno.PostInit;
import com.nuofankj.springdemo.anno.Resource;
import com.nuofankj.springdemo.resource.bean.*;
import com.nuofankj.springdemo.support.PolyObjectMapper;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Resource
public class CommonResource {

    @Id
    private int id;

    // 简单例子
    private Test2Bean test2Bean;

    // 基础结构
    private Test1Bean test1Bean;

    // 对象数组
    private Test2BeanArray[] test2Array;

    // 多态&预处理
    private List<ActivityRewardCondition> conditionRewards;

    // map
    private Map<Integer, Test2Bean> test3Map;

    // 消耗
    private IConsume consume;

    // 属性
    private List<ImmutableAttribute> attributes;

    // 掉落
    private Test4Bean effect;

    // 掉落 多态
    private PolyObjectMapper odd4;

    // json数组注入[字段需要实现set函数]
    private Test3Bean[] bean;

    // 私有解析
    private Test5Bean test5Bean;

    // 发奖
    private RewardDef[] rankReward;

    // 枚举
    private Test6Bean test6Bean;

    @PostInit
    public void init() {
        System.out.println("------------------postInit注解调用------------------");
    }

    @Override
    public String toString() {
        return "CommonResource{" +
                "id=" + id +
                ", test2Bean=" + test2Bean +
                ", test1Bean=" + test1Bean +
                ", test2Array=" + Arrays.toString(test2Array) +
                ", conditionRewards=" + conditionRewards +
                ", test3Map=" + test3Map +
                ", consume=" + consume +
                ", attributes=" + attributes +
                ", effect=" + effect +
                ", odd4=" + odd4 +
                ", bean=" + Arrays.toString(bean) +
                ", test5Bean=" + test5Bean +
                ", rankReward=" + Arrays.toString(rankReward) +
                ", test6Bean=" + test6Bean +
                '}';
    }
}