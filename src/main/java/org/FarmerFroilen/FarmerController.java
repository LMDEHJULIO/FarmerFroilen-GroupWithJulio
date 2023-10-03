package org.FarmerFroilen;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/farmer")

public class FarmerController {
    @Autowired
    private FarmerService farmerService;

    @GetMapping
    public ResponseEntity<List<Farmer>> getAllFarmers(){
        return new ResponseEntity<List<Farmer>>(farmerService.allFarmers(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Farmer> createFarmer(@RequestBody Map<String, String> payload){
        System.out.println(payload.get("name"));
        return new ResponseEntity<Farmer>(farmerService.createFarmer(payload.get("name")), HttpStatus.CREATED);
    }
}
