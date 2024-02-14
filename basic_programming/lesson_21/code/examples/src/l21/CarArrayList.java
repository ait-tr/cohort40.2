package l21;

import java.util.Arrays;

public class CarArrayList {
    static int INITIAL_SIZE = 4;
    Car[] cars;
    int count = 0;

    public CarArrayList(){
        this.cars = new Car[INITIAL_SIZE];
    }

    public void add(Car element){
        if (this.count >= this.cars.length) {
            resize();
        }

        cars[count] = element;
        count = count + 1;
    }

    public void resize() {
        Car[] newGarage = new Car[this.cars.length * 2];
        for (int i = 0; i < this.count; i = i + 1) {
            newGarage[i] = this.cars[i];
        }
        this.cars = newGarage;
    }

    public void removeByIndex(int index){
        if (index >= count)
            return;

        for (int i = index; i + 1 < count; i++){
            cars[i] = cars[i+1];
        }

        cars[count - 1] = null;
    }

    public Car getByIndex(int index){
        return cars[index];
    }

    public String toString() {
        return Arrays.toString(this.cars);
    }
}

