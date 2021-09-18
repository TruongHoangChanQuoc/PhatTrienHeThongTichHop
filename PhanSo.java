import java.util.Scanner;

public class PhanSo {

	int tu,mau;
	Scanner sc = new Scanner(System.in);
	public PhanSo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhanSo(int tu, int mau) {
		super();
		this.tu = tu;
		this.mau = mau;
	}

	public int getTu() {
		return tu;
	}

	public void setTu(int tu) {
		this.tu = tu;
	}

	public int getMau() {
		return mau;
	}

	public void setMau(int mau) {
		this.mau = mau;
	}

	public void nhapPS(String y) {
		System.out.println("Nhập tử số: ");
		tu =sc.nextInt();
		System.out.println("Nhập mẫu số: ");
		mau =sc.nextInt();
		System.out.println(y+ " " +tu +"/" +mau);
	}
	//Nghich dao phan so
	public void nghichdaoPS() {
		int tg;
		tg=tu;
		tu=mau;
		mau=tg;
		System.out.println( +tu +"/" +mau);
	}
	//Cong, tru, nhan , chia 2 phan son
	//Tong hai phan so
	public void congPhanso(PhanSo ps) {
		int ts = this.getTu()*ps.getMau() + ps.getTu()*this.getMau();
		int ms = this.getMau()*ps.getMau();
		PhanSo tongPhanso = new PhanSo(ts,ms);
		System.out.println("Tổng hai phân số = "+tongPhanso.tu +"/" +tongPhanso.mau);
	}
	
	//Hieu 2 phan so
	public void hieuPhanso(PhanSo ps) {
		int ts = this.getTu()*ps.getMau() - ps.getTu()*this.getMau();
		int ms = this.getMau()*ps.getMau();
		PhanSo hieuPhanso = new PhanSo(ts,ms);
		System.out.println("Hiệu hai phân số = "+hieuPhanso.tu +"/" +hieuPhanso.mau);
	}
	
	//Tich 2 phan so
	public void tichPhanso(PhanSo ps) {
		int ts = this.getTu()*ps.getTu();
		int ms = this.getMau()*ps.getMau();
		PhanSo tichPhanso = new PhanSo(ts,ms);
		System.out.println("Tích của hai phân số = "+tichPhanso.tu +"/" +tichPhanso.mau);
	}
	
	//Thuong hai phan so
	public void thuongPhanso(PhanSo ps) {
		int ts = this.getTu()*ps.getMau();
		int ms = this.getMau()*ps.getTu();
		PhanSo thuongPhanso = new PhanSo(ts,ms);
		System.out.println("Thương của 2 phân số = "+thuongPhanso.tu +"/" +thuongPhanso.mau);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo ps1 = new PhanSo();
		PhanSo ps2 = new PhanSo();
		ps1.nhapPS("Phân số thứ 1:\n");
		ps2.nhapPS("Phân số thứ 2:\n");
		ps1.congPhanso(ps2);
		System.out.println("-----------------------------------\n");
		ps1.hieuPhanso(ps2);
		System.out.println("-----------------------------------\n");
		ps1.tichPhanso(ps2);
		System.out.println("-----------------------------------\n");
		ps1.thuongPhanso(ps2);
		System.out.println("-----------------------------------\n");
		System.out.println("Nghịch đảo phân số thứ 1 là");
		ps1.nghichdaoPS();
		System.out.println("-----------------------------------\n");
		System.out.println("Nghịch đảo phân số thứ 2 là");
		ps2.nghichdaoPS();
	}
}