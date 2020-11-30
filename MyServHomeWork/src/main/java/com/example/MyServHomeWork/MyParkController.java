package com.example.MyServHomeWork;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import lombok.*;

@RestController
public class MyParkController {
    ParkPlace mypark = new ParkPlace();
    //@ResponseBody
    @PostMapping("/park")
    public String park(@RequestBody Integer park) { //@RequestBody ParkPlace park
       int place =  mypark.ParkCar();
        if (place >0) {

            return "Машина Запаркована место " + place;
        } else {

          return "Машина не запаркована мест нет";
        }

        // return mypark.getCountOfPlace().toString();

    }

//@ResponseBody
    @GetMapping("/free")
    public String free(@RequestParam(name = "myfree", required = false) String myfree) {
        Integer myInt = mypark.getCountOfPlace() - mypark.getCountOfCars();

        return myInt.toString();
        //       return "1";
    }
    @ResponseBody
    @PostMapping("/unpark")
    public String unpark(@RequestBody  Integer park) { //ParkPlace park)
        if (mypark.UnParkCar(park)) {
            return "Мaшина уехала с парковки";
        } else {
            return "Парковка пуста или место свободно";
        }

        //return "принят: " + park; //+ park.getCountOfPlace();
    }
}

