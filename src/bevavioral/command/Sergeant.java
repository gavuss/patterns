package bevavioral.command;

//Invoker
public class Sergeant {

    ICommand lieDown;
    ICommand wrungOut;
    ICommand getUp;

    public Sergeant(ICommand lieDown, ICommand wrungOut, ICommand getUp) {
        this.lieDown = lieDown;
        this.wrungOut = wrungOut;
        this.getUp = getUp;
    }

    public void lieDown() {
        lieDown.execute();
    }

    public void wrungOut() {
        wrungOut.execute();
    }

    public void getUp() {
        getUp.execute();
    }
}
