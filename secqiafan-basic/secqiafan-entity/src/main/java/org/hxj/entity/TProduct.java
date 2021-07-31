package org.hxj.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * CREATE TABLE product(
 * `product_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '商品库存id', -- 自增
 * `name` VARCHAR(120) NOT NULL COMMENT '商品名称',
 * `price` BIGINT(20) NOT NULL COMMENT '商品价格',
 * `sale_price` BIGINT(20) NOT NULL COMMENT '商品促销价格',
 * `number` INT NOT NULL COMMENT '库存数量',
 * `start_time` DATETIME NOT NULL COMMENT '秒杀开启时间',
 * `end_time` DATETIME NOT NULL COMMENT '秒杀结束时间',
 * -- mysql5.5 只能有一个Timestamp,将其余列类型改为datetime类型就可以解决。
 * `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
 * PRIMARY KEY (product_id),
 * KEY idx_start_time(start_time),
 * KEY idx_end_time(end_time),
 * KEY idx_create_time(create_time)
 * -- 只有InnoDB支持事务  初始化自增
 * )ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';
 *
 *
 */
public class TProduct implements Serializable {
    private long productId;

    private String name;

    private Long price;

    private Long salePrice;

    private int number;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
