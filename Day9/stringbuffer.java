public class stringbuffer {
    public static void main(String args[]) {
        // 1. append()
        System.out.println("=== 1. append() ===");
        StringBuffer sb1 = new StringBuffer("Frontend");
        System.out.println("Before append: " + sb1);
        sb1.append(" Developer");
        System.out.println("After append: " + sb1);
        System.out.println();

        // 2. insert()
        System.out.println("=== 2. insert() ===");
        StringBuffer sb2 = new StringBuffer("Make");
        System.out.println("Before insert: " + sb2);
        sb2.insert(4, " Happy");
        System.out.println("After insert: " + sb2);
        System.out.println();

        // 3. replace()
        System.out.println("=== 3. replace() ===");
        StringBuffer sb3 = new StringBuffer("welcome yukesh");
        System.out.println("Before replace: " + sb3);
        sb3.replace(6, 10, "all");
        System.out.println("After replace: " + sb3);
        System.out.println();

        // 4. delete()
        System.out.println("=== 4. delete() ===");
        StringBuffer sb4 = new StringBuffer("All are welcome");
        System.out.println("Before delete: " + sb4);
        sb4.delete(3, 6);
        System.out.println("After delete: " + sb4);
        System.out.println();

        // 5. reverse() and length()
        System.out.println("=== 5. reverse() and length() ===");
        StringBuffer sb5 = new StringBuffer("test");
        System.out.println("Before reverse: " + sb5);
        sb5.reverse();
        System.out.println("After reverse: " + sb5);
        System.out.println("Length: " + sb5.length());
        System.out.println();

        // 6. setCharAt() and charAt()
        System.out.println("=== 6. setCharAt() and charAt() ===");
        StringBuffer sb6 = new StringBuffer("Coding");
        System.out.println("Before setCharAt: " + sb6);
        sb6.setCharAt(0, 'B');
        System.out.println("After setCharAt: " + sb6);
        System.out.println("Character at index 1: " + sb6.charAt(1));
        System.out.println();

        // 7. substring()
        System.out.println("=== 7. substring() ===");
        StringBuffer sb7 = new StringBuffer("Yukesh");
        System.out.println("Original: " + sb7);
        // StringBuffer doesn’t have substring(), so convert to String
        System.out.println("Substring from index 3: " + sb7.toString().substring(3));
        System.out.println();

        // 8. toString()
        System.out.println("=== 8. toString() ===");
        StringBuffer sb8 = new StringBuffer("Uks");
        System.out.println("Before toString(): " + sb8);
        String str = sb8.toString();
        System.out.println("After toString(): " + str);
        
        // 9. Capacity()
        System.out.println("=== 9. Capacity() ===");
        StringBuilder sb9 = new StringBuilder("Yukesh");
        System.out.println("Capacity: " + sb9.capacity()); // Default = 16 + length of "Yukesh(6)" = 16 + 6 = 22
        System.out.println();

        // 10. trimToSize()
        System.out.println("=== 10. trimToSize() ===");
        StringBuilder sb10 = new StringBuilder("Java");
        System.out.println("Before trim: " + sb10.capacity()); //Default = 16 + length of java(4) = 16 + 4 = 20
        sb10.trimToSize();
        System.out.println("After trim: " + sb10.capacity()); //remove the capacity value 20 - 16 = 4
    }
}
