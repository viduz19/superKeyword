public class englandCricket {
    void playing(){
        System.out.println("Bowling");
    }
}
class sriLankanCricket extends englandCricket{
    void playing(){
        System.out.println("Batting");
    }
    void practising() {
        System.out.println("Fielding");
    }
    void selection() {
        super.playing();
        practising();
    }
}
class Test1{
    public static void main(String[] args){
        sriLankanCricket slc = new sriLankanCricket();
                slc.selection();
    }
}
