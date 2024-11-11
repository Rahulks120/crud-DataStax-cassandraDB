package com.ivoyant.cassandra.cassandra_demo.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @PrimaryKey
    private String id;

    private String name;
    private String email;

}
