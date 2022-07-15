package ru.crpt.testtask.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class Product {

    @NotBlank(message = "Имя покупателя не должно быть пустым")
    private String name;

    @NotBlank(message = "Идентификатор продукта не должен быть пустым")
    @Size(min = 13, max = 13, message = "Идентификатор продукта должен быть длинной 13 символов")
    @Schema(description = "Идентификатор продукта")
    private String code;
}
