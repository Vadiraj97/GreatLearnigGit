package com.greatlearning.corejava;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDepartment ad = new AdminDepartment();
		System.out.println("Welcom to"+ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println();
		HRDepartment hr = new HRDepartment();
		System.out.println("Welcom to"+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcom to"+hr.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		
		
	}

}
