package com.excelToDB.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer extends IdCommon{

    private String firstName;
    private String lastName;
    private String country;
    private Integer telephone;

}
