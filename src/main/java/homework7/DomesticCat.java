package homework7;

public class DomesticCat extends Pet implements Foul {
    public DomesticCat(String nickname, int age, int trickLevel, String[] habitats) {
        super(nickname, age, trickLevel, habitats);
    }

    public void respond() {
        System.out.println("Hi i am"+ getNickname());

    }
    public void foul(){
        System.out.println("I need cover it up");
    }
}