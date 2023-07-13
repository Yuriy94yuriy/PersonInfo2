package person;


public class Person {
    String city;
    String surname;
    String name;
    String number;

    public Person(String name, String surname, String city, String number) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.number = number;
    }

    public static void main(String[] args) {
        Person person = new Person("Will", "Smith", "NewYork", "2936729462846");
        person.printInfo();
        Person secondPerson = new Person("Jackie", "Chan", "Shangai", "12312412412");
        secondPerson.printInfo();
        Person thirdPerson = new Person("Sherlock", "Holmes", "London", "37742123513");
        thirdPerson.printInfo();
    }

    public void printInfo() {
        System.out.println("Зателефонувати громадянину " + name + " " + surname + " із міста " + city + " " + number);
    }
}


//Зробити клас Person та в ньому метод personInfo()
//На вхід передавати йому чотири параметри: ім'я, прізвище, місто, телефон
//Всередині методу формувати рядок у форматі:
//Зателефонувати громадянину + ІМ'Я ПРІЗВИЩЕ + із міста + МІСТО можна за номером + ТЕЛЕФОН
//Метод має повертати String
//У main-методі зробити три виклики методу personInfo, щоразу передаючи нову людину;
//Повинен вийти висновок такого типу:
//Зателефонувати громадянинові Will Smith з міста New York можна за номером 2936729462846.
//Зателефонувати громадянинові Jackie Chan з міста Shanghai можна за номером 12312412412.
//Зателефонувати до громадян Sherlock Holmes з міста London можна за номером 37742123513.