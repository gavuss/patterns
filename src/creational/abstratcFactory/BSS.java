package creational.abstratcFactory;

import creational.abstratcFactory.worker.analyst.IAnalyst;
import creational.abstratcFactory.worker.developer.IDeveloper;
import creational.abstratcFactory.team.ITeamFactory;
import creational.abstratcFactory.worker.tester.ITester;
import creational.abstratcFactory.team.roscap.RoscapTeamFactory;
import creational.abstratcFactory.team.vbrr.VbrrTeamFactory;

public class BSS {

    public static void main(String[] args) throws IllegalAccessException {

//        String bankName = "РОСКАП";
        String bankName = "ВБРР";

        //Создаем фабрику которая создаст нам команду ля нужного банка
        ITeamFactory teamFactory = createTeamForBank(bankName);

        //Получаем из фабрики специалистов для работы
        IAnalyst analyst = teamFactory.getAnalyst();
        IDeveloper developer = teamFactory.getDeveloper();
        ITester tester = teamFactory.getTester();

        //Создаем доработку
        createTask(bankName, analyst, developer, tester);

    }

    public static ITeamFactory createTeamForBank(String bankName) throws IllegalAccessException {
        if (bankName.equalsIgnoreCase("РОСКАП")) {
            return new RoscapTeamFactory();
        } else if (bankName.equalsIgnoreCase("ВБРР")) {
            return new VbrrTeamFactory();
        } else {
            throw new IllegalAccessException(bankName + " unidentified bank!");
        }
    }

    public static void createTask(String bankName, IAnalyst analyst, IDeveloper developer, ITester tester) throws IllegalAccessException {
        System.out.println("Сделать доработку для банка: " + bankName);
        System.out.println("=============================================");
        analyst.createTask(bankName);
        developer.writeCode(bankName);
        tester.testCode(bankName);
    }
}
