package FTV.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DM_TRIEN_KHAI")
public class DM_TRIEN_KHAI {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name="MO_TA")
	private String moTa;
	
	@Column(name="TRIEN_KHAI_TOAN_NGANH")
	private float tKTN;
	
	@Column(name="GHI_CHU")
	private String ghiChu;
	
	@Column(name="DUONG_DAN")
	private String duongDan;
	
	@Column(name="MA_DOT_TRIEN_KHAI")
	private String mDTK;
	
	@Column(name="TEN")
	private String ten;

	@Column(name="NGAY_TAO")
	private String ngayTao;
	
	@Column(name="NGUOI_TAO")
	private String nguoiTao;
	
	@Column(name="NGAY_SUA")
	private String ngaySua;
	
	@Column(name="NGUOI_SUA")
	private String nguoiSua;
	
	public DM_TRIEN_KHAI()
	{
		
	}
	
	public DM_TRIEN_KHAI(String id,String moTa, float tKTN, String ghiChu, String duongDan,
			String mDTK, String ten, String ngayTao, String nguoiTao, String ngaySua, String nguoiSua)
	{
		this.id=id;
		this.moTa = moTa;
		this.tKTN=tKTN;
		this.ghiChu=ghiChu;
		this.duongDan=duongDan;
		this.mDTK=mDTK;
		this.ten=ten;
		this.ngayTao=ngayTao;
		this.ngaySua=ngaySua;
		this.nguoiTao=nguoiTao;
		this.nguoiSua=nguoiSua;
		
	}
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public float gettKTN() {
		return tKTN;
	}
	public void settKTN(float tKTN) {
		this.tKTN = tKTN;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public String getDuongDan() {
		return duongDan;
	}
	public void setDuongDan(String duongDan) {
		this.duongDan = duongDan;
	}
	public String getmDTK() {
		return mDTK;
	}
	public void setmDTK(String mDTK) {
		this.mDTK = mDTK;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNgayTao() {
		return ngayTao;
	}
	public void setNgayTao(String ngayTao) {
		this.ngayTao = ngayTao;
	}
	public String getNguoiTao() {
		return nguoiTao;
	}
	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}
	public String getNgaySua() {
		return ngaySua;
	}
	public void setNgaySua(String ngaySua) {
		this.ngaySua = ngaySua;
	}
	public String getNguoiSua() {
		return nguoiSua;
	}
	public void setNguoiSua(String nguoiSua) {
		this.nguoiSua = nguoiSua;
	}
	
	
	

}
