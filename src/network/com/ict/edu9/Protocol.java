package network.com.ict.edu9;

import java.io.Serializable;
import java.util.List;

import network.com.ict.edu9_db.VO;

public class Protocol implements Serializable{
	int cmd ;
	int result ;
	List<VO> list;
	VO vo ;
	
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public List<VO> getList() {
		return list;
	}
	public void setList(List<VO> list) {
		this.list = list;
	}
	public VO getVo() {
		return vo;
	}
	public void setVo(VO vo) {
		this.vo = vo;
	}
	
	
}
