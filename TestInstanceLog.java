package com.ysree.entity.solr;

import java.util.Date;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "test_logging")
public class TestInstanceLog {

	@Id
	private String id;

	@Field
	@Indexed(name = "testInstanceId", type = "plong")
	private Long testInstanceId;

	@Field
	@Indexed(name = "method", type = "string")
	private String method;

	@Field
	@Indexed(name = "arguments", type = "string")
	private String arguments;

	@Field
	@Indexed(name = "methodType", type = "string")
	private String methodType;

	@Field
	@Indexed(name = "logType", type = "string")
	private String logType;

	@Field
	@Indexed(name = "duration", type = "plong")
	private Long duration;

	@Field
	@Indexed(name = "time", type = "pdate")
	private Date time;

	@Field
	@Indexed(name = "status", type = "string")
	private String status;

	@Field
	@Indexed(name = "seq", type = "plong")
	private Long seq;

	@Field
	@Indexed(name = "iteration", type = "plong")
	private Long iteration;

	private boolean isKeep = true;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getTestInstanceId() {
		return testInstanceId;
	}

	public void setTestInstanceId(Long testInstanceId) {
		this.testInstanceId = testInstanceId;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getArguments() {
		return arguments;
	}

	public void setArguments(String arguments) {
		this.arguments = arguments;
	}

	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getSeq() {
		return seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public Long getIteration() {
		return iteration;
	}

	public void setIteration(Long iteration) {
		this.iteration = iteration;
	}

	public boolean isKeep() {
		return isKeep;
	}

	public void setKeep(boolean isKeep) {
		this.isKeep = isKeep;
	}

	@Override
	public String toString() {
		return "TestInstanceLog [id=" + id + ", testInstanceId=" + testInstanceId + ", method=" + method
				+ ", arguments="
				+ arguments + ", methodType=" + methodType + ", logType=" + logType + ", duration=" + duration
				+ ", time=" + time + ", status=" + status + ", seq=" + seq + ", iteration=" + iteration + ", isKeep="
				+ isKeep + "]";
	}

}
