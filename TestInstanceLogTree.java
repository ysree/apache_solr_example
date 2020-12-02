package com.ysree.sparc.entity.solr;

import java.util.ArrayList;
import java.util.List;

public class TestInstanceLogTree {
	private TestInstanceLog startTestLog;
	private TestInstanceLog endTestLog;

	private List<TestInstanceLogTree> testLogTreeList = new ArrayList<>();

	public TestInstanceLogTree() {
		super();
	}

	public TestInstanceLogTree(TestInstanceLog startTestLog) {
		super();
		this.startTestLog = startTestLog;
	}

	public TestInstanceLog getStartTestLog() {
		return startTestLog;
	}

	public void setStartTestLog(TestInstanceLog startTestLog) {
		this.startTestLog = startTestLog;
	}

	public TestInstanceLog getEndTestLog() {
		return endTestLog;
	}

	public void setEndTestLog(TestInstanceLog endTestLog) {
		this.endTestLog = endTestLog;
	}

	public List<TestInstanceLogTree> getTestLogTreeList() {
		return testLogTreeList;
	}

	public void addTestLogTree(TestInstanceLogTree testLogTree) {
		this.testLogTreeList.add(testLogTree);
	}

	@Override
	public String toString() {
		return "TestLogTree [startTestLog=" + startTestLog + ", endTestLog=" + endTestLog + ", testLogTreeList="
				+ testLogTreeList + "]";
	}

}
