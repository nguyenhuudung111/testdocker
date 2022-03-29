package FTV.Request;

public class Respone {
	private Object po_data;
	private String po_err;
	private long po_total;
	private String po_desc;
	public Respone() {
		
	}
	public Respone(Object po_data, String po_err, int po_total, String po_desc) {
		this.po_data = po_data;
		this.po_err = po_err;
		this.po_total = po_total;
		this.po_desc = po_desc;
	}
	public Object getPo_data() {
		return po_data;
	}
	public void setPo_data(Object po_data) {
		this.po_data = po_data;
	}
	public String getPo_err() {
		return po_err;
	}
	public void setPo_err(String po_err) {
		this.po_err = po_err;
	}
	public long getPo_total() {
		return po_total;
	}
	public void setPo_total(long po_total) {
		this.po_total = po_total;
	}
	public String getPo_desc() {
		return po_desc;
	}
	public void setPo_desc(String po_desc) {
		this.po_desc = po_desc;
	}

}
