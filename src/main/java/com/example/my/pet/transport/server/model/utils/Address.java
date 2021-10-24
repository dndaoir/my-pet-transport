package com.example.my.pet.transport.server.model.utils;

import lombok.Data;

@Data
public class Address {
    /**
     * 所在省code
     */
    private Long provinceCode;

    /**
     * 所在市code
     */
    private Long cityCode;

    /**
     * 所在区县code
     */
    private Long areaCode;

    /**
     * 详细地址
     */
    private String AddressDetail;
}
