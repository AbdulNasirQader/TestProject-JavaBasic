package Class11;

public class HomeworkPhoneTester {
    public static void main(String[] args) {

        HomeworkPhone phone1=new HomeworkPhone();
        phone1.name="iPhone";
        phone1.version="iPhone 14 Pro Max";
        phone1.color="Deep Purple";
        phone1.system="Smart Phone";
        phone1.price=1199;
        phone1.weight="172 grams";

        phone1.camera();
        phone1.alarm();
        phone1.internet();

        HomeworkPhone phone2=new HomeworkPhone();
        phone2.name="Pixel";
        phone2.version="Pixel Pro 7";
        phone2.color="Snow";
        phone2.system="Android";
        phone2.price=849;
        phone2.weight="212 grams";

        phone2.camera();
        phone2.alarm();
        phone2.internet();

        HomeworkPhone phone3=new HomeworkPhone();
        phone3.name="Samsung";
        phone3.version="Galaxy Z Fold 4";
        phone3.color="Burgundy";
        phone3.system="Android";
        phone3.price=1049;
        phone3.weight="263 grams";

        phone3.camera();
        phone3.fold();
        phone3.internet();




    }
}
