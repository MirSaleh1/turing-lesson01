package task04;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Member {
    private String memberName;
    private String memberID;
    private  Book[]borrowedBooks=new Book[10];
    private  Book[] returnedBooks=new Book[10];
    private int borrowedBooksCount;
    private int returnedBooksCount;


    public Member(String memberName, String memberID){
        this.memberName = memberName;
        this.memberID = memberID;
        Library.addMember(this);
    }
    public String getMemberName() {
        return memberName;
    }
    public String getMemberID() {
        return memberID;
    }
    public String getBorrowedBooks() {
        StringBuilder books = new StringBuilder();
        String borrowedBooksString = "you didn't take any books";
        if (borrowedBooksCount > 0) {

                books.append("[");

                for (int i = 0; i < borrowedBooksCount; i++) {
                    books.append(borrowedBooks[i]);
                    books.append(", ");
                }
                books.append("]");
                borrowedBooksString = books.toString();

        }
        return borrowedBooksString;

    }
    public String getReturnedBooks() {
            StringBuilder returnBooks = new StringBuilder();
            String returnedBooksString = "you didn't returned any books";
            if (returnedBooksCount > 0) {
                returnBooks.append("[");

                for (int i = 0; i < returnedBooksCount; i++) {
                    returnBooks.append(returnedBooks[i]);
                    returnBooks.append(", ");
                }
                returnBooks.append("]");
                returnedBooksString = returnBooks.toString();
            }

        return returnedBooksString;

    }
    public void setBorrowedBooks(Book book){
       if(borrowedBooksCount<10){
           borrowedBooks[borrowedBooksCount] = book;
           borrowedBooksCount++;
       }else {
           System.out.println("you are in limit you can,t take any books");
       }

    } public Book returnedBooks(){
        int index = -1;
        System.out.println("wich book can you give back");
        Scanner input = new Scanner(System.in);
        String bookName = input.nextLine();
        Book book = null;
        for (int i = 0; i < borrowedBooksCount; i++) {
            if(borrowedBooks[i].getTitle().equals(bookName)){
                book = borrowedBooks[i];
                index = i;

                break;
            }

        }
        if(index==-1){
            System.out.println("you didn't take this book");
            return null;
        }
        for (int i = index; i < borrowedBooksCount-1; i++) {
            borrowedBooks[i] = borrowedBooks[i+1];
        }
        borrowedBooks[borrowedBooksCount-1] = null;
        borrowedBooksCount--;
        if(returnedBooksCount<10){

            returnedBooks[returnedBooksCount] = book;
            returnedBooksCount++;
        }

        return book;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return borrowedBooksCount == member.borrowedBooksCount && returnedBooksCount == member.returnedBooksCount && Objects.equals(memberName, member.memberName) && Objects.equals(memberID, member.memberID) && Objects.deepEquals(borrowedBooks, member.borrowedBooks) && Objects.deepEquals(returnedBooks, member.returnedBooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberName, memberID, Arrays.hashCode(borrowedBooks), Arrays.hashCode(returnedBooks), borrowedBooksCount, returnedBooksCount);
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberName='" + memberName + '\'' +
                ", memberID='" + memberID + '\'' +
                ", borrowedBooks=" + getBorrowedBooks() +
                ", returnedBooks=" + getReturnedBooks() +
                ", borrowedBooksCount=" + borrowedBooksCount +
                ", returnedBooksCount=" + returnedBooksCount +
                '}';
    }
}
