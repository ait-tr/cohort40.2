package l31;

interface Greeting {
    void sayHello();
    void sayGoodBye();
}

class MyGreeting implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Привет из обычного класса!");
    }

    @Override
    public void sayGoodBye() {
        System.out.println("Пока из обычного класса!");
    }
}

class Main0 {
    public static void main(String[] args) {
        MyGreeting myGreeting = new MyGreeting();
        myGreeting.sayHello();
        myGreeting.sayGoodBye();
    }
}


abstract class MyAbsClass {
    abstract void sayHello();
}


class Main05 {
    public static void main(String[] args) {
        MyAbsClass myAbsClass = new MyAbsClass() {
            @Override
            void sayHello() {
                System.out.println(
                    "Привет из анонимного класса " +
                    "созданного из абстрактного класса!"
                );
            }
        };
        myAbsClass.sayHello();
    }
}


class MyClass {
    void sayHello() {
        System.out.println(
            "Привет из анонимного класса " +
            "созданного из обычного класса!"
        );
    }
}


class Main06 {
    public static void main(String[] args) {
        MyAbsClass myAbsClass = new MyAbsClass() {
            @Override
            void sayHello() {
                System.out.println(
                    "Я очень странный привет!"
                );
            }
        };
        myAbsClass.sayHello();
    }
}


class Main1 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Привет из анонимного класса!");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("Пока из анонимного класса!");
            }
        };
        greeting.sayHello();
        greeting.sayGoodBye();
    }
};


class Main1_5 {
    public static void main(String[] args) {
        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Привет из анонимного класса!");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("Пока из анонимного класса!");
            }
        };

        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Здравствуйте!");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("Досвидания!");
            }
        };

        greeting1.sayHello();
        greeting2.sayHello();
        greeting1.sayGoodBye();
        greeting2.sayGoodBye();
    }
}

