package ru.crpt.testtask.controllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.crpt.testtask.domain.dto.Document;

import javax.validation.Valid;

@RestController
public class DocumentController {
    public static final String DOCUMENT = "Document";

    @Operation(summary = "Покупка", tags = DOCUMENT,
            responses = {
                    @ApiResponse(responseCode = "200", description = "Докумен принят"),
                    @ApiResponse(responseCode = "400", description = "Yе все поля заданы правильно"),
            })
    @PostMapping("/send_document")
    public String sendDocument(@Valid @RequestBody Document document){
        return "Document received";
    }

}
