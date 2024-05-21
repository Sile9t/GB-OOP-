public class Main {
    public static void main(String[] args) {
        FamilyTree ft = new FamilyTree();
        
        ft.Generate(2);

        Human human = ft.getFirst();
        System.out.println(human.FamilyTree());
    }
}