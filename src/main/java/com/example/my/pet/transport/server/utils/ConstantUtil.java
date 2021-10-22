package com.example.my.pet.transport.server.utils;

import org.springframework.util.StringUtils;

public class ConstantUtil {

    public static final class orderStatus{

        /**
         * 待揽件
         */
        public static final Integer waitPickup = 1;

        /**
         * 已揽件
         */
        public static final Integer taken = 2;

        /**
         * 已取消
         */
        public static final Integer cancel = 3;

        /**
         * 派送中
         */
        public static final Integer delivering = 4;

        /**
         * 已完成
         */
        public static final Integer done = 5;
    }

    public static String genOrderStatusDesc(Integer orderStatus){
        if (orderStatus == null){
            return "null";
        }
        switch (orderStatus.intValue()){
            case 1:
                return "待揽件";
            case 2:
                return "已揽件";
            case 3:
                return "已取消";
            case 4:
                return "派送中";
            case 5:
                return "已完成";
            default:
                return String.valueOf(orderStatus);
        }
    }

    public static final class waybillStatus{

        /**
         * 待派送
         */
        public static final Integer waitDelivery = 1;

        /**
         * 派送中
         */
        public static final Integer delivering = 2;

        /**
         * 已签收
         */
        public static final Integer received = 3;
    }

    public static String genWaybillStatusDesc(Integer waybillStatus){
        if (waybillStatus == null){
            return "null";
        }
        switch (waybillStatus.intValue()){
            case 1:
                return "待派送";
            case 2:
                return "派送中";
            case 3:
                return "已签收";
            default:
                return String.valueOf(waybillStatus);
        }
    }

    public static final class waybillNodeStatus{

        /**
         * 待派送
         */
        public static final Integer taken = 1;

        /**
         * 派送中
         */
        public static final Integer delivering = 2;

        /**
         * 已签收
         */
        public static final Integer received = 3;
    }

    public static String genWaybillNodeStatusDesc(Integer waybillNodeStatus){
        if (waybillNodeStatus == null){
            return "null";
        }
        switch (waybillNodeStatus.intValue()){
            case 1:
                return "已揽件";
            case 2:
                return "运输中";
            case 3:
                return "已签收";
            default:
                return String.valueOf(waybillNodeStatus);
        }
    }
}
