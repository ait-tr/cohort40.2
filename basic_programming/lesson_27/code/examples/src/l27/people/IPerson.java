package l27.people;

public interface IPerson {
    void talk();
    void startFriendship();
    void askHelp();
}

interface IPerson0 {
    void talk();
    void startFriendship();
    void askHelp();
}


interface IPerson2 extends IPerson, IPerson0{

}
