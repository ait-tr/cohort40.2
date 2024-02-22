package l28.ex4;


class Guitar {
    String name;
    GuitarStrings strings;
    GuitarFretboard fretboard;

    public Guitar(String name) {
        this.name = name;
        this.strings = this.new GuitarStrings();
        this.fretboard = this.new GuitarFretboard();
    }

    class GuitarStrings {
        @Override
        public String toString() {
            return "GuitarStrings of " + Guitar.this.name;
        }
    }

    class GuitarFretboard {
        @Override
        public String toString() {
            return "GuitarFretboard of " + Guitar.this.name;
        }
    }

    @Override
    public String toString() {
        return "Guitar " + Guitar.this.name;
    }
}


class BassGuitar extends Guitar {
    GuitarBelt belt;

    public BassGuitar(String name) {
        super(name);
        this.belt = this.new GuitarBelt();
    }

    class GuitarBelt {
        GuitarBeltController controller;

        public GuitarBelt() {
            this.controller = this.new GuitarBeltController();
        }

        @Override
        public String toString() {
            return "GuitarBelt of " + BassGuitar.this.name;
        }

        class GuitarBeltController {
            @Override
            public String toString() {
                return "GuitarBeltController of " + BassGuitar.this.name;
            }
        }
    }
}


class GuitarSetup {
    Guitar guitar;
    String power;

    GuitarSetup(Guitar guitar, String power) {
        this.guitar = guitar;
        this.power = power;
    }
}



class Main {
    public static void main(String[] args) {
        BassGuitar bass = new BassGuitar("fender");
        System.out.println(bass);
        System.out.println(bass.strings);
        System.out.println(bass.fretboard);
        System.out.println(bass.belt);
        System.out.println(bass.belt.controller);

        GuitarSetup setup = new GuitarSetup(bass, "усилитель");
    }
}