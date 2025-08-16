package task04;

import java.util.Scanner;

public class Library {
    private static Book[] books=new Book[100];
    private static Member[] members=new Member[100];
    private static int numberOfBooks;
    private static int numberOfMembers;

    public static void addBook(Book book) {
        books[numberOfBooks] = book;
        numberOfBooks++;
    }
    public static void addMember(Member member) {
        members[numberOfMembers] = member;
        numberOfMembers++;
    }
    public void tookBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("Who takes the book?");
        String wichMember= input.nextLine();
      Member member= wichMember(wichMember);
       if(member==null){
           System.out.println("we didn't have this member");
           return;
       }
        System.out.println("Please enter the book you would like to took");
        String nameBook = input.nextLine();
        boolean bookFound = false;
        boolean isAvailableToTake = false;

        for(int i = 0; i < numberOfBooks; i++) {
            if (books[i].getTitle().equals(nameBook)) {
                bookFound  = true;

                if (books[i].isAvailable()) {
                    isAvailableToTake = true;
                    books[i].setAvailable(false);
                    member.setBorrowedBooks(books[i]);
                    break;

                }
            }
        }
            if(bookFound && isAvailableToTake){
                System.out.println("We have this book and you can get it");
            }
            else if(bookFound){
                System.out.println("We have this book but Book Not Available ");
            }
            else{
                System.out.println("We don't have this book  ");
            }



    }

    public Member wichMember(String nameMember) {
        for(int i = 0; i < numberOfMembers; i++){
            if(members[i].getMemberName().equals(nameMember)){
                return members[i];
            }
        }
        return null;
    }
    public void getBookBack() {
        Scanner input = new Scanner(System.in);
        System.out.println("Who takes the book?");
        String nameMember = input.nextLine();

        int idex=-1;
        Member member= wichMember(nameMember);
        if(member==null){
            System.out.println("we didn't have this member");
            return;
        }
        Book book=member.returnedBooks();
        if(book==null)return;
        book.setAvailable(true);



    }
    public String allBooks() {
        StringBuilder books1 = new StringBuilder();
        String numberOfBooksString = "libary dont't have any books";
        if (numberOfBooks > 0) {

            books1.append("[");

            for (int i = 0; i < numberOfBooks; i++) {
               books1.append(books[i]);
                books1.append(", ");
            }
            books1.append("]");
            numberOfBooksString = books1.toString();

        }
        return numberOfBooksString;

    }
    public String allMembers() {
        StringBuilder members1 = new StringBuilder();
        String numberOfMembersString = "libary dont't have any members";
        if (numberOfMembers > 0) {

            members1.append("[");

            for (int i = 0; i < numberOfMembers; i++) {
                members1.append(members[i]);
                members1.append(", ");
            }
            members1.append("]");
            numberOfMembersString =  members1.toString();

        }
        return numberOfMembersString;

    }



}
