public class testing {
    public static void main(String[] args) {
        BTree <Integer> Nevo = new BTree<>(2);
        for (int i=0; i<40; i++){
            int toInsert =(int)(100*Math.random()+1);
            System.out.println("adding "+toInsert + " to the tree");
            Nevo.insert(toInsert);
            System.out.println(Nevo.toString());
        }
        System.out.println(Nevo.toString());
    }
}
