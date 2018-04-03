

public class Point {
	// �ʵ��� scope(��ȿ����)�� class �����̴�.
	private double x; // �ʵ�
	private double y; // �ʵ�
	
	
	// ������ : �ʵ��� ���� �����ϴ� �޼ҵ� (�ʵ��� private �Ӽ��� public���� �ٲ�)
	public void setX(double xx) {
		this.x = xx;
		xx = 100.0;
	}
	public void setY(double yy) {
		this.y = yy;
	}
	
	// ������ : �ʵ��� ���� ��ȯ�ϴ� �޼ҵ�
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	
	// ex) �������� � ����Ʈ ��ġ���� ���� ���� ��
	//	C��� : ���� = distance(p);
	//	Java : ���� = p.distance();  -> ���� �Ű����� �ʿ� ����
	public double distance() {
		
		// ��ȯ�� ���� ����
		double result; // ��������
		// ���������� scope�� �޼ҵ� ����
		
		// �Ÿ� ���
		result = Math.sqrt(x*x+y*y); // x,y�� �ʵ�
		
		// �Ÿ� ��ȯ
		return result;
	}
	

	// ex) ���� p2 = ���� p1 + ���� p
	//	C��� : p2=move(p1,p);
	//	Java : p2=p1.mov(p);
	public Point move(Point p) { // Point p : �Ű�����(�Ű������� scope�� �޼ҵ� ����
		
		// temp ���� ����
		double a;
		double b;
		
		// ����Ʈ p��ŭ �̵�
		a = this.x + p.x;
		b = this.y + p.y;
		// this�� .�ڿ� ������ ������ �� ��ü�� �ʵ��� ���� �����ϱ� ����
		// ��, this.x �� x�� �ʵ��� ���� �����ϴ� ��
		
		// ���ο� ����Ʈ ����
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		// ���ο� ����Ʈ ��ȯ
		return pnt;
	}
	
}
