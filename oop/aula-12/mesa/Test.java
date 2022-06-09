class Test {
    public static void main(String[] args) {
        
        TechnicalAssistant john = new TechnicalAssistant("John", 1000.0, "ABC12345", 100.0);
        AdministrativeAssistant jane = new AdministrativeAssistant("Jane", 2000.0, "ABC54321", Shift.NIGHT, 100.0);

        System.out.println(john.toString());
        System.out.println(jane.toString());

    }
}