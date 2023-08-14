public class Cars {
    int horsepower;
    String name;
    String model;
    String color;
    int year;
    public void showNumberofTyres()
    {
        System.out.println("Number of tyres are 4");
    }
    static class Sedan extends Cars {
        int horsepower;
        String name;
        String model;
        String color;
        int no_of_tyres;
        int year;
        public void showNumberofTyres()
        {
            System.out.println("Number of tyres are 4");
        }
    }
    static class Motorbike extends Cars {
        int horsepower;
        String name;
        String model;
        String color;
        int no_of_tyres;
        int year;
        public void showNumberofTyres()
        {
            System.out.println("Number of tyres are 2");
        }

    }
    public static void main(String[] args) {
        Cars cars = new Cars();
        cars.showNumberofTyres();
        Motorbike motorbike = new Motorbike();
        motorbike.showNumberofTyres();
    }
}