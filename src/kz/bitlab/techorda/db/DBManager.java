package kz.bitlab.techorda.db;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Task> TASKS = new ArrayList<>();

    private static int id = 6;

    static {
        TASKS.add(
                new Task(1,
                        "Создать Веб приложение на JAVA EE",
                        "Нужно будет создать собственное приложение на Java EE для себя. Для начала я " +
                                "установлю себе на комп Composer. Затем тупо загружу Java EE и запущу.",
                        "23.10.2021",
                        "Yes"
                )
        );
        TASKS.add(
                new Task(2,
                        "Убраться дома и закупить продукты",
                        "Нужно будет создать собственное приложение на Java EE для себя. Для начала я " +
                                "установлю себе на комп Composer. Затем тупо загружу Java EE и запущу.",
                        "23.10.2021",
                        "Yes"
                )
        );
        TASKS.add(
                new Task(3,
                        "Выполнить все домашние задания",
                        "Нужно будет создать собственное приложение на Java EE для себя. Для начала я " +
                                "установлю себе на комп Composer. Затем тупо загружу Java EE и запущу.",
                        "23.10.2021",
                        "No"
                )
        );
        TASKS.add(
                new Task(4,
                "Записаться на качку",
                "Нужно будет создать собственное приложение на Java EE для себя. Для начала я " +
                        "установлю себе на комп Composer. Затем тупо загружу Java EE и запущу.",
                "23.10.2021",
                        "No"
        )
        );
        TASKS.add(
                new Task(5,
                        "Учить Итальянский",
                        "Нужно будет создать собственное приложение на Java EE для себя. Для начала я " +
                                "установлю себе на комп Composer. Затем тупо загружу Java EE и запущу.",
                        "23.10.2021",
                        "No"
                )
        );
    }

    public static ArrayList<Task> getBooks(){
        return TASKS;
    }

    public static void addBook(Task task){
        task.setId(id);
        TASKS.add(task);
        id++;
    }

    public static Task getBook(int id){
        return TASKS.stream().filter(book->book.getId()==id).findFirst().orElse(null);
    }

    public static void updateBook(Task kitap){
        for (int i = 0; i< TASKS.size(); i++){
            if (TASKS.get(i).getId()==kitap.getId()){
                TASKS.set(i, kitap);
                break;
            }
        }
    }

    public static void deleteBook(int id){
        for (int i = 0; i< TASKS.size(); i++){
            if (TASKS.get(i).getId()==id){
                TASKS.remove(i);
                break;
            }
        }
    }
}
