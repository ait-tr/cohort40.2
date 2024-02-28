package l32;

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}



class DayNames {
    public static final DayNames MONDAY = new DayNames("MONDAY");
    public static final DayNames TUESDAY = new DayNames("TUESDAY");
    public static final DayNames WEDNESDAY = new DayNames("WEDNESDAY");
    public static final DayNames THURSDAY = new DayNames("THURSDAY");
    public static final DayNames FRIDAY = new DayNames("FRIDAY");
    public static final DayNames SATURDAY = new DayNames("SATURDAY");
    public static final DayNames SUNDAY = new DayNames("SUNDAY");

    // --------

    private final String dayName;

    DayNames(String dayName) {
        this.dayName = dayName;
    }

    @Override
    public String toString() {
        return this.dayName;
    }
}


class Main0 {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY);
        System.out.println(DayNames.THURSDAY);
        System.out.println(DayNames.THURSDAY == DayNames.THURSDAY);
    }
}




enum Season {
    WINTER("Cold"),
    SPRING("Warm"),
    SUMMER("Hot"),
    AUTUMN("Cool");

    private final String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


class MySeason {
    public static final MySeason WINTER = new MySeason("WINTER", "Cold");
    public static final MySeason SPRING = new MySeason("SPRING", "Warm");
    public static final MySeason SUMMER = new MySeason("SUMMER", "Hot");
    public static final MySeason AUTUMN = new MySeason("AUTUMN", "Cool");

    private final String name;
    private final String description;

    MySeason(String name, String description) {
        this.name = name;
        this.description = description;
    }
}


class Main {
    public static void main(String[] args) {
        handleDay(Day.MONDAY);
        handleDay(Day.THURSDAY);
        handleDay(Day.SUNDAY);
    }

    public static void handleDay(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Понедельник - начало недели.");
                break;
            case FRIDAY:
                System.out.println("Пятница - почти выходные!");
                break;
            case SUNDAY:
                System.out.println("Воскресенье - выходной день.");
                break;
            default:
                System.out.println("Средина недели.");
        }
    }
}


class Main2 {
    public static void main(String[] args) {
        // Season[] values() - это статический метод енама,
        // он возвращает все элементы этого енама в
        // том эе порядке в котором мы их указывали
        Season[] seasons = Season.values();

        for (Season season : seasons) {
            System.out.println(season + ": " + season.getDescription());
        }

        // Season valueOf(String name) - это статический метод енама,
        // который возвращает тот или иной элемент енама по названию
        Season winter = Season.valueOf("WINTER");

        if (winter == Season.WINTER) {
            System.out.println(
                    "ДА"
            );
        }

        // int compareTo(Season other) - это метод енама,
        // который возвращает результат сравнения порядкого номера енамов
        int comparingValue = Season.WINTER.compareTo(Season.SUMMER);
        System.out.println(comparingValue);

        Season.WINTER.name();

        Season.WINTER.ordinal();

        Season.WINTER.getDeclaringClass();
    }
}


//class Main4 {
//    public static void main(String[] args) {
//        // вывод всех доступных значений енама (.values())
//        // String moonPhaseName = scanner.nextLine()
//        // MoonPhase moonPhase = MoonPhase.valueOf(moonPhaseName)
//
//        switch (moonPhase) {
//            case NEW_MOON:
//                System.out.println("Понедельник" + moonPhase);
//                break;
//            case FULL_MOON:
//                System.out.println("Пятница");
//                break;
//            default:
//                System.out.println("Средина");
//        }
//
//    }
//}





