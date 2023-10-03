package org.FarmerFroilen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/pilot")

public class PilotController {
    @Autowired
    private PilotService pilotService;

    @GetMapping
    public ResponseEntity<List<Pilot>> getallPilots(){
        return new ResponseEntity<List<Pilot>>(pilotService.allPilots(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Pilot> createPilot(@RequestBody Map<String, String> payload){
        System.out.println(payload.get("name"));
        return new ResponseEntity<Pilot>(pilotService.createPilot(payload.get("name")), HttpStatus.CREATED);
    }
}
