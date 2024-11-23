package com.lrdinsu.ecommerceplatform.mapper;

import com.lrdinsu.ecommerceplatform.dto.ProductDTOs.ProductCreateDTO;
import com.lrdinsu.ecommerceplatform.dto.ProductDTOs.ProductResponseDTO;
import com.lrdinsu.ecommerceplatform.dto.ProductDTOs.ProductUpdateDTO;
import com.lrdinsu.ecommerceplatform.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductResponseDTO toProductResponseDTO(Product product);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    Product toProduct(ProductCreateDTO productCreateDTO);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    void updateProductFromDTO(ProductUpdateDTO productUpdateDTO, @MappingTarget Product product);
}
