package bevavioral.command;

//Invoker
public class Sergeant {

    ICommand lieDown;
    ICommand wrungOut;
    ICommand getUp;
    ICommand sleep;

    public Sergeant(ICommand lieDown, ICommand wrungOut, ICommand getUp, ICommand sleep) {
        this.lieDown = lieDown;
        this.wrungOut = wrungOut;
        this.getUp = getUp;
        this.sleep=sleep;
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

    public void getSleep() {
        sleep.execute();
    }
}
