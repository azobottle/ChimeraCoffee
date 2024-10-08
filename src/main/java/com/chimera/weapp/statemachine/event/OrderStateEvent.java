package com.chimera.weapp.statemachine.event;

/**
 * 订单状态迁移事件
 */
public interface OrderStateEvent {
    /**
     * 订单状态事件
     */
    String getEventType();

    /**
     * 订单ID
     */
    String getOrderId();

    /**
     * 如果orderState不为空，则代表只有订单是当前状态才进行迁移
     */
    default String orderState() {
        return null;
    }
}