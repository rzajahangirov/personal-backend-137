package com.personal.demo.service;

import com.personal.demo.dtos.project.ProjectCreateDto;
import com.personal.demo.dtos.project.ProjectReadDto;

import java.util.List;

public interface ProjectService {
    ProjectReadDto createProject(ProjectCreateDto createDto);

    List<ProjectReadDto> getAllProjects();
}
