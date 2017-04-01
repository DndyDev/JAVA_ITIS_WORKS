package ru.itis;
public class Human {
    private int age;
      private String name;
    private int height;

    public int getHeight() {
        return height;
    }

    public Human   (int age, String name) {
        if (age <= 120 && age >= 0){
        this.age = age;
        }else{
            this.age = 1;
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public boolean equals(Object object){
        Human that = (Human)object;
       return  this.age == that.age;
    }
    public String toString(){
        return this.name + "" + this.age +"" + this.height;

    }
     public int compareTo(Object object){
        Human that1  = (Human)object;
        if(this.getAge() > that1.getAge() && this.getAge() < that1.getAge()){
            return this.getAge()  - that1.getAge();
        }else{
            return 0;
        }

        }
    }




