package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public class SubFunClass extends SuperFunClass implements AwesomeInterface{

    public SubFunClass(){


    }

    public static void main(){

        SubFunClass funObject = (SubFunClass) new SuperFunClass();

    }

    @Override
    public int getData() {
        return 0;
    }

    @Override
    public void setData(int someData) {

    }
}
