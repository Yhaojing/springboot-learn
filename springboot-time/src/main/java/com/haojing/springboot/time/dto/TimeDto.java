package com.haojing.springboot.time.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDateTime;

/**
 * @author haoj
 * @date 2019/12/2
 */
public class TimeDto {
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime currentTime;

    public LocalDateTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(LocalDateTime currentTime) {
        this.currentTime = currentTime;
    }
}
