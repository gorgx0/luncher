package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "User_jpa")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name ;

    private String uid;
}
