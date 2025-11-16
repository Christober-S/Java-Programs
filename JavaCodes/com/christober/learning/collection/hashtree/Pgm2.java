package christober.learning.collection.hashtree;

public class Pgm2 {
    //HeadSet and TallSet: Create a TreeSet of Character elements, write a program to demonstrate the usage of headset() (e.g., all characters strictly less than 'H')
    // and tallset() (e.g., all characters greater than or equal to 'P'), printing the results.
    static void main() {
        java.util.TreeSet<Character> treeSet = new java.util.TreeSet<>();
        treeSet.add('A');
        treeSet.add('D');
        treeSet.add('H');
        treeSet.add('M');
        treeSet.add('P');
        treeSet.add('Z');

        // Demonstrating headset (all characters strictly less than 'H')
        java.util.SortedSet<Character> headSet = treeSet.headSet('H');
        System.out.println("HeadSet (characters < 'H'): " + headSet);

        // Demonstrating tailset (all characters greater than or equal to 'P')
        java.util.SortedSet<Character> tailSet = treeSet.tailSet('P');
        System.out.println("TailSet (characters >= 'P'): " + tailSet);
    }
}
