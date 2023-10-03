package org.FarmerFroilen;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("api/v1/farm")
public class FarmController {
    @Autowired
    private FarmService farmService;

    @GetMapping
    public ResponseEntity<List<Farm>> getAllFarms(){
        return new ResponseEntity<List<Farm>>(farmService.allFarms(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Farm> createFarmer(){
//        System.out.println(payload.get("name"));
        return new ResponseEntity<Farm>(farmService.createFarm(), HttpStatus.CREATED);
    }
}
