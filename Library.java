import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;
    private final List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void lendBook(String isbn, String memberId) {
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);

        if (book != null && member != null) {
            if (book.getCopiesAvailable() > 0) {
                member.borrowBook(book);
                book.setCopiesAvailable(book.getCopiesAvailable() - 1);
                System.out.println("Book lent to member: " + member.name);
                System.out.println("Title: " + book.title + ", Author: " + book.author);
            } else {
                System.out.println("No copies available for book: " + book.title);
            }
        } else {
            System.out.println("Book or member not found.");
        }
    }


    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }
}

