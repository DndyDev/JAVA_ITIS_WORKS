package ru.itis;

public class Main {
    public static Object min(Object objects[], Comparator comparator) {
        Object min = objects[0];
        for (int i = 1; i < objects.length; i++) {
            if (comparator.compare(min, objects[i]) > 0) {
                min = objects[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        Human HumanArray[] = new Human [7];
        HumanArray[0] = new Human(23,"Marsel");
        HumanArray[1]= new Human(16,"Sergey");
        HumanArray[2] = new Human(17,"Danil");
        HumanArray[3] = new Human(14,"Maksim");
        HumanArray[4] = new Human(55,"Egor");
        HumanArray[5] = new Human(34,"Bulat");
        HumanArray[6] = new Human(35,"Artem");
//        Human min = HumanArray[0];
        Rectangle a = new Rectangle(4,6);
        Rectangle b = new Rectangle(5,6);
        Rectangle c = new Rectangle(4,5);
        Rectangle d = new Rectangle(9,2);
        Rectangle e = new Rectangle(6,4);
        Rectangle f = new Rectangle(7,1);
        Rectangle rectagles[] = {a,b,c,d,e,f};
//        Rectangle min2  = a;

//        for (int i = 0;i < HumanArray.length;i++){
//            if(HumanArray[i].getAge() < min.getAge()){
//                min = HumanArray[i];
//            }

//        }
//        for (int i = 0; i < rectagles.length;i++ ){
//            if(rectagles[i].area() < min2.area()){
//                min2 = rectagles[i];
//            }
//        }
//        for (int i = 0;i < HumanArray.length;i++){
//            if(HumanArray[i].compareTo(min) > 0 ){
//                min  = HumanArray[i];
//            }
//        }
//        for (int i = 0;i < rectagles.length;i++) {
//            if (rectagles[i].compareTo(min2) > 0) {
//                min2 = rectagles[i];
//            }
//        }

        System.out.println(min);
//        System.out.println(min2);


    }
}
