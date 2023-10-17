package com.kh.product.web.form.product;

import lombok.Data;

@Data
public class AllForm {
    private Long productId;
    private String pname;
    private Long quantity; // bkkim insert
    private Long price; // bkkim insert
}
