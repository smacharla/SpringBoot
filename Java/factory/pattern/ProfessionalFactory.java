package factory.pattern;

public class ProfessionalFactory {

    public profession getProfession(String typeOfProfession) {
        if (typeOfProfession == null) {
            return null;
        } else if (typeOfProfession == "Doctor") {
            return new Doctor();
        } else if (typeOfProfession == "Engineer") {
            return new Engineer();
        } else if (typeOfProfession == "Teacher") {
            return new Teacher();
        }
        return null;
    }
}
