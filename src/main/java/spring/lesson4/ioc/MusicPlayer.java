package spring.lesson4.ioc;

//в этом классе будет применена инверсия управления
public class MusicPlayer {

    //Это interface Music
    private Music music;

    //Конструктор - передает в аргументе жанр музыки
    //Это и есть Инверсия управления
    //Кроме того это Полиморфизм
    public MusicPlayer(Music music) {
        this.music = music;
    }

    //Метод для проигрывания музыки
    public void playMusic(){

        //вызываем метод getSong()
        System.out.println("Playing: " + music.getSong());
    }
}
