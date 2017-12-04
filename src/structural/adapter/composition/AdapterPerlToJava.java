package structural.adapter.composition;

public class AdapterPerlToJava implements IJavaDeveloper {

    private PerlDeveloper perlDeveloper = new PerlDeveloper();

    @Override
    public void writeCode() {
        perlDeveloper.writePerlCode();
    }

    @Override
    public void verifyCode() {
        perlDeveloper.verifyPerlCode();
    }
}
