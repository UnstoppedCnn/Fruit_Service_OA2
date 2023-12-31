package com.example.fruit_service_oa2.bean;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.sql.Date;
import java.util.Objects;

/**
 *  Represents the "orders" table in the database.
 */
@Tag(name="订单表",description = "客户和村民签署的订单等信息")
public class Order {
    @Schema(name="唯一标识id")
    private int order_id; // 订单id
    @Schema(name="客户信息",type="int")
    private int c_id; // 客户信息
    @Schema(name="收购量",type="float")
    private float purchase_amount; // 收购量
    @Schema(name="土地信息",type="int")
    private int land_id; // 土地信息
    @Schema(name="交易预计完成时间",type="Date")
    private Date maybe_completed_time; // 交易预计完成时间
    @Schema(name="实际完成时间",type="Date")
    private Date actual_completed_time; // 实际完成时间
    @Schema(name="交易发生时间",type="Date")
    private Date transaction_occurred_time; // 交易发生时间
    @Schema(name="违约金",type="double")
    private double penalty; // 违约金

    public Order() {
    }

    public Order(int order_id, int c_id, float purchase_amount, int land_id, Date maybe_completed_time, Date actual_completed_time, Date transaction_occurred_time, double penalty) {
        this.order_id = order_id;
        this.c_id = c_id;
        this.purchase_amount = purchase_amount;
        this.land_id = land_id;
        this.maybe_completed_time = maybe_completed_time;
        this.actual_completed_time = actual_completed_time;
        this.transaction_occurred_time = transaction_occurred_time;
        this.penalty = penalty;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public float getPurchase_amount() {
        return purchase_amount;
    }

    public void setPurchase_amount(float purchase_amount) {
        this.purchase_amount = purchase_amount;
    }

    public int getLand_id() {
        return land_id;
    }

    public void setLand_id(int land_id) {
        this.land_id = land_id;
    }

    public Date getMaybe_completed_time() {
        return maybe_completed_time;
    }

    public void setMaybe_completed_time(Date maybe_completed_time) {
        this.maybe_completed_time = maybe_completed_time;
    }

    public Date getActual_completed_time() {
        return actual_completed_time;
    }

    public void setActual_completed_time(Date actual_completed_time) {
        this.actual_completed_time = actual_completed_time;
    }

    public Date getTransaction_occurred_time() {
        return transaction_occurred_time;
    }

    public void setTransaction_occurred_time(Date transaction_occurred_time) {
        this.transaction_occurred_time = transaction_occurred_time;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return order_id == order.order_id && c_id == order.c_id && Float.compare(purchase_amount, order.purchase_amount) == 0 && land_id == order.land_id && Double.compare(penalty, order.penalty) == 0 && Objects.equals(maybe_completed_time, order.maybe_completed_time) && Objects.equals(actual_completed_time, order.actual_completed_time) && Objects.equals(transaction_occurred_time, order.transaction_occurred_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order_id, c_id, purchase_amount, land_id, maybe_completed_time, actual_completed_time, transaction_occurred_time, penalty);
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", c_id=" + c_id +
                ", purchase_amount=" + purchase_amount +
                ", land_id=" + land_id +
                ", maybe_completed_time=" + maybe_completed_time +
                ", actual_completed_time=" + actual_completed_time +
                ", transaction_occurred_time=" + transaction_occurred_time +
                ", penalty=" + penalty +
                '}';
    }
}
