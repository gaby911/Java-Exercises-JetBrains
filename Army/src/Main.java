class Army {

    public static void createArmy() {
        // Implement this method
        Unit u1= new Unit("unit1");
        Unit u2= new Unit("unit2");
        Unit u3= new Unit("unit3");
        Unit u4= new Unit("unit4");
        Unit u5= new Unit("unit5");

        Knight k1 = new Knight("knight1");
        Knight k2 = new Knight("knight2");
        Knight k3 = new Knight("knight3");

        General g1 = new General("general1");

        Doctor d1 = new Doctor("doctor1");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}