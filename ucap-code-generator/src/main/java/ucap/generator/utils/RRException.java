package ucap.generator.utils;

/**
 * 自定义异常
 * @Title: RRException.java
 * @Description: TODO
 * @Package com.bloom.utils
 * @Author: wangyun
 * @Date: 2018年5月8日
 * @Copyright: 四川国际招标有限责任公司 注意：本内容仅限于必朗科技内部传阅，禁止外泄以及用于其他的商业目的
 */
public class RRException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
    private String msg;
    private int code = 500;
    
    public RRException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public RRException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}
	
	public RRException(String msg, int code) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}
	
	public RRException(String msg, int code, Throwable e) {
		super(msg, e);
		this.msg = msg;
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
