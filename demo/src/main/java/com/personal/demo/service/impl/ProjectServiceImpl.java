package com.personal.demo.service.impl;

import com.personal.demo.dtos.project.ProjectCreateDto;
import com.personal.demo.dtos.project.ProjectReadDto;
import com.personal.demo.models.Project;
import com.personal.demo.repsitory.ProjectRepository;
import com.personal.demo.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    @Override
    public ProjectReadDto createProject(ProjectCreateDto createDto) {
        Project project = new Project();
        project.setName(createDto.getName());
        project.setDescription(createDto.getDescription());
        project.setPhotoUrl(createDto.getPhotoUrl());
        project = projectRepository.save(project);
        return mapToReadDto(project);
    }

    @Override
    public List<ProjectReadDto> getAllProjects() {
        List<Project> projects = projectRepository.findAll();
        List<ProjectReadDto> projectReadDtos = new ArrayList<>();
        for (Project project : projects) {
            projectReadDtos.add(mapToReadDto(project));
        }
        return projectReadDtos;
    }

    private ProjectReadDto mapToReadDto(Project project) {
        ProjectReadDto readDto = new ProjectReadDto();
        readDto.setId(project.getId());
        readDto.setName(project.getName());
        readDto.setDescription(project.getDescription());
        readDto.setPhotoUrl(project.getPhotoUrl());
        return readDto;
    }
}
