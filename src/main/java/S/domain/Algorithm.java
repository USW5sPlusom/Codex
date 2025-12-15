package S.domain;

import java.util.ArrayList;
import java.util.List;

//Класс алгоритма
public class Algorithm {
    //Поля класса, private - инкапсуляция
    private long id;
    private String name;
    private String description;
    private String complexity;
    private List<String> tags;

    //Конструктор - метод создания нового обьекта класса
    public Algorithm(long id, String name, String description, String complexity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.complexity = complexity;
        this.tags = new ArrayList<>(); //просто инициализируем пустой список
    }

    //Геттеры
    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getComplexity(){
        return complexity;
    }
    public List<String> getTags(){
        return new ArrayList<>(tags); //возвращаем только копию изменяемого поля, чтобы не нарушать инкапсуляцию
    }

    //Сеттеры
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setComplexity(String complexity){
        this.complexity = complexity;
    }
    public void addTag(String tag){
        if(!tags.contains(tag) && tag != null){
            tags.add(tag);
        }
    }

    //Метод для вывода информации
    @Override //Страховка от ошибок при написании сигнатуры, при переопределении метода родительского класса Object
    public String toString(){
        return "Algorithm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", complexity='" + complexity + '\'' +
                ", tags=" + tags +
                '}';
    }
}
