package org.FarmerFroilen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chickens")

public class ChickenController {
    @Autowired
    private ChickenService chickenService;

    @GetMapping
    public ResponseEntity<List<Chicken>> getAllChickens(){
        return new ResponseEntity<List<Chicken>>(chickenService.allChickens(), HttpStatus.OK);
    }

    @PostMapping

    public ResponseEntity<Chicken> createReview(){
        return new ResponseEntity<Chicken>(chickenService.createChicken(), HttpStatus.CREATED);
    }
}
