package l28;


class OuterClass {
    private static String staticMsg = "Статическое сообщение";
    private String instanceMsg = "Сообщение экземпляра";

    // Статический вложенный класс
    static class StaticNestedClass {
        void display() {
            // Доступ к статическому члену внешнего класса
            System.out.println(staticMsg);
        }
    }

    // Внутренний класс
    class InnerClass {
        void display() {
            // Доступ к статическому члену
            System.out.println(staticMsg);
            // Доступ к нестатическому члену
            System.out.println(instanceMsg);
            // Доступ к нестатическому члену
            System.out.println(OuterClass.this.instanceMsg);
        }
    }

//    InnerClass create() {
//        return new InnerClass();
//    }
}


class Main {
    public static void main(String[] args) {
        // Создание экземпляра статического вложенного класса
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();

        // Создание экземпляра внутреннего класса
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.display();
    }
}
