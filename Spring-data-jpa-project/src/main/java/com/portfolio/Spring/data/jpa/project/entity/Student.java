package com.portfolio.Spring.data.jpa.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_student")
public class Student {
    @Id
    private Long studentId;
    private String firstName;
    private String lastName;

    @Column
    private String emailId;
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;
}
