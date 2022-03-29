package FTV.Respone;

import java.sql.Date;

public class Request {
	private String id;
	private String maDotTrienKhai;
	private String ten;
	private String nguoiTao;
	private Date ngayTaoBD;
	private Date ngayTaoKT;
	private int Page_Number;
	private int Page_Size;
	
	public Request() {
		
	}
	
	public Request(String id, String maDotTrienKhai, String ten, String nguoiTao, Date ngayTaoBD,
			Date ngayTaoKT, int page_Number, int page_Size) {
		super();
		this.id = id;
		this.maDotTrienKhai = maDotTrienKhai;
		this.ten = ten;
		this.nguoiTao = nguoiTao;
		this.ngayTaoBD = ngayTaoBD;
		this.ngayTaoKT = ngayTaoKT;
		Page_Number = page_Number;
		Page_Size = page_Size;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMaDotTrienKhai() {
		return maDotTrienKhai;
	}

	public void setMaDotTrienKhai(String maDotTrienKhai) {
		this.maDotTrienKhai = maDotTrienKhai;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNguoiTao() {
		return nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	public Date getNgayTaoBD() {
		return ngayTaoBD;
	}

	public void setNgayTaoBD(Date ngayTaoBD) {
		this.ngayTaoBD = ngayTaoBD;
	}

	public Date getNgayTaoKT() {
		return ngayTaoKT;
	}

	public void setNgayTaoKT(Date ngayTaoKT) {
		this.ngayTaoKT = ngayTaoKT;
	}

	public int getPage_Number() {
		return Page_Number;
	}

	public void setPage_Number(int page_Number) {
		Page_Number = page_Number;
	}

	public int getPage_Size() {
		return Page_Size;
	}

	public void setPage_Size(int page_Size) {
		Page_Size = page_Size;
	}
	
	

}
