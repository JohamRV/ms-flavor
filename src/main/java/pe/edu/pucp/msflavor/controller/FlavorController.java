package pe.edu.pucp.msflavor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.pucp.msflavor.daos.FlavorDao;
import pe.edu.pucp.msflavor.entity.Flavor;
import pe.edu.pucp.msflavor.repository.FlavorRepository;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value = "/ms-flavor")
@CrossOrigin
public class FlavorController {

    @Autowired
    FlavorRepository flavorRepository;

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity listAllFlavors() {
        return null;
    }

    @GetMapping(value = "/get/{flavorId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity showFlavorDetail(@PathVariable("flavorId") Integer flavorId) {
        return null;
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createFlavor(@Valid @RequestBody FlavorDao flavor) {
        //TODO - falta crear el flavor con el generic sdk y openstack
        Map<String, String> response = new HashMap<>();
        flavorRepository.save(flavor.getFlavor());

        response.put("status", HttpStatus.CREATED.getReasonPhrase());
        response.put("message", "Flavor saved successfully.");

        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity editFlavor() {
        return null;
    }

    @DeleteMapping(value = "/delete/{flavorId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteFlavor(@PathVariable("flavorId") Integer flavorId) {
        return null;
    }

}
