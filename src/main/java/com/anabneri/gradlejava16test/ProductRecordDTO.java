package com.anabneri.gradlejava16test;

import javax.validation.constraints.*;


public record ProductRecordDTO(
                              @NotEmpty  String name,
                                int status) {

    public Product toEntity() {
        return new Product(null, this.name, this.status);
    }
}
