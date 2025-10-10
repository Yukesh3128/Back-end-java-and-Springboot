public class stringbuilder {
    public static void main(String args[]) {
        // 1. append()
        System.out.println("=== 1. append() ===");
        StringBuilder sb1 = new StringBuilder("Yukesh");
        System.out.println("Before: " + sb1);
        sb1.append(" World");
        System.out.println("After: " + sb1);
        System.out.println();

        // 2. insert()
        System.out.println("=== 2. insert() ===");
        StringBuilder sb2 = new StringBuilder("Yukesh");
        System.out.println("Before: " + sb2);
        sb2.insert(4, " Venkat");
        System.out.println("After: " + sb2);
        System.out.println();

        // 3. replace()
        System.out.println("=== 3. replace() ===");
        StringBuilder sb3 = new StringBuilder("welcome yukesh");
        System.out.println("Before: " + sb3);
        sb3.replace(6, 10, "uks");
        System.out.println("After: " + sb3);
        System.out.println();

        // 4. delete()
        System.out.println("=== 4. delete() ===");
        StringBuilder sb4 = new StringBuilder("yukeshvenkat");
        System.out.println("Before: " + sb4);
        sb4.delete(3, 6);
        System.out.println("After: " + sb4);
        System.out.println();

        // 5. reverse() and length()
        System.out.println("=== 5. reverse() and length() ===");
        StringBuilder sb5 = new StringBuilder("madam");
        System.out.println("Before: " + sb5);
        sb5.reverse();
        System.out.println("After: " + sb5);
        System.out.println("Length: " + sb5.length());
        System.out.println();

        // 6. setCharAt() and charAt()
        System.out.println("=== 6. setCharAt() and charAt() ===");
        StringBuilder sb6 = new StringBuilder("Yukesh");
        System.out.println("Before: " + sb6);
        sb6.setCharAt(0, 'M');
        System.out.println("After: " + sb6);
        System.out.println("Character at index 1: " + sb6.charAt(1));
        System.out.println();

        // 7. substring()
        System.out.println("=== 7. substring() ===");
        StringBuilder sb7 = new StringBuilder("Yukeshvenkat");
        System.out.println("Before: " + sb7);
        System.out.println("Substring from index 3: " + sb7.substring(3));
        System.out.println("Substring from index 2 to 8: " + sb7.substring(2, 8));
        System.out.println("After (original remains same): " + sb7);
        System.out.println();

        // 8. toString()
        System.out.println("=== 8. toString() ===");
        StringBuilder sb8 = new StringBuilder("Uks");
        System.out.println("Before toString(): " + sb8);
        String str = sb8.toString();
        System.out.println("After toString(): " + str);
        System.out.println();

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
