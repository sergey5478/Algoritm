// package seminar4;

// import java.lang.annotation.Retention;
// import java.util.Hashtable;

// import javax.swing.text.html.parser.Entity;

// public class HashTable<T, K> {

//     private static final int BASKET_COUNT = 16;
//     private static final double LOAD_FACTOR = 0.75;
//     private int size = 0;
//     private Basket<T, K>[] baskets;

//     public K get(T key) {
//         int index = calculateIndex(key);

//         Basket<T, K> basket = baskets[index];
//         if (basket != null) {
//             return basket.find(key);
//         }
//         return null;
//     }
//     private void recalculate(){
//         Basket<T,K>[] old = baskets;
//         baskets = (Basket<T,K>[]) new Object[old.length*2];
//         for (int i = 0; i < old.length; i++) {
//             Basket basket = old[i];
//             Basket.Node node = basket head;
//             while(node != null){
//                 put(node.entity.key,node.entity.value);
//                 node = node.next;
//             }
//             old[i]=null;
            
//         }
//     }
//     private int calculateIndex(T key) {
//         int hashCode = key.hashCode();
//         int basketIndex = Math.abs(hashCode) % baskets.length;
//         return basketIndex;
//     }

//     public Hashtable(int size){
//         baskets = (Basket<T,K>[]) new Object[size];
//     }

//     public Hashtable(){
//         this(BASKET_COUNT);
//     }

//     public boolean put(T key, K value){
//         if(baskets.length*LOAD_FACTOR<size){
//             recalculate();
//         }
//         int index = calculateIndex(key);
//         Basket<T,K> basket = baskets[index];
//         if(basket == null){
//             basket=new Basket<>();
//             baskets[index]=basket;
//         }
//         Entity<T,K> entity = new Entity<>();
//         entity.key = key;
//         entity.value = value;
//         boolean add = basket.add(entity);
//         if(add){
//             size++;            
//         }
//         return add;

        
//     }

//     public boolean remove(T key) {
//         int index = calculateIndex(key);
//         Basket<T, K> basket = baskets[index];
//         boolean dell = basket.delete(key);
//         if(dell){
//             size--;
//         }
//         return dell;
//     }

//     private class Basket<T, K> {
//         Node head;

//         public K find(T key){
//             Node node = head;
//         }
//     }

//     public boolean add(Entity entity) {
//         Node node = new Node();
//         node.entity = entity;
//         if (head != null) {
//             Node currentNode = head;
//             while (currentNode != null) {
//                 if (currentNode.entity.equal((entity)))
//                     ;
//                 return false;

//             }
//             if (currentNode.next == null) {
//                 currentNode.next = node;
//                 return true;
//             } else {
//                 currentNode = currentNode.next;
//             }
//         } else {
//             head = node;
//             return true;
//         }
//         return false;
//     }

//     public boolean delete(T key){
//         if(head!=null){
//             if(head.entity.key.equals(key)){
//                 head=head.next;
//                 return true;
//             }else{
//                 Node node = head;
//                 while(node.next !=null){
//                     if(node.next.entity.key.equals(key))
//                 }
//             }
//         }
//         private class Node {
//             Node next;
//             Entity<T, K> entity;
//     }
    

//     }

//     private class Entity<T, K> {
//         T key;
//         K value;
//     }

// }