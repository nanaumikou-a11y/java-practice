class Person {
    String name;
    double height; // 身長 (m)
    double weight; // 体重 (kg)

    Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    double getBmi() {
        return this.weight / (this.height * this.height);
    }

    void printInfo() {
        System.out.println("名前: " + this.name);
        System.out.println("BMI: " + this.getBmi());
    }
}

public class BmiPractice {
    public static void main(String[] args) {
        Person person1 = new Person("ナナウミ", 1.60, 63.5);
        person1.printInfo();
    }
}
