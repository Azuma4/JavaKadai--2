public class Actor {

    //フィールド
    private String name;
    private String bloodtype;
    private int age;

    //コンストラクター
    public Actor(String name, String bloodtype, int age) {
        this.name = name;
        this.bloodtype = bloodtype;
        this.age = age;
    }

    //メソッド
    public String getName() {
        return name;
    }
    public String getBloodtype() {
        return bloodtype;
    }
    public int getAge() {
        return age;
    }

}
