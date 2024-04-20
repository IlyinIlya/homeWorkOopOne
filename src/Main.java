import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в школу волшебства и магии Хогвартс!");
        Gryffindor[] gryffindors = new Gryffindor[]{
                new Gryffindor("Гарри", "Поттер", 10, 20,
                        75, 55, 4),
                new Gryffindor("Гермиона", "Грейнджер", 20, 30,
                        72, 55, 3),
                new Gryffindor("Рон", "Уизли",30, 40,
                            65, 50, 8)
         };
        Slytherin[] slytherins = new Slytherin[] {
                new Slytherin("Драко", "Малфой", 10, 20,
                        75, 55, 4),
                new Slytherin("Грэхэм", "Монтегю", 20, 30,
                        75, 55, 4),
                new Slytherin("Грегори", "Гойл", 40, 50,
                        75, 55, 4)
        };
        Hufflepuff[] hufflepuffs = new Hufflepuff[] {
                new Hufflepuff("Захария","Смит", 10, 20,
                        75, 55, 4),
                new Hufflepuff("Седрик","Диггори", 20, 30,
                        75, 55, 4),
                new Hufflepuff("Джастин","Финч-Флетчли", 40, 50,
                        75, 55, 4)
        };
        Ravenclaw[] ravenclaws = new Ravenclaw[] {
                new Ravenclaw("Чжоу", "Чанг", 10,20,
                        75, 55, 4),
                new Ravenclaw("Падма", "Патил", 20,30,
                        75, 55, 4),
                new Ravenclaw("Маркус", "Белби", 40,50,
                75, 55, 4)
        };

       System.out.println(Arrays.toString(gryffindors));
       System.out.println(Arrays.toString(slytherins));
       System.out.println(Arrays.toString(hufflepuffs));
       System.out.println(Arrays.toString(ravenclaws));

    }
}