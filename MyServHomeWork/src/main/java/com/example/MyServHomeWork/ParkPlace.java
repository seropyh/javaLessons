package com.example.MyServHomeWork;

import lombok.*;


//@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class ParkPlace {
    private Integer countOfPlace = 20;
    private Integer countOfCars=0;
    private Integer[] place = new Integer[countOfPlace];
    public ParkPlace(){
        for (int i=0 ;i< this.countOfPlace; i++){
            this.place[i] =0;
        }
    }
    public boolean UnParkCar(int place) {
        if (this.place[place - 1] == 1) {

            if (--this.countOfCars <= 0) {
                this.countOfCars = 0;
                return false;
            } else {
                this.place[place - 1] = 0;
                return true;
            }
        } else return false;
    }

    public Integer ParkCar() {
        if (++this.countOfCars > this.countOfPlace) {
            this.countOfCars = this.countOfPlace;
            return 0;
        } else {
           // return 1;
           for (int i = 0; i < countOfPlace; i++) {
                if (this.place[i] == 0) {
                    this.place[i] = 1;
                    return i + 1;

                }
            }

            return 1;
        }


    }

}


