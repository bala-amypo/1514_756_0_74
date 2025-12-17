package com.example.demo.controller;

@RestController

public class LocationController{
    @Autowired
    LocationService locationservice;
    @PostMapping("/addlocation")
    public LocationEntity add(@RequestBody LocationEntity le){
        return locationservice.createlocation(le);
    }
    @GetMapping("/showlocation")
    public List<LocationEntity> show(){
        return locationservice.getalllocation();
    }
}