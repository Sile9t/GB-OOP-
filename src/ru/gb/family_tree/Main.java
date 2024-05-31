import familyTree.FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree ft = new FamilyTree();

        // Human human = ft.getFirst();
        // System.out.println(human.FamilyTree());
        System.out.println(ft);
        ft.WriteTo("File");
        ft.ReadFrom("File");
        System.out.println(ft);
    }
}