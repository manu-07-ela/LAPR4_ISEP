package eapli.base.ordermanagement.dto;

import eapli.framework.representations.dto.DTO;

import java.lang.annotation.Annotation;

public class ProductOrderDto implements DTO {

    public long orderId;

    public String date;

    public String customerName;

    public String total;

    public Long agvId;

    public String productOrderId;

    public ProductOrderDto(final long id, final String date, final String customerName, final String total){
        this.orderId = id;
        this.date = date;
        this.customerName = customerName;
        this.total = total;
    }

    public ProductOrderDto(String orderId, Long agvId) {
        this.productOrderId = orderId;
        this.agvId = agvId;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}