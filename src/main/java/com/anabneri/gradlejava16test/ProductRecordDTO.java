package com.anabneri.gradlejava16test;

import javax.validation.constraints.*;


public record ProductRecordDTO(
                             @NotNull @NotEmpty  String name,
                                @Max(1) @Min(0) int status) {

    public Product toEntity() {
        return new Product(null, this.name, this.status);
    }
}
