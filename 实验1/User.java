public class User {
   public static void main(String args[]) {
      Vehicle car1;
      Vehicle car2;
      car1= new Vehicle();
      car2 =new Vehicle();
      car1.setPower(128);
      car2.setPower(76);
      //new Ĭ�ϵĹ��췽����������car1
      //������8�� //ʹ��new �������Ĭ�ϵĹ��췽����������car2
      car1.setPower(128);   
      car2.setPower(76);
      System.out.println("car1�Ĺ����ǣ�"+car1.getPower());
      System.out.println("car2�Ĺ����ǣ�"+car2.getPower());
      car1.speedUp(80);
      car2.speedUp(80);
     // ������9��  //car1����speedUp�������Լ���speed��ֵ����80
      //������10�� //car2����speedUp�������Լ���speed��ֵ����80
      System.out.println("car1Ŀǰ���ٶȣ�"+car1.getSpeed());
      System.out.println("car2Ŀǰ���ٶȣ�"+car2.getSpeed());
      car1.speedDown(10);
      car2.speedDown(20);
      System.out.println("car1Ŀǰ���ٶȣ�"+car1.getSpeed());
      System.out.println("car2Ŀǰ���ٶȣ�"+car2.getSpeed());
   }
}
