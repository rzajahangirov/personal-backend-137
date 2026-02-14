package com.personal.demo.dtos.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectReadDto {
    private Long id;
    private String name;
    private String description;
    private String photoUrl;
}
