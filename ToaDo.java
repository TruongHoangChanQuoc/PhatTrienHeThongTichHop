import java.util.Scanner;

public class ToaDo {
	int x,y; 
	Scanner sc = new Scanner(System.in);
	
	public ToaDo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public ToaDo() {
		super();
		this.x = 0;
		this.y = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public float gettinhKC() {
		return (float)(Math.sqrt(x*x+y*y));
	}

	public void nhapPoint() {
		System.out.println("Nhập hoành độ x:");
		x = sc.nextInt();
		System.out.println("Nhập tung độ y:");
		y = sc.nextInt();
		System.out.println("Điểm vừa nhập:"+"("+x +","+y+")");
	}

	public String toString() {
		return String.format("%10.2f",gettinhKC());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToaDo point = new ToaDo();
		point.nhapPoint();
		System.out.println("Khoảng cách từ điểm đến gốc tọa độ:"+point);
	}

}