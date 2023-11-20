import com.sprint.inheritance.*;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println("*************************************");
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("*************************************");

        JuniorDeveloper junior1 = new JuniorDeveloper(1,"Emre",35000);
        junior1.work();
        System.out.println(junior1);
        MidDeveloper mid = new MidDeveloper(1,"Emre",35000);
        mid.work();
        System.out.println(mid);
        SeniorDeveloper senior = new SeniorDeveloper(1,"Emre",35000);
        senior.work();
        System.out.println(senior);

        HRManager hrManager = new HRManager(3,"Dogan", 35000 , new JuniorDeveloper[5],new MidDeveloper[2],new SeniorDeveloper[1]);
        hrManager.work();
        hrManager.addEmployee(1,junior1);
        hrManager.addEmployee(1,mid);
        hrManager.addEmployee(0,senior);
    }
}