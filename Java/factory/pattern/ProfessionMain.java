package factory.pattern;

public class ProfessionMain {

    public static void main(String[] args) {
        ProfessionalFactory pFactory = new ProfessionalFactory();
        // profession profession = pFactory.getProfession("Doctor").print();
        // profession.print();
        pFactory.getProfession("Engineer").print();
    }

}
