package com.EATnBITE.mvc.dao;

import java.util.List;

import com.EATnBITE.mvc.model.Job;

public interface JobDao {
	void postJob(Job job);
	List<Job> getAllJobs();
	Job getJobDetail(int jobId);
}
