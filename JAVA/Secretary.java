// Class Secretary kế thừa từ Employee
public class Secretary extends Employee {
    // Thêm phương thức takeDictation
    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }
}