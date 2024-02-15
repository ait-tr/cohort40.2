package l23.people.v1_5;


public class Main {
    public static void main(String[] args) {
        Human[] people = new Human[2];
        people[0] = new BadBoy("Вася", 29);
        people[1] = new BadGirl("Мурка", 27);

        for(Human human: people) {
            human.sayPhrase();
            human.applySkill();
        }
    }
}


/*
* Стандарт на легковой автобиль:
*
*
*
*
* */
