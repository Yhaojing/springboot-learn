package com.haojing.springboot.time.controller;

import com.haojing.springboot.time.dto.TimeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author haoj
 * @date 2019/12/2
 */
@RestController
public class TimeController {
    @GetMapping("/time")
    public TimeDto getCurrentTime() {
        TimeDto timeDto = new TimeDto();
        timeDto.setCurrentTime(LocalDateTime.now());
        return timeDto;
    }

    @PostMapping("/time")
    public Boolean postTime(@RequestBody TimeDto timeParamDto) {
        LocalDateTime dateTime = timeParamDto.getCurrentTime();
        return Boolean.TRUE;
    }
}
