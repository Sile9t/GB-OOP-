import services.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addHuman("Henry");
        service.addHuman("Anna");
        service.addHuman("Etan");
        service.addHuman("Merry");

        System.out.println(service.getFamilyTree());
    }
}