package org.FarmerFroilen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/horsies")

public class HorseController {
    @Autowired
    private HorseService horseService;

    @GetMapping
    public ResponseEntity<List<Horse>> getAllHorsies(){
        return new ResponseEntity<List<Horse>>(horseService.allHorsies(), HttpStatus.OK);
    }

    @PostMapping

    public ResponseEntity<Horse> createReview(){
        return new ResponseEntity<Horse>(horseService.createHorsie(), HttpStatus.CREATED);
    }
}
