package classwork.students;

public class StudentStorage {

    private Student[] array = new Student[10];
    private int size = 0;

    public void add(Student st) {
        if (size == array.length) {
            increaseArray();

        }
        array[size++] = st;
    }

    private void increaseArray() {
        Student[] newArray = new Student[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    public int getSize() {
        return size;
    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[index] = array[++index];
            }
            size--;
            System.out.println("student is deleted");
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void printStudentsByLesson(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().equals(lessonName)) {
                System.out.println(array[i]);
            }
        }
    }

    public void changeLessson(String lessson, int index) {
        for (int i = index; i < size; i++) {
            array[index].setLesson(lessson);
        }
    }
}
