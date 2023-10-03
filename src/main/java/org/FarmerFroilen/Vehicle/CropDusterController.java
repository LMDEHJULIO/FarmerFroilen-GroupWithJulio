package org.FarmerFroilen.Vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/cropduster")

public class CropDusterController {
    @Autowired
    private CropDusterService cropDusterService;

    @GetMapping
    public ResponseEntity<List<CropDuster>> getAllDusters(){
        return new ResponseEntity<List<CropDuster>>(cropDusterService.allDusters(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CropDuster> buyADuster(@RequestBody Map<String, String> payload){
//        System.out.println(payload.get("name"));
        return new ResponseEntity<CropDuster>(cropDusterService.createDuster(payload.get("name"), payload.get("noise"), payload.get("isRideable")), HttpStatus.CREATED);
    }
}
