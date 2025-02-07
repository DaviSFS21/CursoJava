package enumerator.entities;

import enumerator.entities.enums.OrderStatus;

import java.util.Date;

public class Order {
    private Integer id;
    private OrderStatus status;
    private Date moment;

    public Order(int id, OrderStatus status, Date moment) {
        this.id = id;
        this.status = status;
        this.moment = moment;
    }

    public Order(Integer id, OrderStatus status) {
        this.id = id;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
