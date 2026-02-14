package com.personal.demo.controller;

import com.personal.demo.dtos.project.ProjectCreateDto;
import com.personal.demo.dtos.project.ProjectReadDto;
import com.personal.demo.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
@RequiredArgsConstructor
public class ProjectController {
    private final ProjectService projectService;

    @PostMapping("/")
    public ResponseEntity<ProjectReadDto> createProject(@RequestBody ProjectCreateDto createDto) {
        ProjectReadDto readDto = projectService.createProject(createDto);
        return new ResponseEntity<>(readDto, HttpStatus.CREATED);
    }
    @GetMapping("/")
    public ResponseEntity<List<ProjectReadDto>> getAllProjects() {
        List<ProjectReadDto> readDtos = projectService.getAllProjects();
        return new ResponseEntity<>(readDtos, HttpStatus.OK);
    }

}
