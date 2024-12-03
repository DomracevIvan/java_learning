package HomeWork.Lesson7;
import java.util.Scanner;

public class TeleVisor {
    private String model;
    private String color;
    private String brand;
    private String mode;
    private double diagonal;
    private int numOfChannels;
    private int volume;
    private boolean isOn = false;

    // Конструктор
    public TeleVisor(String model, String color, String brand, String mode, double diagonal, int numOfChannels, int volume) {
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.mode = mode;
        this.diagonal = diagonal;
        this.numOfChannels = numOfChannels;
        this.volume = volume;
    }

    public void OnTv() {
        isOn = true;
        System.out.println("Телевизор включен.");
    }

    public void OffTv() {
        isOn = false;
        System.out.println("Телевизор выключен.");
    }

    public void setVolume(int volume) {
        if (volume >= 0) {
            this.volume = volume;
        }
    }

    public int getVolume() {
        return volume;
    }

    public int addVolume(int upVol) {
        if (upVol >= 0) {
            this.volume += upVol;
            if (this.volume > 99) {
                this.volume = 99;
            }
            System.out.println("Громкость звука увеличена на: " + upVol);
        }
        return volume;
    }

    public int reduceVolume(int dnVol) {
        if (dnVol > 0) {
            this.volume -= dnVol;
            if (this.volume < 0) {
                this.volume = 0;
            }
            System.out.println("Громкость звука уменьшена на: " + dnVol);
        }
        return volume;
    }

    public void mute(){
        volume = 0;
        System.out.println("Mute");
    }

    public void setNumOfChannels(int numOfCh) {
        if (numOfCh >= 0) {
            this.numOfChannels = numOfCh;
        }
    }

    public int getNumOfChannels() {
        return numOfChannels;
    }

    public int nextChannel(int nextCh) {
        if (nextCh > 0 && nextCh <= 100) {
            this.numOfChannels = nextCh;
            System.out.println("Включен Канал № " + nextCh);
        } else {
            System.out.println("Неправильный номер канала: " + nextCh);
        }
        return numOfChannels;
    }

    public void modeTv() {
        Scanner s = new Scanner(System.in);
        System.out.println("Выберите режим просмотра ТВ: 0- AV, 1- TV, 2- Blu Ray");
        int modeSelection = Integer.parseInt(s.nextLine());

        switch (modeSelection) {
            case 0:
                this.mode = "AV";
                break;
            case 1:
                this.mode = "TV";
                break;
            case 2:
                this.mode = "Blu Ray";
                break;
            default:
                System.out.println("Неправильный выбор режима.");
                return;
        }
        System.out.println("Выбран режим: " + this.mode);
    }

    public void showParameters() {
        System.out.println("Модель Телевизора: " + model +
                "\nЦвет Телевизора: " + color +
                "\nБренд: " + brand +
                "\nРежимы воспроизведения: " + mode +
                "\nДиагональ: " + diagonal +
                "\nКоличество каналов: " + numOfChannels +
                "\nОбъем звука: " + volume);
    }

    @Override
    public String toString() {
        return "TeleVisor{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", mode='" + mode + '\'' +
                ", diagonal=" + diagonal +
                ", numOfChannels=" + numOfChannels +
                ", volume=" + volume +
                '}';
    }
}