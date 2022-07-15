package ru.crpt.testtask.domain.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Schema(name = "MechanicTypeResponse", description = "Описание механики")
public class Document {


    @NotBlank(message = "Идентификатор продавца не должен быть пустым")
    @Size(min = 9, max = 9, message = "Идентификатор продавца должен быть длинной 9 символов")
    @Schema(description = "Идентификатор продавца")
    private String seller;

    @NotBlank(message = "Идентификатор покупателя не должен быть пустым")
    @Size(min = 9, max = 9, message = "Идентификатор покупателя должен быть длинной 9 символов")
    @Schema(description = "Идентификатор покупателя")
    private String customer;

    @Valid
    @NotNull(message = "Список продуктов не задан")
    @Size(min = 1, message = "Список продуктов не может быть пустым")
    private List<Product> products;


}
