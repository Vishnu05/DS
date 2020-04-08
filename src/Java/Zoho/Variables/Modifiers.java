package Java.Zoho.Variables;


public class Modifiers {

    String match;
    private int goals;
    protected char player;

   protected void team() {


    }
}

class foot extends Modifiers {

    @Override
    protected void team() {

        super.team();
    }

    void teamb() {
        match = "";
        player = 'v';
    }
}
