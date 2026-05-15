package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RunRequest;
import com.example.demo.model.RunResponse;
import com.example.demo.service.RunService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/runs")
public class RunController {

    private final RunService runService;

    public RunController(RunService runService) {
        this.runService = runService;
    }

    @GetMapping
    public List<RunResponse> findAll() {
        return runService.findAll();
    }

    @GetMapping("/{id}")
    public RunResponse findById(@PathVariable Integer id) {
        return runService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RunResponse create(@Valid @RequestBody RunRequest request) {
        return runService.save(request);
    }
}
