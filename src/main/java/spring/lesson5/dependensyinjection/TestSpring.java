package spring.lesson5.dependensyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Внедрение зависимостей. Dependency Injection (DI)
//https://www.youtube.com/watch?v=MjnVZgMnTT0&list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&index=5
//При создании проекта spring испрользован архитип org.apache.maven.archetypes:maven-archetype-webapp

/**
 * @author Kirill Zotov
 */
public class TestSpring {
    public static void main(String[] args) {

        //этот класс ClassPathXmlApplicationContext считывает инфу из файла applicationContext.xml и помещает все бины в context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextLesson5.xml");

        //Создадим объект MusicPlayer(music) с аргументом. Аргумент задан конструктором constructor-arg ref="musicBean"
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //вызываем метод playMusic()
        musicPlayer.playMusic();

        //закрыть context
        context.close();
    }
}
