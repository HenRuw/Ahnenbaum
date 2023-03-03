public class Main {
    public static void main(String[] args) {

        BinaryTree oneline = new BinaryTree<Person>(new Person("Ruwwe", "Henning", 'M'),new BinaryTree<Person>(new Person("Ruwwe", "Annette",'W')),new BinaryTree<Person>(new Person("Ruwwe", "Jonas",'M')));

        BinaryTree helene = new BinaryTree<Person>(new Person("Ruwwe","Helene",'W'));
        BinaryTree volker = new BinaryTree<Person>(new Person("Ruwwe","Volker",'M'));
        BinaryTree ursel = new BinaryTree<Person>(new Person("Degering","Ursel",'W'));
        BinaryTree klaus = new BinaryTree<Person>(new Person("Degering","Klaus",'M'));
        BinaryTree jonas = new BinaryTree<Person>(new Person("Ruwwe", "Jonas",'M'),helene, volker);
        BinaryTree annette = new BinaryTree<Person>(new Person("Ruwwe","Annette",'W'),ursel, klaus);
        BinaryTree henning = new BinaryTree<Person>(new Person("Ruwwe", "Henning",'M'),annette,jonas);

        Ahnentafel test = new Ahnentafel(henning);
        System.out.println(test.postOrder(test.getAhnenbaum()));
    }
}
