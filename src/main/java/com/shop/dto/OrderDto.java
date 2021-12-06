package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class OrderDto {

    @NotNull(message = "상품 아이디는 필수 입력 값입니다.")
    private Long itemId;

    @Min(value = 1, message = "최소 주문 수량은 1개 입니다.")
    @Max(value = 999, message = "최대 주문 수량은 999개 입니다.")
    private int count;

    private String address;
    private String addressDetail;

    private String from;
    private String text;

    private String notice;  //알림 전송 방식 추가
    
    @Min(value = 0, message = "포인트는 0 이상의 숫자를 입력해주세요.")
    private int usedPoint; // 사용 포인트 값 불러오기

}
