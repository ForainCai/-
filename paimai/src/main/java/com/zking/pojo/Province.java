package com.zking.pojo;

public class Province {
    private Integer pid;

    private String pname;
    
    
    
    public Province() {
		// TODO Auto-generated constructor stub
	}

    public Province(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

	@Override
	public String toString() {
		return "Province [pid=" + pid + ", pname=" + pname + "]";
	}
    
    
}