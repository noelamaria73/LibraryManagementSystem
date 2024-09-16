public class Main {

    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Create books
        Book book1 = new Book("Treasure Island", "Robert Louis Stevenson", "623ABC", 5);
        Book book2 = new Book("Think and grow  rich", "Napoleon Hill", "956DEF", 3);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Create members
        Member member1 = new Member("James Wolter", "M001");
        Member member2 = new Member("Mary Jacob", "M002");

        // Register members to the library
        library.registerMember(member1);
        library.registerMember(member2);

        // Lend books to members
        library.lendBook("623ABC", "M001");
        library.lendBook("956DEF", "M002");
        library.lendBook("623ABC", "M001");
        library.lendBook("999XYZ", "M001");
        library.lendBook("623ABC", "M003");
    }
}

