
public class StringDemo {

	 public static void main(String[] args) {
         String hello = "Hello", lo = "lo";
         //ͬһ������ͬһ�����е��ַ�������������ָ��ͬһ���ַ�������
         System.out.print((hello == "Hello") + " ");
         //ͬһ�����²�ͬ�����е��ַ�������������ָ��ͬһ���ַ�������
         System.out.print((Other.hello == hello) + " ");
         //��ͬ�İ��²�ͬ�����е��ַ���������������Ȼָ��ͬһ���ַ�������
         System.out.print((other.Other.hello == hello) + " ");
         //�ɳ������ʽ��������ַ����ڱ���ʱ���м���,Ȼ�󱻵���������
         System.out.print((hello == ("Hel"+"lo")) + " ");
         //������ʱͨ�����Ӽ�������ַ������´����ģ�����ǲ�ͬ�ģ�
         System.out.print((hello == ("Hel"+lo)) + " ");
         //ͨ���������ɵ��ַ���ʽ����intern����������Ľ����ԭ�����ڵ�ͬ�����ݵ��ַ���������һ����
         System.out.println(hello == ("Hel"+lo).intern());
    }
	 
	public static  class Other { static String hello = "Hello"; }
}
