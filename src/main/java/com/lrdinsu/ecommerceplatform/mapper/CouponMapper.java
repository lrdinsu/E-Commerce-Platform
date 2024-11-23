package com.lrdinsu.ecommerceplatform.mapper;

import com.lrdinsu.ecommerceplatform.dto.CouponDTOs.CouponDTO;
import com.lrdinsu.ecommerceplatform.model.Coupon;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CouponMapper {

    CouponDTO toCouponDTO(Coupon coupon);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    Coupon toCoupon(CouponDTO couponDTO);
}
