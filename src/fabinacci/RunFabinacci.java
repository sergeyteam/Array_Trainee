package fabinacci;

import java.util.Arrays;

public class RunFabinacci {
	
	/* �������� ������ �� 20-�� ������ ����� ��������� � �������� ��� �� �����. 
	   ����������, ��� ������ � ������ ����� ������������������ ����� ��������, 
	   � ������ ��������� � ����� ���� ����������.
	*/

	public static void main(String[] args) {
		
		Fabinacci f = new Fabinacci();
		System.out.println(Arrays.toString(f.fabinacci(20)));
		;
	}

}
