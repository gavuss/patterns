package structural.adapter.inheritance;

public class AdapterPerlToJava extends PerlDeveloper implements IJavaDeveloper  {
    @Override
    public void writeCode() {
        writePerlCode();
    }

    @Override
    public void verifyCode() {
        verifyPerlCode();
    }
}
