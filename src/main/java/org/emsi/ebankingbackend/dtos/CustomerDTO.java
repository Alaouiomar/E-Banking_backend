package org.emsi.ebankingbackend.dtos;


import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
}
