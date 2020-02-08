package cn.keepingthepiggy.leetCode;

import cn.keepingthepiggy.leetCode.testCase.Five;
import cn.keepingthepiggy.leetCode.testCase.Four;
import cn.keepingthepiggy.leetCode.testCase.Three;
import cn.keepingthepiggy.leetCode.testCase.ThreeAlter;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestMain {

    private static TestCase test = new Five();

    public static void main(String[] args) {
        ////////////////////////////////////////////////////
        test.newParam();
        test.initParam();
        ////////////////////////////////////////////////////
        LocalDateTime timeStart = LocalDateTime.now();
        System.out.println("↓↓↓↓↓↓"+ timeStart +"↓↓↓↓↓↓");
        ////////////////////////////////////////////////////
        test.test();
        ////////////////////////////////////////////////////
        LocalDateTime timeEnd = LocalDateTime.now();
        System.out.println("↑↑↑↑↑↑"+timeEnd+"↑↑↑↑↑↑");
        long usedTime = ChronoUnit.MILLIS.between(timeStart, timeEnd);
        System.out.println("******执行时间： 【"+usedTime+"】毫秒******");
    }

}
