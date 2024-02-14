package l21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class CarArrayListTest {
    private Car car1;
    private Car car2;

    @BeforeEach
    public void setUp() {
        this.car1 = new Car("bmw", 1915);
        this.car2 = new Car("polo", 1915);
    }

    @Test
    public void testCount() {
        CarArrayList garage = new CarArrayList();
        Assertions.assertEquals(0, garage.count);

        garage.add(this.car1);
        garage.add(this.car2);

        Assertions.assertEquals(2, garage.count);
    }

    @Test
    public void testCountOld() {
        Car bmw = new Car("bmw", 1915);
        Car polo = new Car("polo", 1915);

        CarArrayList garage = new CarArrayList();
        Assertions.assertEquals(0, garage.count);

        garage.add(bmw);
        garage.add(polo);

        Assertions.assertEquals(2, garage.count);
    }

    @Test
    public void testRemove() {
        CarArrayList garage = new CarArrayList();

        garage.add(this.car1);
        garage.add(this.car2);

        Assertions.assertEquals(this.car1, garage.getByIndex(0));
        garage.removeByIndex(0);
        Assertions.assertEquals(this.car2, garage.getByIndex(0));
    }

    @Test
    public void testCar() {
        int productionYear = 1979;
        String vendor = "honda";

        Car honda = new Car(vendor, productionYear);

        Assertions.assertEquals(
            honda.toString(),
            "Car: " + vendor + " - " + productionYear
        );
    }
}
