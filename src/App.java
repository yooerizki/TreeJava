import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        BinaryTree bin = new BinaryTree();
        String data;

        System.out.println("Masukkan Inputan : "); //
        data = input.next();

        // konvert data ke char
        for (int i = 0; i < data.length(); i++) {
            bin.add(String.valueOf(data.charAt(i)));
        }

        System.out.println("Preorder : ");
        bin.preOrder(bin.root);
        System.out.println("");
        System.out.println("Inorder : ");
        bin.inOrder(bin.root);
        System.out.println("");
        System.out.println("Postorder : ");
        bin.postOrder(bin.root);
    }
}
