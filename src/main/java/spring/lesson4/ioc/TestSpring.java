package spring.lesson4.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//https://www.youtube.com/watch?v=Ns0IxBXDbWw
//При создании проекта spring испрользован архитип org.apache.maven.archetypes:maven-archetype-webapp

/**
 * @author Kirill Zotov
 */
public class TestSpring {
    public static void main(String[] args) {

        //этот класс ClassPathXmlApplicationContext считывает инфу из файла applicationContext.xml и помещает все бины в context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //достаем Bean из applicationContext.xml по его id="musicBean", вызываем через метод getBean()
        //используем два аргумента id="musicBean" и объкт какого класса хотим получить Music.class
        //Объект класса context.getBean("musicBean", Music.class); помещаем в переменную music
        Music music = context.getBean("musicBean", Music.class);

        //Создадим объект MusicPlayer(music) с аргументом. Аргумент задан конструктором.
        MusicPlayer musicPlayer = new MusicPlayer(music);
        //вызываем метод playMusic()
        musicPlayer.playMusic();

        //закрыть context
        context.close();
    }
}
