package com.example.demo.Run;

import java.time.LocalDateTime;
import com.example.demo.Location; 

public record RunRecord(
    Integer id,
    String title,
    LocalDateTime startedOn,
    LocalDateTime completedOn,
    Integer miles,
    Location location
) {}