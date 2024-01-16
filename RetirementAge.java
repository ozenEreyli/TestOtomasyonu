class Male extends Person {
    public Male(String name, String surname, String dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public int calculateRetirementAge() {
        return 65;
    }
}
class Female extends Person {
    public Female(String name, String surname, String dateOfBirth) {
        super(name, surname, dateOfBirth);
    }
    public int calculateRetirementAge() {
        return 60;
    }
}
