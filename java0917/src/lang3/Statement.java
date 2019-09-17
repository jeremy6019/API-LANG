package lang3;

public class Statement {

	 private int writeNo; 
	 private String writeTitle; 
	 private String writer; 
	 private String writeDate;
	 
	public int getWriteNo() {
		return writeNo;
	}
	public void setWriteNo(int writeNo) {
		this.writeNo = writeNo;
	}
	public String getWriteTitle() {
		return writeTitle;
	}
	public void setWriteTitle(String writeTitle) {
		this.writeTitle = writeTitle;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "Statement [writeNo=" + writeNo + ", writeTitle=" + writeTitle + ", writer=" + writer + ", writeDate="
				+ writeDate + "]";
	} 
	 
	 
	 
}
