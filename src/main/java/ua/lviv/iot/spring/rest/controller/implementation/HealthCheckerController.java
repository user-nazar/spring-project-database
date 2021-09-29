package ua.lviv.iot.spring.rest.controller.implementation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/healthcheck")
@RestController
public class HealthCheckerController {
  @GetMapping
   public ResponseEntity<String> getStatus(){
     return  ResponseEntity.status(HttpStatus.OK).build();
  }
}
