package extra_exercise2.service.implement;

public interface IStudentService {
    void addNewStudent();
    void getAll();
    void removeById(int id);
    void remove(int index);
    void search (String search);
    void sort();
}
