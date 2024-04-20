import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в школу волшебства и магии Хогвартс!");
        Gryffindor[] gryffindors = new Gryffindor[]{
                new Gryffindor("Гарри", "Поттер", 88, 69,
                        12, 23, 18),
                new Gryffindor("Гермиона", "Грейнджер", 73, 78,
                        14, 16, 22),
                new Gryffindor("Рон", "Уизли", 59, 42,
                        11, 24, 19)
        };
        Slytherin[] slytherins = new Slytherin[]{
                new Slytherin("Драко", "Малфой", 51, 66,
                        23, 11, 30),
                new Slytherin("Грэхэм", "Монтегю", 65, 77,
                        20, 20, 10),
                new Slytherin("Грегори", "Гойл", 46, 62,
                        27, 18, 22)
        };
        Hufflepuff[] hufflepuffs = new Hufflepuff[]{
                new Hufflepuff("Захария", "Смит", 46, 56,
                        23, 21, 18),
                new Hufflepuff("Седрик", "Диггори", 71, 68,
                        26, 13, 12),
                new Hufflepuff("Джастин", "Финч-Флетчли", 64, 70,
                        13, 16, 28)
        };
        Ravenclaw[] ravenclaws = new Ravenclaw[]{
                new Ravenclaw("Чжоу", "Чанг", 74, 64,
                        27, 16, 30),
                new Ravenclaw("Падма", "Патил", 57, 65,
                        20, 14, 28),
                new Ravenclaw("Маркус", "Белби", 51, 63,
                        19, 12, 21)
        };

        //System.out.println(Arrays.toString(gryffindors));
        //System.out.println(Arrays.toString(slytherins));
        //System.out.println(Arrays.toString(hufflepuffs));
        //System.out.println(Arrays.toString(ravenclaws));

        Gryffindor.equalStudents(gryffindors[1], gryffindors[2]);
        Hufflepuff.equalStudents(hufflepuffs[0], hufflepuffs[2]);
        Ravenclaw.equalStudents(ravenclaws[0], ravenclaws[1]);
        Slytherin.equalStudents(slytherins[1], slytherins[2]);

        gryffindors[0].printStudents();
        hufflepuffs[1].printStudents();
        ravenclaws[2].printStudents();
        slytherins[0].printStudents();

        Hogwarts.equalStudents(gryffindors[1], ravenclaws[2]);

    }
}