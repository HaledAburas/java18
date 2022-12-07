package person;

public class employee extends person {
    @Override
    public void personinfo() {
        System.out.println("im emplyee" );
        super.personinfo();
    }
}
