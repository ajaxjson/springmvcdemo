package com.model.entities;


//import javax.persistence.Entity;
//import javax.persistence.Id;


//@Entity
public class Student {
    
	//@Id
    // private int ST_ID;
    
    
	//@NotBlank(message = "Code is mandatory")
    private String ST_CODE;
    
    //@NotBlank(message = "Name is mandatory")
    private String ST_NAME;
    
   
   // @NotBlank(message = "EMAIL is mandatory")
    private String ST_EMAIL;
    
    private String ST_REMARK;
    
    private String ST_Scholarship;
    
//    
//    public int getST_ID() {
//		return ST_ID;
//	}
//
//
//	public void setST_ID(int sT_ID) {
//		ST_ID = sT_ID;
//	}


	public String getST_CODE() {
		return ST_CODE;
	}


	public void setST_CODE(String sT_CODE) {
		ST_CODE = sT_CODE;
	}


	public String getST_NAME() {
		return ST_NAME;
	}


	public void setST_NAME(String sT_NAME) {
		ST_NAME = sT_NAME;
	}


	public String getST_EMAIL() {
		return ST_EMAIL;
	}


	public void setST_EMAIL(String sT_EMAIL) {
		ST_EMAIL = sT_EMAIL;
	}


	public String getST_REMARK() {
		return ST_REMARK;
	}


	public void setST_REMARK(String sT_REMARK) {
		ST_REMARK = sT_REMARK;
	}


	public String getST_Scholarship() {
		return ST_Scholarship;
	}


	public void setST_Scholarship(String sT_Scholarship) {
		ST_Scholarship = sT_Scholarship;
	}

	
    
	public Student() {
		super();
	}
//   
//
//    public Student(String ST_CODE, String ST_NAME , String ST_EMAIL, String ST_REMARK, String ST_Scholarship) {
//        this.ST_CODE = ST_CODE;
//        this.ST_NAME = ST_NAME;
//        this.ST_EMAIL = ST_EMAIL;
//        this.ST_Scholarship = ST_Scholarship;
//        this.ST_REMARK = ST_REMARK;
//        
//    }
//    
//    @Override
//    public String toString() {
//        return "Student{" + "ST_ID=" + ST_ID + ", ST_NAME=" + ST_NAME + ", ST_EMAIL=" + ST_EMAIL + ", ST_REMARK=" + ST_REMARK + ", ST_Scholarship=" + ST_Scholarship  + '}';
//    }
}

