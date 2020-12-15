package com.fullstack.oops.srp.personnel;

public class ServiceLicenseAgreement {
	
	private final int minUptimePercent;
	private final int problemResolutionTimeDays;
	public ServiceLicenseAgreement(int minUptimePercent, int problemResolutionTimeDays) {
		this.minUptimePercent = minUptimePercent;
		this.problemResolutionTimeDays = problemResolutionTimeDays;
	}
	public int getMinUptimePercent() {
		return minUptimePercent;
	}
	public int getProblemResolutionTimeDays() {
		return problemResolutionTimeDays;
	}
	
	
	
	
	
	
	
	

}
