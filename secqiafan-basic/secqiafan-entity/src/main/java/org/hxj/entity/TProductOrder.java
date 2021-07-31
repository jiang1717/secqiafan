package org.hxj.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * -- 秒杀成功明细表
 * -- 用户登录认证相关的信息
 * create table product_order(
 * `order_id` bigint not null AUTO_INCREMENT COMMENT '订单id', -- 自增
 * `product_id` bigint not null COMMENT '商品库存id',
 * `user_phone` bigint not null COMMENT '用户手机号',
 * `state` tinyint not null DEFAULT -1 COMMENT '状态标识：-1：无效 0：成功 1：已付款 2：已发货',
 * `create_time` timestamp not null COMMENT '创建时间',
 * PRIMARY KEY (order_id), -- 联合主键
 * key idx_create_time(create_time)
 * )ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';
 *
 */

public class TProductOrder implements Serializable {

    private long orderId;

    private long productId;

    private long userPhone;

    private short state;

    private Date createTime;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
