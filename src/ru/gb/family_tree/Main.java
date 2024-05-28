public class Main {
    public static void main(String[] args) {
        FamilyTree ft = new FamilyTree();
        
        ft.Generate(2);

        // Human human = ft.getFirst();
        // System.out.println(human.FamilyTree());
        System.out.println(ft);
        ft.WriteTo("File");
        ft.ReadFrom("File");
        System.out.println(ft);
    }
}