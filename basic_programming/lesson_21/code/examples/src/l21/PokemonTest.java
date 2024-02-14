package l21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PokemonTest {

    @Test
    public void testPokemonConstructor() {
        String name = "Karl";
        int age = 99;

        Pokemon pokemon = new Pokemon(name, age);

        Assertions.assertEquals(name, pokemon.name, "Имя некорректное!");
        Assertions.assertEquals(age, pokemon.age);
    }
}
